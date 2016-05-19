/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Thiago
 */
public class BoletoBancario extends Pagamento{
    private Date vencimentoBoleto;
    private int linhaDigitavel;
    private int codigoBanco;

    public BoletoBancario() {
    }

    public BoletoBancario(Date vencimentoBoleto, int linhaDigitavel, int codigoBanco, long idPagamento, String nome, double valor) {
        super(idPagamento, nome, valor);
        this.vencimentoBoleto = vencimentoBoleto;
        this.linhaDigitavel = linhaDigitavel;
        this.codigoBanco = codigoBanco;
    }

    

    /**
     * @return the vencimentoBoleto
     */
    public Date getVencimentoBoleto() {
        return vencimentoBoleto;
    }

    /**
     * @param vencimentoBoleto the vencimentoBoleto to set
     */
    public void setVencimentoBoleto(Date vencimentoBoleto) {
        this.vencimentoBoleto = vencimentoBoleto;
    }

    /**
     * @return the linhaDigitavel
     */
    public int getLinhaDigitavel() {
        return linhaDigitavel;
    }

    /**
     * @param linhaDigitavel the linhaDigitavel to set
     */
    public void setLinhaDigitavel(int linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    /**
     * @return the codigoBanco
     */
    public int getCodigoBanco() {
        return codigoBanco;
    }

    /**
     * @param codigoBanco the codigoBanco to set
     */
    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }
    
    
}
