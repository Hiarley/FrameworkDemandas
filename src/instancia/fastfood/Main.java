/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import instancia.estoque.*;
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

    private static GUILogin guiLogin = new GUILoginFastFood();
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
        UsuarioCliente usuarioCliente = new UsuarioCliente("Joao", "Teste", "123", "joao", "admin");
        Demanda alimento = new Alimento("Subway", "Sandwich", "Baratissimo", 7, "Pão/carne/salada", "2");
        Demanda alimento1 = new Alimento("Habibs", "Salgado", "BIB'SFIHA DE CARNE", 0.69, "carne, com limão, tomate, tahine, cebola e o tempero ultrasecreto", "3");
        Demanda alimento2 = new Alimento("Chiquinhos", "Sorvete", "Milk Shake de Ovo Maltine", 9, "Sorvete, leite, ovomaltine", "1");
        daoDemanda.adicionarDemanda(alimento);
        daoDemanda.adicionarDemanda(alimento1);
        daoDemanda.adicionarDemanda(alimento2);
        daoCliente.adicionarCliente(usuarioCliente);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao);
        daoUsuarioPadrao.adicionarUsuario(usuarioPadrao1);

    }
}
