package com.educode.nodes.literal;

import com.educode.nodes.Typeable;
import com.educode.nodes.base.LeafNode;
import com.educode.types.Type;
import com.educode.visitors.VisitorBase;

/**
 * Created by zen on 3/23/17.
 */
public class StringLiteralNode extends LeafNode implements Typeable
{
    private String _value;

    public StringLiteralNode(String value)
    {
        this._value = value;
    }

    public String getValue()
    {
        return this._value;
    }

    @Override
    public Object accept(VisitorBase visitor)
    {
        return visitor.visit(this);
    }

    @Override
    public Type getType()
    {
        return Type.StringType;
    }

    @Override
    public void setType(Type type)
    {
    }
}
