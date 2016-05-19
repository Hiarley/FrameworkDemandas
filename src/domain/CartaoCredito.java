/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Thiago
 */
public class CartaoCredito extends Pagamento{
    private int numeroCartao;
    private int numeroParcelas;
    private String  Banco;
    
    public CartaoCredito() {
    }

    public CartaoCredito(int numeroCartao, int numeroParcelas, String Banco, long idPagamento, String nome, double valor) {
        super(idPagamento, nome, valor);
        this.numeroCartao = numeroCartao;
        this.numeroParcelas = numeroParcelas;
        this.Banco = Banco;
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
    public void setNumeroCartao(int numeroCartao) {
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
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    /**
     * @return the Banco
     */
    public String getBanco() {
        return Banco;
    }

    /**
     * @param Banco the Banco to set
     */
    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    
    
    
}
