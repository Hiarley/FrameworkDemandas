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
        Demanda servico = new Servico("MicroInformatica LTDA", "Impressora", 200, "Conserto de Impressora/Troca de peças/Manutenção", "3");
        Demanda servico1 = new Servico("MicroInformatica LTDA", "Computador", 100, "Manutenção/Limpesa/Formatação", "2");
        Demanda servico2 = new Servico("MicroInformatica LTDA", "Roteadores", 50, "Instalação/Configuração/Consertos", "1");
        daoDemanda.adicionarDemanda(servico);
        daoDemanda.adicionarDemanda(servico1);
        daoDemanda.adicionarDemanda(servico2);
        daoCliente.adicionarCliente(usuarioCliente);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao1);

    }
}
