/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.UsuarioCliente;
import domain.UsuarioCliente;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoUsuarioCliente {

    public void adicionarUsuario(UsuarioCliente usuario);

    public void removerUsuario(UsuarioCliente usuario);

    public void atualizarUsuario(UsuarioCliente usuario);

    public UsuarioCliente pegarUsuario(long id);

    public ArrayList<UsuarioCliente> listarUsuarios();

    public IDaoUsuarioCliente getInstance();

}
