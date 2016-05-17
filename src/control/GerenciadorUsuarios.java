/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoUsuarioPadrao;
import dao.IDaoUsuarioPadrao;
import domain.Usuario;
import domain.UsuarioPadrao;
import excecao.ClienteInvalidoException;
import excecao.UsuarioInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorUsuarios {
    private IDaoUsuarioPadrao daoUsuario;

    public GerenciadorUsuarios() {
        this.daoUsuario = DaoUsuarioPadrao.getInstance();
    }

    public void cadastrarUsuario(UsuarioPadrao usuario) throws UsuarioInvalidoException{
        if(usuario.validar()) {
            this.daoUsuario.adicionarUsuario(usuario);
        }
    }

    public void removerUsuario(UsuarioPadrao usuario) {
        this.daoUsuario.removerUsuario(usuario);
    }

    public void atualizarUsuario(UsuarioPadrao usuario){
        this.daoUsuario.atualizarUsuario(usuario);
    }
    
    public ArrayList<UsuarioPadrao> listarUsuarios(){
        return this.daoUsuario.listarUsuarios();
    }

    public UsuarioPadrao getUsuario(long id) {
        return this.daoUsuario.pegarUsuario(id);
    }
    
}
