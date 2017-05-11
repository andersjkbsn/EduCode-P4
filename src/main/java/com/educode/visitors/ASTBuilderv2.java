package com.educode.visitors;

import com.educode.antlr.EduCodeBaseVisitor;
import com.educode.antlr.EduCodeParser;
import com.educode.events.EventTypeBase;
import com.educode.events.communication.ChatMessageEvent;
import com.educode.events.communication.EntityMessageReceivedEvent;
import com.educode.events.communication.StringMessageReceivedEvent;
import com.educode.events.entity.EntityDeathEvent;
import com.educode.events.entity.robot.RobotAttackedEvent;
import com.educode.events.entity.robot.RobotDeathEvent;
import com.educode.nodes.base.*;
import com.educode.nodes.expression.AdditionExpression;
import com.educode.nodes.expression.MultiplicationExpression;
import com.educode.nodes.expression.logic.AndExpressionNode;
import com.educode.nodes.expression.logic.EqualExpressionNode;
import com.educode.nodes.expression.logic.OrExpressionNode;
import com.educode.nodes.expression.logic.RelativeExpressionNode;
import com.educode.nodes.literal.*;
import com.educode.nodes.method.MethodDeclarationNode;
import com.educode.nodes.method.ParameterNode;
import com.educode.nodes.referencing.IReference;
import com.educode.nodes.referencing.IdentifierReferencingNode;
import com.educode.nodes.statement.AssignmentNode;
import com.educode.nodes.statement.ForEachNode;
import com.educode.nodes.statement.ReturnNode;
import com.educode.nodes.statement.VariableDeclarationNode;
import com.educode.nodes.statement.conditional.ConditionNode;
import com.educode.nodes.statement.conditional.IfNode;
import com.educode.nodes.statement.conditional.RepeatWhileNode;
import com.educode.nodes.ungrouped.*;
import com.educode.types.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

/**
 * Created by Thomas Buhl on 10/05/2017.
 */
public class ASTBuilderv2 extends EduCodeBaseVisitor<Node> {
    private static int _currentLineNumber = 0;

    private static void updateLineNumber(ParserRuleContext fromCtx)
    {
        ASTBuilderv2._currentLineNumber = fromCtx.getStart().getLine();
        // ASTBuilderv2._currentCharPosition = fromCtx.getStart().getCharPositionInLine();
    }

    public static int getLineNumber()
    {
        return ASTBuilderv2._currentLineNumber;
    }

    private LogicalOperator getLogicalOperator(String operator)
    {
        switch (operator)
        {
            case "equals":
                return LogicalOperator.Equals;
            case "not equals":
                return LogicalOperator.NotEquals;
            case "less than":
                return LogicalOperator.LessThan;
            case "less than or equals":
                return LogicalOperator.LessThanOrEquals;
            case "greater than":
                return LogicalOperator.GreaterThan;
            case "greater than or equals":
                return LogicalOperator.GreaterThanOrEquals;
            default:
                return LogicalOperator.Error;
        }
    }

    private ArithmeticOperator getArithmeticOperator(String operator)
    {
        switch (operator)
        {
            case "+":
                return ArithmeticOperator.Addition;
            case "-":
                return ArithmeticOperator.Subtraction;
            case "/":
                return ArithmeticOperator.Division;
            case "*":
                return ArithmeticOperator.Multiplication;
            case "modulo":
                return ArithmeticOperator.Modulo;
            default:
                return ArithmeticOperator.Error;
        }
    }


    private EventTypeBase getEventType(EduCodeParser.Event_typeContext ctx)
    {
        switch (ctx.getChild(0).getText())
        {
            case "robotDeath":
                return new RobotDeathEvent();
            case "robotAttacked":
                return new RobotAttackedEvent();
            case "entityDeath":
                return new EntityDeathEvent();
            case "chatMessage":
                return new ChatMessageEvent();
            case "stringMessageReceived":
                return new StringMessageReceivedEvent((NumberLiteralNode) visit(ctx.number_literal()));
            case "entityMessageReceived":
                return new EntityMessageReceivedEvent((NumberLiteralNode) visit(ctx.number_literal()));
        }

        return null;
    }

    private Type getType(EduCodeParser.Data_typeContext ctx)
    {
        if (ctx.data_type() != null)
            return new Type(getType(ctx.data_type()));
        else
            switch (ctx.getText())
            {
                case "string":
                    return Type.StringType;
                case "bool":
                    return Type.BoolType;
                case "number":
                    return Type.NumberType;
                case "Entity":
                    return Type.EntityType;
                case "Coordinates":
                    return Type.CoordinatesType;
                case "Item":
                    return Type.ItemType;
            }
        return Type.VoidType;
    }


