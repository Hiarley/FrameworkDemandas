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
public abstract class Pagamento {
    private long idPagamento;
    private String nome;
    private double valor;

    public Pagamento() {
    }

    public Pagamento(long idPagamento, String nome, double valor) {
        this.idPagamento = idPagamento;
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * @return the idPagamento
     */
    public long getIdPagamento() {
        return idPagamento;
    }

    /**
     * @param idPagamento the idPagamento to set
     */
    public void setIdPagamento(long idPagamento) {
        this.idPagamento = idPagamento;
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
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean validarPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
