/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoCliente;
import domain.Cliente;
import excecao.ClienteInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorClientes {
    private DaoCliente daoCliente;

    public GerenciadorClientes() {
        daoCliente = DaoCliente.getInstance();
    }

    public void cadastrarCliente(Cliente cliente) throws  ClienteInvalidoException {
        if(cliente.validarCliente()) {
            this.daoCliente.adicionarCliente(cliente);
        }
    }

    public void removerCliente(Cliente cliente) {
        this.daoCliente.removerCliente(cliente);
    }

    public ArrayList<Cliente> listarClientes(){
        return this.daoCliente.listarClientes();
    }

    public Cliente getCliente(Long codigo) {
        return this.daoCliente.pegarCliente(codigo);
    }
}
