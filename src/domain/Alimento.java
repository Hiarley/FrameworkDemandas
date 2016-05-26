/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.ProdutoInvalidoException;
import java.util.Date;

/**
 * Será usado para fazer um builder.
 * @author Thiago
 */
public class Alimento extends Demanda{
    
    private int quantidade;
    private String fornecedor;

    public Alimento() {
    }

    public Alimento(int quantidade, String fornecedor, String nome, double preco, String descricao, String prazo) {
        super( nome, preco, descricao, prazo);
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
    public void setQuantidade(int quantidade) throws ProdutoInvalidoException {
        if(quantidade < 0) throw new ProdutoInvalidoException("Quantidade errada.");
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
    public void setFornecedor(String fornecedor) throws ProdutoInvalidoException {
        if(!(fornecedor instanceof String)) throw new ProdutoInvalidoException("Invalido!");
        this.fornecedor = fornecedor;
    }
    
    
}
