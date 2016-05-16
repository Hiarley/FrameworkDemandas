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
    
    public  boolean validar() throws UsuarioInvalidoException{
        return true;
    }
}
