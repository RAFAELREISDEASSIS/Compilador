/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.node;

import meuprojetoLFT.analysis.*;

@SuppressWarnings("nls")
public final class TMeuregistro extends Token
{
    public TMeuregistro()
    {
        super.setText("registro");
    }

    public TMeuregistro(int line, int pos)
    {
        super.setText("registro");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TMeuregistro(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMeuregistro(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMeuregistro text.");
    }
}
