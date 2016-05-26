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
public class Item extends Demanda{
    
    private int quantidadeEmEstoque;

    public Item() {
    }

    public Item(int quantidadeEmEstoque, String nome, double preco, String descricao, String prazo) {
        super( nome, preco, descricao, prazo);
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    /**
     * @return the quantidadeEmEstoque
     */
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    /**
     * @param quantidadeEmEstoque the quantidadeEmEstoque to set
     */
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) throws ProdutoInvalidoException {
        if(quantidadeEmEstoque < 0) throw new ProdutoInvalidoException("Quantidade invalida.");
        
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    
    
}
