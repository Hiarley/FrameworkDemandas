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
public class Servico extends Demanda{
    
    private String empresaFornecedora;

    public Servico() {
    }

    public Servico(String empresaFornecedora, long idProduto, String nome, double preco, String descricao, String prazo) {
        super(idProduto, nome, preco, descricao, prazo);
        this.empresaFornecedora = empresaFornecedora;
    }

    /**
     * @return the empresaFornecedora
     */
    public String getEmpresaFornecedora() {
        return empresaFornecedora;
    }

    /**
     * @param empresaFornecedora the empresaFornecedora to set
     */
    public void setEmpresaFornecedora(String empresaFornecedora) throws ProdutoInvalidoException {
        if(!(empresaFornecedora instanceof String)) throw new ProdutoInvalidoException("Invalido!");
        this.empresaFornecedora = empresaFornecedora;
    }
    
    
}
