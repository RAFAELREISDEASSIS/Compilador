/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeusenao extends Token
{
    public TMeusenao()
    {
        super.setText("senao");
    }

    public TMeusenao(int line, int pos)
    {
        super.setText("senao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeusenao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeusenao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeusenao text.");
    }
}