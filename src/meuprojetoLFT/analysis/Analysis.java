/* This file was generated by SableCC (http://www.sablecc.org/). */

package meuprojetoLFT.analysis;

import meuprojetoLFT.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTMeufim(TMeufim node);
    void caseTUltimofim(TUltimofim node);
    void caseTMeufaca(TMeufaca node);
    void caseTMeuate(TMeuate node);
    void caseTMeuenquanto(TMeuenquanto node);
    void caseTMeupara(TMeupara node);
    void caseTMeurepita(TMeurepita node);
    void caseTVariavel(TVariavel node);
    void caseTMeuinicio(TMeuinicio node);
    void caseTMeuprograma(TMeuprograma node);
    void caseTMeutipo(TMeutipo node);
    void caseTMeuregistro(TMeuregistro node);
    void caseTReal(TReal node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTMeuse(TMeuse node);
    void caseTMeusenao(TMeusenao node);
    void caseTMeucaso(TMeucaso node);
    void caseTMeufimSe(TMeufimSe node);
    void caseTMeufimPara(TMeufimPara node);
    void caseTMeufimEnquanto(TMeufimEnquanto node);
    void caseTMeufimRepita(TMeufimRepita node);
    void caseTEspacoembranco(TEspacoembranco node);
    void caseTMeusnumeros(TMeusnumeros node);
    void caseTMeuatribuicao(TMeuatribuicao node);
    void caseTMeufimLinha(TMeufimLinha node);
    void caseTMeuParentEsq(TMeuParentEsq node);
    void caseTMeuParentDir(TMeuParentDir node);
    void caseTMeuColcheEsq(TMeuColcheEsq node);
    void caseTMeuColcheDir(TMeuColcheDir node);
    void caseTMeudoispontos(TMeudoispontos node);
    void caseTMeusmais(TMeusmais node);
    void caseTMeusmenos(TMeusmenos node);
    void caseTMeumultiplicacao(TMeumultiplicacao node);
    void caseTMeusdivisao(TMeusdivisao node);
    void caseTMeumenorque(TMeumenorque node);
    void caseTMeumenorigual(TMeumenorigual node);
    void caseTMeumaiorque(TMeumaiorque node);
    void caseTMeumaiorigual(TMeumaiorigual node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTMeuigual(TMeuigual node);
    void caseTMeuidentificador(TMeuidentificador node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
