/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeuvariavel extends Token
{
    public TMeuvariavel()
    {
        super.setText("var");
    }

    public TMeuvariavel(int line, int pos)
    {
        super.setText("var");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeuvariavel(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeuvariavel(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeuvariavel text.");
    }
}
