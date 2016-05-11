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
public class Historico {
    private long idHistorico;
    private Date dataModificaco;
    private String descricao;
    private Usuario usuarioSolicitante;

    public Historico() {
    }

    public Historico(long idHistorico, Date dataModificaco, String descricao, Usuario usuarioSolicitante) {
        this.idHistorico = idHistorico;
        this.dataModificaco = dataModificaco;
        this.descricao = descricao;
        this.usuarioSolicitante = usuarioSolicitante;
    }
    
    

    /**
     * @return the idHistorico
     */
    public long getIdHistorico() {
        return idHistorico;
    }

    /**
     * @param idHistorico the idHistorico to set
     */
    public void setIdHistorico(long idHistorico) {
        this.idHistorico = idHistorico;
    }

    /**
     * @return the dataModificaco
     */
    public Date getDataModificaco() {
        return dataModificaco;
    }

    /**
     * @param dataModificaco the dataModificaco to set
     */
    public void setDataModificaco(Date dataModificaco) {
        this.dataModificaco = dataModificaco;
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

    public boolean validarHistorico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
