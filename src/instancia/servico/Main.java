/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIInicial;
import control.GerenciadorClientes;
import dao.DaoUsuarioCliente;
import dao.IDaoUsuarioCliente;
import domain.UsuarioCliente;
import excecao.ClienteInvalidoException;

/**
 *
 * @author hiarl
 */
public class Main {

    private static GUIInicial guiIncial = new GUIInicialServico();
    private static GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();

    public static void main(String[] args) throws ClienteInvalidoException {
        popularDao();
        guiIncial.acessarInterface();
    }
    
    public static void popularDao() throws ClienteInvalidoException{
        IDaoUsuarioCliente daoCliente = DaoUsuarioCliente.getInstance();
        UsuarioCliente usuarioCliente = new UsuarioCliente((long) 23.2,"dsa","asd","asd","asd","asd");
        daoCliente.adicionarUsuario(usuarioCliente);
    }
}
