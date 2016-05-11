/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoUsuario {
    
    public void adicionarUsuario(Usuario usuario);
    public void removerUsuario(Usuario usuario);
    public void atualizarUsuario(Usuario usuario);
    public Usuario pegarUsuario(String login);
    public ArrayList<Usuario> listarUsuarios();

    public IDaoUsuario getInstance();
         
}
