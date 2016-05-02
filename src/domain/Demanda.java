/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author hiarl
 */
public class Demanda {
    private long idDemanda;
    private Date dataAbertura;
    private Date ultimaModificacao;
    private Usuario usuarioSolicitante;
    private Setor setorDemandado;
    private Historico historicoDemanda;
    private String descricao;
    private char status;

    public Demanda() {
    }

    public Demanda(long idDemanda, Date dataAbertura, Date ultimaModificacao, Usuario usuarioSolicitante, Setor setorDemandado, Historico historicoDemanda, String descricao, char status) {
        this.idDemanda = idDemanda;
        this.dataAbertura = dataAbertura;
        this.ultimaModificacao = ultimaModificacao;
        this.usuarioSolicitante = usuarioSolicitante;
        this.setorDemandado = setorDemandado;
        this.historicoDemanda = historicoDemanda;
        this.descricao = descricao;
        this.status = status;
    }
    
    /**
     * @return the idDemanda
     */
    public long getIdDemanda() {
        return idDemanda;
    }

    /**
     * @param idDemanda the idDemanda to set
     */
    public void setIdDemanda(long idDemanda) {
        this.idDemanda = idDemanda;
    }

    /**
     * @return the dataAbertura
     */
    public Date getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * @return the ultimaModificacao
     */
    public Date getUltimaModificacao() {
        return ultimaModificacao;
    }

    /**
     * @param ultimaModificacao the ultimaModificacao to set
     */
    public void setUltimaModificacao(Date ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    /**
     * @return the usuarioSolicitante
     */
    public Usuario getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    /**
     * @param usuarioSolicitante the usuarioSolicitante to set
     */
    public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    /**
     * @return the setorDemandado
     */
    public Setor getSetorDemandado() {
        return setorDemandado;
    }

    /**
     * @param setorDemandado the setorDemandado to set
     */
    public void setSetorDemandado(Setor setorDemandado) {
        this.setorDemandado = setorDemandado;
    }

    /**
     * @return the historicoDemanda
     */
    public Historico getHistoricoDemanda() {
        return historicoDemanda;
    }

    /**
     * @param historicoDemanda the historicoDemanda to set
     */
    public void setHistoricoDemanda(Historico historicoDemanda) {
        this.historicoDemanda = historicoDemanda;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the status
     */
    public char getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
