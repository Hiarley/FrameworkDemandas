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
public class UsuarioCliente extends Usuario{
     
    public  boolean validar() throws ClienteInvalidoException{
        return true;
    }

}