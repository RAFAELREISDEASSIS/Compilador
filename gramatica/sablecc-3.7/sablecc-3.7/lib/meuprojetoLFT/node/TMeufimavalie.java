/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeufimavalie extends Token
{
    public TMeufimavalie()
    {
        super.setText("fim avalie");
    }

    public TMeufimavalie(int line, int pos)
    {
        super.setText("fim avalie");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeufimavalie(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeufimavalie(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeufimavalie text.");
    }
}
