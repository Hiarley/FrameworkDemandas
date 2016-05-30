/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import domain.Pagamento;
import excecao.PagamentoInvalidoException;

/**
 *
 * @author Thiago
 */
public class CartaoCredito extends Pagamento{
    private int numeroCartao;
    private int numeroParcelas;
    private String  banco;
    
    public CartaoCredito() {
    }

    public CartaoCredito(int numeroCartao, int numeroParcelas, String Banco, long idPagamento, String nome, double valor) {
        super(idPagamento, nome, valor);
        this.numeroCartao = numeroCartao;
        this.numeroParcelas = numeroParcelas;
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
     * @return the numeroParcelas
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * @param numeroParcelas the numeroParcelas to set
     */
    public void setNumeroParcelas(int numeroParcelas) throws PagamentoInvalidoException {
        if(numeroParcelas < 0) throw new PagamentoInvalidoException("Numero invalido.");

        this.numeroParcelas = numeroParcelas;
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
