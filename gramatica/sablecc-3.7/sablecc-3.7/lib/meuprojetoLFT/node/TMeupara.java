/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeupara extends Token
{
    public TMeupara()
    {
        super.setText("para");
    }

    public TMeupara(int line, int pos)
    {
        super.setText("para");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeupara(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeupara(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeupara text.");
    }
}
