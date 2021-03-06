/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.analysis;

import java.util.*;
import meuprojetoLFT.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseTMeuprograma(TMeuprograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuleia(TMeuleia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuescreva(TMeuescreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufim(TMeufim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuultimofim(TMeuultimofim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufaca(TMeufaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeude(TMeude node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuate(TMeuate node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuenquanto(TMeuenquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeupasso(TMeupasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeupara(TMeupara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeurepita(TMeurepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuvariavel(TMeuvariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuinicio(TMeuinicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeutipo(TMeutipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuregistro(TMeuregistro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeureal(TMeureal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuinteiro(TMeuinteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeucaractere(TMeucaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuse(TMeuse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuentao(TMeuentao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeusenao(TMeusenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeucaso(TMeucaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuavalie(TMeuavalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufimavalie(TMeufimavalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufimSe(TMeufimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufimPara(TMeufimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufimEnquanto(TMeufimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufimRepita(TMeufimRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeusnumeros(TMeusnumeros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuatribuicao(TMeuatribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeufimLinha(TMeufimLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuParentEsq(TMeuParentEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuParentDir(TMeuParentDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuColcheEsq(TMeuColcheEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuColcheDir(TMeuColcheDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuvirgula(TMeuvirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeupontos(TMeupontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeusmais(TMeusmais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeusmenos(TMeusmenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeumultiplicacao(TMeumultiplicacao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeusdivisao(TMeusdivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeumenorque(TMeumenorque node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeumenorigual(TMeumenorigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeumaiorque(TMeumaiorque node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeumaiorigual(TMeumaiorigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuigual(TMeuigual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeunao(TMeunao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeue(TMeue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuou(TMeuou node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuxor(TMeuxor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuconstante(TMeuconstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinhaaspassimples(TMinhaaspassimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuespacoembranco(TMeuespacoembranco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeuidentificador(TMeuidentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMeucomentarioLinha(TMeucomentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBloco(TComentarioBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioFim(TComentarioFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioCorpo(TComentarioCorpo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBarra(TBarra node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEstrela(TEstrela node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
