/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import domain.Demanda;
import excecao.DemandaInvalidoException;

/**
 * Será usado para fazer um builder.
 * @author Thiago
 */
public class Servico extends Demanda{
    
    private String empresaFornecedora;

    public Servico() {
    }

    public Servico(String empresaFornecedora, String nome, double preco, String descricao, String prazo) {
        super(nome, preco, descricao, prazo);
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
    public void setEmpresaFornecedora(String empresaFornecedora) throws DemandaInvalidoException {
        if(!(empresaFornecedora instanceof String)) throw new DemandaInvalidoException("Invalido!");
        this.empresaFornecedora = empresaFornecedora;
    }

    @Override
    public boolean validar() {
        if(this.empresaFornecedora == "America")
            return true;
        else if(this.empresaFornecedora == "Coca-Cola")
            return true;
        else if(this.empresaFornecedora == "MicroInformatica LTDA")
            return true;
        else
            return false;
    }
    
    
}
