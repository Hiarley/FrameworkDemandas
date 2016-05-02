/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hiarl
 */
public class Demanda {
    private long idDemanda;
    private Date dataAbertura;
    private Usuario usuarioSolicitante;
    private ArrayList<Historico> listaHistoricoDemanda;
    private String descricao;
    private char status;
    private ArrayList<Produto> listaProdutos;

    public Demanda() {
    }

    public Demanda(long idDemanda, Date dataAbertura, Usuario usuarioSolicitante, ArrayList<Historico> listaHistoricoDemanda, String descricao, char status, ArrayList<Produto> listaProdutos) {
        this.idDemanda = idDemanda;
        this.dataAbertura = dataAbertura;
        this.usuarioSolicitante = usuarioSolicitante;
        this.listaHistoricoDemanda = listaHistoricoDemanda;
        this.descricao = descricao;
        this.status = status;
        this.listaProdutos = listaProdutos;
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
     * @return the listaHistoricoDemanda
     */
    public ArrayList<Historico> getListaHistoricoDemanda() {
        return listaHistoricoDemanda;
    }

    /**
     * @param listaHistoricoDemanda the listaHistoricoDemanda to set
     */
    public void setListaHistoricoDemanda(ArrayList<Historico> listaHistoricoDemanda) {
        this.listaHistoricoDemanda = listaHistoricoDemanda;
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
