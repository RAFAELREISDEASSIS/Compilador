/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeupasso extends Token
{
    public TMeupasso()
    {
        super.setText("passo");
    }

    public TMeupasso(int line, int pos)
    {
        super.setText("passo");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeupasso(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeupasso(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeupasso text.");
    }
}