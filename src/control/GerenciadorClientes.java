/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoUsuarioCliente;
import dao.IDaoUsuarioCliente;
import domain.UsuarioCliente;
import excecao.ClienteInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorClientes {
    private IDaoUsuarioCliente daoCliente;

    public GerenciadorClientes() {
        daoCliente = DaoUsuarioCliente.getInstance();
    }

    public void cadastrarCliente(UsuarioCliente cliente) throws  ClienteInvalidoException {
        if(cliente.validar()) {
            this.daoCliente.adicionarUsuario(cliente);
        }
    }

    public void removerCliente(UsuarioCliente cliente) {
        this.daoCliente.removerUsuario(cliente);
    }

    public void atualizarCliente(UsuarioCliente cliente){
        this.daoCliente.atualizarUsuario(cliente);
    }
    
    public ArrayList<UsuarioCliente> listarClientes(){
        return this.daoCliente.listarUsuarios();
    }

    public UsuarioCliente getCliente(Long codigo) {
        return this.daoCliente.pegarUsuario(codigo);
    }
    
    
}
