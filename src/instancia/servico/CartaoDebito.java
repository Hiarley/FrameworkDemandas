/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import domain.Pagamento;
import excecao.PagamentoInvalidoException;

/**
 *
 * @author Thiago
 */
public class CartaoDebito extends Pagamento{
    private int numeroCartao;
    private String  banco;

    public CartaoDebito() {
    }

    public CartaoDebito(int numeroCartao, String banco, long idPagamento, String nome, double valor) {
        super(idPagamento, nome, valor);
        this.numeroCartao = numeroCartao;
        this.banco = banco;
    }

    

    /**
     * @return the numeroCartao
     */
    public int getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(int numeroCartao) throws PagamentoInvalidoException {
        if(numeroCartao < 0) throw new PagamentoInvalidoException("Numero invalido.");

        this.numeroCartao = numeroCartao;
    }

    /**
     * @return the Banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param Banco the Banco to set
     */
    public void setBanco(String banco) throws PagamentoInvalidoException {
        if(!(banco instanceof String)) throw new PagamentoInvalidoException("Invalido!");

        this.banco = banco;
    }
    
    
}
