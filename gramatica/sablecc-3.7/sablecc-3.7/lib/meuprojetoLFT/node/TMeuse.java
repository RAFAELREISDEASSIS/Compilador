/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeuse extends Token
{
    public TMeuse()
    {
        super.setText("se");
    }

    public TMeuse(int line, int pos)
    {
        super.setText("se");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeuse(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeuse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeuse text.");
    }
}