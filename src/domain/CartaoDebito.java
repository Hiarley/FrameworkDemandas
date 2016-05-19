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
public class CartaoDebito extends Pagamento{
    private int numeroCartao;
    private String  Banco;

    public CartaoDebito() {
    }

    public CartaoDebito(int numeroCartao, String Banco, String nome, double valor) {
        super(nome, valor);
        this.numeroCartao = numeroCartao;
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
