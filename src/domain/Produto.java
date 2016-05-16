/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Thiago
 */
public abstract class Produto {
    private long idProduto;
    private String nome;
    private double preco;
    private String descricao;
    private Date prazo;

    public Produto() {
    }

    public Produto(long idProduto, String nome, double preco, String descricao, Date prazo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    /**
     * @return the idProduto
     */
    public long getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
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
     * @return the prazo
     */
    public Date getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public boolean validarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