    @Override
    public Node visitStart(EduCodeParser.StartContext ctx) {
        updateLineNumber(ctx);

        return new StartNode(visit(ctx.ulist), visit(ctx.pr));
    }

    @Override
    public Node visitUsings(EduCodeParser.UsingsContext ctx) {
        updateLineNumber(ctx);
        ArrayList<Node> Nodes = new ArrayList<>();

        for (EduCodeParser.IdentifierContext i: ctx.id) {
            Nodes.add(visitIdentifier(i));
        }
        return new UsingsNode(Nodes);
    }

    @Override
    public Node visitProgram(EduCodeParser.ProgramContext ctx) {
        updateLineNumber(ctx);

        ArrayList<Node> nodes = new ArrayList<>();

        // Add global variables
        for (EduCodeParser.Variable_declarationContext v : ctx.vl)
            nodes.add(visit(v));

        // Add event subscriptions
        for (EduCodeParser.Event_definitionContext e : ctx.el)
            nodes.add(visit(e));

        // Add method declarations
        for (EduCodeParser.Method_declarationContext m : ctx.ml)
            nodes.add(visit(m));

        return new ProgramNode(nodes, (IReference) visit(ctx.id));
    }

    @Override
    public Node visitEvent_definition(EduCodeParser.Event_definitionContext ctx) {
        return new EventDefinitionNode((IReference) visit(ctx.id), getEventType(ctx.event));
    }

    @Override
    public Node visitMethod_declaration(EduCodeParser.Method_declarationContext ctx) {

        updateLineNumber(ctx);

        Type returnType = Type.VoidType;
        if (ctx.type != null)
            returnType = getType(ctx.type);

        if (ctx.params != null)
            return new MethodDeclarationNode(visit(ctx.params), visit(ctx.body), (IReference) visit(ctx.id), returnType);
        else
            return new MethodDeclarationNode(null, visit(ctx.body), (IReference) visit(ctx.id), returnType);
    }

    @Override
    public Node visitArgument_list(EduCodeParser.Argument_listContext ctx) {
        updateLineNumber(ctx);

        ListNode node = new ListNode();
        for (EduCodeParser.ExpressionContext e : ctx.exprs)
            node.addChild(visit(e));

        return node;
    }

    @Override
    public Node visitParameter_list(EduCodeParser.Parameter_listContext ctx) {
        updateLineNumber(ctx);

        ListNode parameterCollection = new ListNode();

        for (EduCodeParser.ParameterContext p : ctx.params)
            parameterCollection.addChild(visit(p));

        return parameterCollection;
    }

    @Override
    public Node visitParameter(EduCodeParser.ParameterContext ctx) {
        updateLineNumber(ctx);

        return new ParameterNode((IReference) visit(ctx.id), getType(ctx.type));
    }

    @Override
    public Node visitStatement_list(EduCodeParser.Statement_listContext ctx) {
        updateLineNumber(ctx);

        ArrayList<Node> childStatements = new ArrayList<>();

        for (EduCodeParser.StatementContext statement : ctx.statements)
        {
            Node visitResult = visit(statement);

            // Some nodes (like variable declaration) will return a collection of nodes
            // Instead of adding the ListNode, we will add the contained nodes
            // We don't do this for NaryNode because some nodes (If-Node) can't be split up
            if (visitResult instanceof ListNode)
                childStatements.addAll(((NaryNode)visitResult).getChildren());
            else
                childStatements.add(visitResult);
        }

        return new BlockNode(childStatements);
    }

    @Override
    public Node visitStatement(EduCodeParser.StatementContext ctx) {
        updateLineNumber(ctx);

        return super.visitStmt(ctx); // Will pass to an appropriate statement.
    }

    @Override
    public Node visitIterative_statement(EduCodeParser.Iterative_statementContext ctx) {
        return super.visitIterative_statement(ctx);
    }

    @Override
    public Node visitBreak_statement(EduCodeParser.Break_statementContext ctx) {
        return super.visitBreak_statement(ctx);
    }

    @Override
    public Node visitContinue_statement(EduCodeParser.Continue_statementContext ctx) {
        return super.visitContinue_statement(ctx);
    }

    @Override
    public Node visitReturn_statement(EduCodeParser.Return_statementContext ctx) {
        updateLineNumber(ctx);

        if (ctx.expr() != null)
            return new ReturnNode(visit(ctx.expr()));
        else
            return new ReturnNode();
    }

    @Override
    public Node visitRepeat_statement(EduCodeParser.Repeat_statementContext ctx) {
        updateLineNumber(ctx);

        return new RepeatWhileNode(new ConditionNode(visit(ctx.logicExpr()), visit(ctx.stmts())));
    }

