/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoUsuario;
import dao.IDaoUsuario;
import domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorUsuarios {
    private DaoUsuario daoUsuario;

    public GerenciadorUsuarios() {
        daoUsuario = daoUsuario.getInstance();
    }

    public void cadastrarUsuario(Usuario usuario){
        if(usuario.validarUsuario()) {
            this.daoUsuario.adicionarUsuario(usuario);
        }
    }

    public void removerUsuario(Usuario usuario) {
        this.daoUsuario.removerUsuario(usuario);
    }

    public void atualizarUsuario(Usuario usuario){
        this.daoUsuario.atualizarUsuario(usuario);
    }
    
    public ArrayList<Usuario> listarUsuarios(){
        return this.daoUsuario.listarUsuarios();
    }

    public Usuario getUsuario(String login) {
        return this.daoUsuario.pegarUsuario(login);
    }
    
}
