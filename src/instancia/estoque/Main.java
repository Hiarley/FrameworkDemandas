/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.estoque;

import instancia.servico.*;
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

    private static GUILogin guiLogin = new GUILoginEstoque();
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
        UsuarioPadrao usuarioPadrao1 = new UsuarioPadrao(false, "Thiago", "R. dos Lascados", "84 9 5254-6586", "thiago", "admin");
        UsuarioPadrao usuarioPadrao = new UsuarioPadrao(true, "Hiarley", "R. dos Lascados", "84 9 5236-5656", "admin", "admin");
        UsuarioCliente usuarioCliente = new UsuarioCliente("Joao", "Av. Professor não me reprova pelo amor de Deus", "84 9 9858-5256", "joao", "admin");
        Demanda item = new Item(200, "Clip's", 0.10, "Prender papel", "9999");
        Demanda item1 = new Item(5, "Toner de impressora", 37.5, "Tooner Compativel com TK-4054 TK-3453", "9999");
        Demanda item2 = new Item(15, "Caneta", 0.9, "Caneta ponta 1.0", "9999");
        daoDemanda.adicionarDemanda(item);
        daoDemanda.adicionarDemanda(item1);
        daoDemanda.adicionarDemanda(item2);
        daoCliente.adicionarCliente(usuarioCliente);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao1);

    }
}