    @Override
    public Node visitIf_statement(EduCodeParser.If_statementContext ctx) {
        updateLineNumber(ctx);

        IfNode ifNode = new IfNode();

        // If there is an else block, skip the last block
        // There is an else block if there are fewer logical expressions than statements
        boolean hasElseBlock = ctx.logicExpr().size() < ctx.stmts().size();
        for (int i = 0; i < (hasElseBlock ? ctx.stmts().size() - 1 : ctx.stmts().size()); i++)
            ifNode.addChild(new ConditionNode(visit(ctx.logicExpr(i)), visit(ctx.stmts(i))));

        // If there is an else block, add it finally without a ConditionNode
        if (hasElseBlock)
            ifNode.addChild(visit(ctx.stmts(ctx.stmts().size() - 1)));

        return ifNode;
    }

    @Override
    public Node visitForeach_statement(EduCodeParser.Foreach_statementContext ctx) {
        return new ForEachNode((IReference) visit(ctx.ident()), getType(ctx.dataType()), visit(ctx.expr()), visit(ctx.stmts()));
    }

    @Override
    public Node visitVariable_declaration(EduCodeParser.Variable_declarationContext ctx) {
        updateLineNumber(ctx);

        ArrayList nodes = new ArrayList<>();

        // Add nodes without assignments.
        for (EduCodeParser.IdentContext i : ctx.ident())
            nodes.add(new VariableDeclarationNode((IReference) visit(i), getType(ctx.dataType())));

        // Add nodes with assignments
        for (EduCodeParser.AssignContext a : ctx.assign())
            nodes.add(new VariableDeclarationNode((AssignmentNode) visit(a), getType(ctx.dataType())));

        return new ListNode(nodes);
    }

    @Override
    public Node visitDeclarator(EduCodeParser.DeclaratorContext ctx) {
        return super.visitDeclarator(ctx);
    }

    @Override
    public Node visitExpression(EduCodeParser.ExpressionContext ctx) {
        updateLineNumber(ctx);

        return super.visitExpr(ctx);//visit(ctx.getChild(0));
    }

    @Override
    public Node visitAssignment_expression(EduCodeParser.Assignment_expressionContext ctx) {
        updateLineNumber(ctx);

        if (ctx.expr() != null) // Assign to expression
            return new AssignmentNode((IReference) visit(ctx.reference()), visit(ctx.expr()));

        System.out.println("Error at line " + ctx.getStart().getLine());
        System.out.println(ctx.getText());

        return null;
    }

    @Override
    public Node visitLogic_expression(EduCodeParser.Logic_expressionContext ctx) {
        updateLineNumber(ctx);

        return super.visitExpr(ctx);//visit(ctx.getChild(0));
    }

