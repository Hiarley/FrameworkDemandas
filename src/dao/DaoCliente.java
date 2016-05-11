/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class DaoCliente implements IDaoCliente{
    
    static DaoCliente daoCliente = null;

    public static DaoCliente getInstance() {
        if(daoCliente == null){
            daoCliente = new DaoCliente();
        }
        return daoCliente;
    }
    
    @Override
    public void adicionarCliente(Cliente cliente) {
        //Comandos SQL para adicionar no banco
    }

    @Override
    public void removerCliente(Cliente cliente) {
        //Comandos SQL para remover no banco
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        //Comandos SQL para atualizar no banco
    }

    @Override
    public Cliente pegarCliente(long id) {
        //Comandos SQL para pegar cliente no banco
        Cliente cliente = null;
        return cliente;
    }

    @Override
    public ArrayList<Cliente> listarClientes() {
        //Comandos SQL para listar todos clientes no banco
        ArrayList<Cliente> cliente = null;
        return cliente;
    }
    
}
