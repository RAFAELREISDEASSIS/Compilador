/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeudivisao extends Token
{
    public TMeudivisao()
    {
        super.setText("/");
    }

    public TMeudivisao(int line, int pos)
    {
        super.setText("/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeudivisao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeudivisao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeudivisao text.");
    }
}