    @Override
    public Node visitOr_expression(EduCodeParser.Or_expressionContext ctx) {
        updateLineNumber(ctx);

        if (ctx.getChildCount() == 1)
            return visit(ctx.getChild(0));
        else if (ctx.getChildCount() == 3)
            return new OrExpressionNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)));

        System.out.println("Unexpected child count in or-expression");

        return null;
    }

    @Override
    public Node visitAnd_expression(EduCodeParser.And_expressionContext ctx) {
        updateLineNumber(ctx);

        if (ctx.getChildCount() == 1)
            return visit(ctx.getChild(0));
        else if (ctx.getChildCount() == 3)
            return new AndExpressionNode(visit(ctx.getChild(0)), visit(ctx.getChild(2)));

        System.out.println("Unexpected child count in and-expression");

        return null;
    }

    @Override
    public Node visitEquality_expression(EduCodeParser.Equality_expressionContext ctx) {
        if (ctx.getChildCount() == 1)
            return visit(ctx.getChild(0));
        else if (ctx.getChildCount() == 3)
            return new EqualExpressionNode(getLogicalOperator(ctx.EQUALOP().getText()), visit(ctx.getChild(0)), visit(ctx.getChild(2)));

        System.out.println("Unexpected child count in equals-expression");

        return null;
    }

    @Override
    public Node visitRelative_expression(EduCodeParser.Relative_expressionContext ctx) {
        updateLineNumber(ctx);

        if (ctx.getChildCount() == 1)
            return visit(ctx.getChild(0));
        else if (ctx.getChildCount() == 3)
            return new RelativeExpressionNode(getLogicalOperator(ctx.RELOP().getText()), visit(ctx.getChild(0)), visit(ctx.getChild(2)));

        System.out.println("Unexpected child count in relative-expression");

        return null;
    }

    @Override
    public Node visitArithmetic_expression(EduCodeParser.Arithmetic_expressionContext ctx) {
        updateLineNumber(ctx);

        if (ctx.getChildCount() == 1)
            return visit(ctx.term());
        else if (ctx.getChildCount() == 3)
            return new AdditionExpression(getArithmeticOperator(ctx.ADDOP().getText()), visit(ctx.arithExpr()), visit(ctx.term()));

        System.out.println("ArithError at line " + ctx.getStart().getLine());

        return null;
    }

    @Override
    public Node visitAdditive_expression(EduCodeParser.Additive_expressionContext ctx) {
        return super.visitAdditive_expression(ctx);
    }

    @Override
    public Node visitMultiplicative_expression(EduCodeParser.Multiplicative_expressionContext ctx) {
        updateLineNumber(ctx);

        if (ctx.getChildCount() == 1)
            return visit(ctx.factor());
        else if (ctx.getChildCount() == 3)
            return new MultiplicationExpression(getArithmeticOperator(ctx.MULTOP().getText()), visit(ctx.term()), visit(ctx.factor()));

        System.out.println("TermError at line " + ctx.getStart().getLine());

        return null;
    }

    @Override
    public Node visitFactor(EduCodeParser.FactorContext ctx) {
        updateLineNumber(ctx);

        if (ctx.parExpr() != null)
            return visit(ctx.parExpr());
        else if (ctx.literal() != null)
            return visit(ctx.literal());
        else if (ctx.methodC() != null)
            return visit(ctx.methodC());
        else if (ctx.negation() != null)
            return visit(ctx.negation());
        else if (ctx.boolLit() != null)
            return new BoolLiteralNode(Boolean.parseBoolean(ctx.getText()));
        else if (ctx.typeCast() != null)
            return visit(ctx.typeCast());
        else if (ctx.objInst() != null)
            return visit(ctx.objInst());

        System.out.println("FactError at line " + ctx.getStart().getLine());

        return null;
    }

    @Override
    public Node visitAccess(EduCodeParser.AccessContext ctx) {
        return super.visitAccess(ctx);
    }

    @Override
    public Node visitField_access(EduCodeParser.Field_accessContext ctx) {
        return super.visitField_access(ctx);
    }

    @Override
    public Node visitElement_access(EduCodeParser.Element_accessContext ctx) {
        return super.visitElement_access(ctx);
    }

    @Override
    public Node visitMethod_access(EduCodeParser.Method_accessContext ctx) {
        return super.visitMethod_access(ctx);
    }

    @Override
    public Node visitSubfactor(EduCodeParser.SubfactorContext ctx) {
        return super.visitSubfactor(ctx);
    }

    @Override
    public Node visitParenthesis_expression(EduCodeParser.Parenthesis_expressionContext ctx) {
        return visit(ctx.logicExpr());
    }

    @Override
    public Node visitMethod_call(EduCodeParser.Method_callContext ctx) {
        return super.visitMethod_call(ctx);
    }

    @Override
    public Node visitType_cast(EduCodeParser.Type_castContext ctx) {
        return new TypeCastNode(getType(ctx.dataType()), visit(ctx.factor()));
    }

    @Override
    public Node visitObject_instantiation(EduCodeParser.Object_instantiationContext ctx) {
        Type classType = getType(ctx.dataType());

        if (ctx.args() != null)
            return new ObjectInstantiationNode(visit(ctx.args()), classType);
        else
            return new ObjectInstantiationNode(null, classType);
    }

    @Override
    public Node visitEvent_type(EduCodeParser.Event_typeContext ctx) {
        return super.visitEvent_type(ctx);
    }

    @Override
    public Node visitData_type(EduCodeParser.Data_typeContext ctx) {
        return null;
    }

    @Override
    public Node visitLiteral(EduCodeParser.LiteralContext ctx) {
        updateLineNumber(ctx);

        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitString_literal(EduCodeParser.String_literalContext ctx) {
        return new StringLiteralNode(ctx.STRLIT().getText());
    }

    @Override
    public Node visitCoordinate_literal(EduCodeParser.Coordinate_literalContext ctx) {
        return new CoordinatesLiteralNode(visit(ctx.logicExpr(0)), visit(ctx.logicExpr(1)), visit(ctx.logicExpr(2)));
    }

    @Override
    public Node visitNumber_literal(EduCodeParser.Number_literalContext ctx) {
        return new NumberLiteralNode(Float.parseFloat(ctx.getText()));
    }

    @Override
    public Node visitBool_literal(EduCodeParser.Bool_literalContext ctx) {
        updateLineNumber(ctx);

        return new BoolLiteralNode(ctx.TRUE() != null);
    }

    @Override
    public Node visitNull_literal(EduCodeParser.Null_literalContext ctx) {
        return super.visitNull_literal(ctx);
    }

    @Override
    public Node visitIdentifier(EduCodeParser.IdentifierContext ctx) {
        updateLineNumber(ctx);

        return new IdentifierReferencingNode(ctx.IDENT().getText());
    }

    @Override
    public Node visitEnd_of_line(EduCodeParser.End_of_lineContext ctx) {
        return null;
    }
}
