/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import excecao.UsuarioInvalidoException;



/**
 *
 * @author hiarl
 */
public class UsuarioPadrao extends Usuario{
    
    private boolean administrador;

    public UsuarioPadrao(boolean administrador, long id, String nome, String endereco, String telefone, String login, String senha) {
        super(id, nome, endereco, telefone, login, senha);
        this.administrador = administrador;
    }
    
    public  boolean validar() throws UsuarioInvalidoException{
        return true;
    }
}
