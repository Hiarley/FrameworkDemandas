/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUILogin;
import control.GerenciadorClientes;
import dao.DaoDemanda;
import dao.DaoUsuarioCliente;
import dao.DaoUsuarioPadrao;
import dao.IDaoDemanda;
import dao.IDaoUsuarioCliente;
import dao.IDaoUsuarioPadrao;
import domain.Demanda;
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

    public static void popularDao() throws ClienteInvalidoException {
        IDaoUsuarioCliente daoCliente = DaoUsuarioCliente.getInstance();
        IDaoUsuarioPadrao daoUsuarioPadrao = DaoUsuarioPadrao.getInstance();
        IDaoDemanda daoDemanda = DaoDemanda.getInstance();
        /*
        public UsuarioCliente(long id, String nome, String endereco, String telefone, String login, String senha)
         */
        UsuarioPadrao usuarioPadrao1 = new UsuarioPadrao(false, "Thiago", "Teste", "123", "thiago", "admin");
        UsuarioPadrao usuarioPadrao = new UsuarioPadrao(true, "Hiarley", "Teste", "123", "admin", "admin");
        UsuarioCliente usuarioCliente = new UsuarioCliente( "Joao", "Teste", "123", "joao", "admin");
        Demanda servico = new Servico("ASD", "AJH", 200, "Treta", "5");
        daoDemanda.adicionarDemanda(servico);
        daoCliente.adicionarCliente(usuarioCliente);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao1);

    }
}
