/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import domain.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoUsuario implements IDaoUsuario{

    static DaoUsuario daoUsuario = null;
    private Set<Usuario> usuarios;
    
    public DaoUsuario getInstance() {
        if(daoUsuario == null){
            daoUsuario = new DaoUsuario();
        }
        return daoUsuario;
    }
        
    
    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
         Iterator<Usuario> it = usuarios.iterator();
		while(it.hasNext()) {
			Usuario u = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(u.getId() == usuario.getId()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        Iterator<Usuario> it = usuarios.iterator();
		while(it.hasNext()) {
			Usuario u = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(u.getId() == usuario.getId()) {
				u = usuario;
				return;
                    }    
                }
    }

    @Override
    public Usuario pegarUsuario(long id) {
        Iterator<Usuario> it = usuarios.iterator();
		while(it.hasNext()) {
			Usuario u = it.next();
			
			if(u.getId() == (id)) {
				return u;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> resultList = new ArrayList<Usuario>();
		
		Iterator<Usuario> it = usuarios.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }
    
}
