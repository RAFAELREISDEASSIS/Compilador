/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeuescreva extends Token
{
    public TMeuescreva()
    {
        super.setText("escreva");
    }

    public TMeuescreva(int line, int pos)
    {
        super.setText("escreva");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeuescreva(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeuescreva(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeuescreva text.");
    }
}
