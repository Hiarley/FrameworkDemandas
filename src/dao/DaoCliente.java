/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoCliente implements IDaoCliente{
    
    static DaoCliente daoCliente = null;
    private Set<Cliente> clientes;

    public static DaoCliente getInstance() {
        if(daoCliente == null){
            daoCliente = new DaoCliente();
        }
        return daoCliente;
    }
    
    @Override
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
    public void removerCliente(Cliente cliente) {
        Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			Cliente c = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(c.getIdCliente() == cliente.getIdCliente()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			Cliente c = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(c.getIdCliente() == cliente.getIdCliente()) {
				c = cliente;
				return;
                    }    
                }
    }

    @Override
    public Cliente pegarCliente(long id) {
        Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			Cliente c = it.next();
			
			if(c.getIdCliente() == (id)) {
				return c;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> resultList = new ArrayList<Cliente>();
		
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }
    
}
