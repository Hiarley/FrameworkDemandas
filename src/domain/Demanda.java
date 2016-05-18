/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.DemandaInvalidoException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hiarl
 */
public abstract class Demanda {
    private long idUsuarioSolicitante;
    private long idDemanda;
    private Date dataAbertura;
    private long idUsuarioDemandando;
    private String descricao;
    private char status;
    private ArrayList<Produto> listaProdutos;

    public Demanda() {
    }

    public Demanda(long idUsuarioSolicitante, long idDemanda, Date dataAbertura, long idUsuarioDemandando, String descricao, char status, ArrayList<Produto> listaProdutos) {
        this.idUsuarioSolicitante = idUsuarioSolicitante;
        this.idDemanda = idDemanda;
        this.dataAbertura = dataAbertura;
        this.idUsuarioDemandando = idUsuarioDemandando;
        this.descricao = descricao;
        this.status = status;
        this.listaProdutos = listaProdutos;
    }

    /**
     * @return the idUsuarioSolicitante
     */
    public long getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    /**
     * @param idUsuarioSolicitante the idUsuarioSolicitante to set
     */
    public void setIdUsuarioSolicitante(long idUsuarioSolicitante) {
        this.idUsuarioSolicitante = idUsuarioSolicitante;
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
     * @return the idUsuarioDemandando
     */
    public long getIdUsuarioDemandando() {
        return idUsuarioDemandando;
    }

    /**
     * @param idUsuarioDemandando the idUsuarioDemandando to set
     */
    public void setIdUsuarioDemandando(long idUsuarioDemandando) {
        this.idUsuarioDemandando = idUsuarioDemandando;
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

    /**
     * @return the listaProdutos
     */
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    /**
     * @param listaProdutos the listaProdutos to set
     */
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    
}
