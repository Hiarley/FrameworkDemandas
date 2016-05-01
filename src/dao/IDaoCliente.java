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
public interface IDaoCliente {
    public void adicionarCliente(Cliente cliente);
    public void removerCliente(Cliente cliente);
    public void atualizarCliente(Cliente cliente);
    public Cliente pegarCliente(long id);
    public ArrayList<Cliente> listarClientes();
}
