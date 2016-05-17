/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.UsuarioCliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoUsuarioCliente implements IDaoUsuarioCliente{
    
    static DaoUsuarioCliente daoUsuario = null;
    private Set<UsuarioCliente> usuarios;
    
    public static DaoUsuarioCliente getInstance() {
        if(daoUsuario == null){
            daoUsuario = new DaoUsuarioCliente();
        }
        return daoUsuario;
    }

    public void adicionarUsuario(UsuarioCliente usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void removerUsuario(UsuarioCliente usuario) {
        Iterator<UsuarioCliente> it = usuarios.iterator();
		while(it.hasNext()) {
			UsuarioCliente u = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(u.getId() == usuario.getId()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarUsuario(UsuarioCliente usuario) {
        Iterator<UsuarioCliente> it = usuarios.iterator();
		while(it.hasNext()) {
			UsuarioCliente u = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(u.getId() == usuario.getId()) {
				u = usuario;
				return;
                    }    
                }
    }

    @Override
    public UsuarioCliente pegarUsuario(long id) {
        Iterator<UsuarioCliente> it = usuarios.iterator();
		while(it.hasNext()) {
			UsuarioCliente u = it.next();
			
			if(u.getId() == (id)) {
				return u;
			}
		}
		
		return null;    }

    @Override
    public ArrayList<UsuarioCliente> listarUsuarios() {
        ArrayList<UsuarioCliente> resultList = new ArrayList<UsuarioCliente>();
		
		Iterator<UsuarioCliente> it = usuarios.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }
        
}
