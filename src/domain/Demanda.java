/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.ProdutoInvalidoException;
import java.util.Date;

/**
 *
 * @author Thiago
 */
public abstract class Demanda {
    private long idProduto;
    private String nome;
    private double preco;
    private String descricao;
    private String prazo;

    public Demanda() {
    }

    public Demanda(long idProduto, String nome, double preco, String descricao, String prazo) {
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
    public void setIdProduto(long idProduto) throws ProdutoInvalidoException {
    	if(idProduto < 0) throw new ProdutoInvalidoException("Id do produto Invalido");
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
    public void setNome(String nome) throws ProdutoInvalidoException {
        if(!(nome instanceof String)) throw new ProdutoInvalidoException("Nome invalido.");
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
    public void setPreco(double preco) throws ProdutoInvalidoException {
        if(preco < 0) throw new ProdutoInvalidoException("Preço invalido.");
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
    public void setDescricao(String descricao) throws ProdutoInvalidoException {
        if(!(descricao instanceof String)) throw new ProdutoInvalidoException("Descrição invalida.");

        this.descricao = descricao;
    }

    /**
     * @return the prazo
     */
    public String getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(String prazo) throws ProdutoInvalidoException {
        if(!(prazo instanceof String)) throw new ProdutoInvalidoException("Data invalida.");

        this.prazo = prazo;
    }
    
    
}
