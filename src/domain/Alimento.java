/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 * Será usado para fazer um builder.
 * @author Thiago
 */
public abstract class Alimento extends Produto{
    
    private int quantidade;
    private String fornecedor;

    public Alimento() {
    }

    public Alimento(int quantidade, String fornecedor, long idProduto, String nome, double preco, String descricao, Date prazo) {
        super(idProduto, nome, preco, descricao, prazo);
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
