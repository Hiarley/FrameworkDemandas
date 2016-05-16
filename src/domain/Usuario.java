/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.ClienteInvalidoException;

/**
 *
 * @author hiarl
 */
public class Usuario extends Cliente{
    private boolean administrador;

    public Usuario() {
    }

    public Usuario(long idCliente, String nome, String endereco, String telefone, String login, String senha) {
        super(idCliente, nome, endereco, telefone, login, senha);
    }

    /**
     * @return the administrador
     */
    public boolean isAdministrador() {
        return administrador;
    }

    /**
     * @param administrador the administrador to set
     */
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Override
    public boolean validar() throws ClienteInvalidoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
