/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeucaso extends Token
{
    public TMeucaso()
    {
        super.setText("caso");
    }

    public TMeucaso(int line, int pos)
    {
        super.setText("caso");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeucaso(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeucaso(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeucaso text.");
    }
}
