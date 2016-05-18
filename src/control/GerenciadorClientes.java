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
            this.daoCliente.adicionarCliente(cliente);
        }
    }

    public void removerCliente(UsuarioCliente cliente) {
        this.daoCliente.removerCliente(cliente);
    }

    public void atualizarCliente(UsuarioCliente cliente){
        this.daoCliente.atualizarCliente(cliente);
    }
    
    public ArrayList<UsuarioCliente> listarClientes(){
        return this.daoCliente.listarCliente();
    }

    public UsuarioCliente getCliente(Long codigo) {
        return this.daoCliente.pegarCliente(codigo);
    }
        
    public UsuarioCliente getCliente(String login){
        return this.daoCliente.pegarCliente(login);
    }
    
}
