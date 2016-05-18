/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIInicial;
import GUI.GUILogin;
import control.GerenciadorClientes;
import dao.DaoUsuarioCliente;
import dao.DaoUsuarioPadrao;
import dao.IDaoUsuarioCliente;
import dao.IDaoUsuarioPadrao;
import domain.UsuarioCliente;
import domain.UsuarioPadrao;
import excecao.ClienteInvalidoException;

/**
 *
 * @author hiarl
 */
public class Main {

    private static GUILogin guiLogin = new GUILoginServico();
    private static GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();

    public static void main(String[] args) throws ClienteInvalidoException {
        popularDao();
        guiLogin.logar();
    }
    
    public static void popularDao() throws ClienteInvalidoException{
        IDaoUsuarioCliente daoCliente = DaoUsuarioCliente.getInstance();
        IDaoUsuarioPadrao daoUsuarioPadrao = DaoUsuarioPadrao.getInstance();
        /*
        public UsuarioCliente(long id, String nome, String endereco, String telefone, String login, String senha)
        */
        UsuarioPadrao usuarioPadrao = new UsuarioPadrao(true, 1, "Hiarley", "Teste", "123", "admin", "admin");
        UsuarioCliente usuarioCliente = new UsuarioCliente((long) 1,"dsa","asd","asd","asd","asd");
        daoCliente.adicionarUsuario(usuarioCliente);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao);
    }
}
