/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeuprograma extends Token
{
    public TMeuprograma()
    {
        super.setText("programa");
    }

    public TMeuprograma(int line, int pos)
    {
        super.setText("programa");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeuprograma(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeuprograma(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeuprograma text.");
    }
}