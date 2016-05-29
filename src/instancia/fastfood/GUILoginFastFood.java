/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import instancia.estoque.*;
import instancia.servico.*;
import GUI.GUIInicial;
import control.GerenciadorClientes;
import control.GerenciadorUsuarios;
import domain.Usuario;
import java.util.Scanner;

/**
 *
 * @author hiarl
 */
public class GUILoginFastFood implements GUI.GUILogin {

    private Scanner in = new Scanner(System.in);

    GerenciadorUsuarios gerenciadorUsuarios = new GerenciadorUsuarios();
    GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    GUIInicial guiInicialServico = new GUIInicialServico();
    Usuario usuario;

    @Override
    public boolean autenticar(String login, String senha) {
        Usuario usuarioPadrao = gerenciadorUsuarios.getUsuario(login);
        Usuario usuarioCliente = gerenciadorCliente.getCliente(login);

        if (gerenciadorUsuarios.getUsuario(login) == null && gerenciadorCliente.getCliente(login) == null) {
            System.out.println("Usuario não cadastrado");
            return false;
        } else if (gerenciadorUsuarios.getUsuario(login) != null && usuarioPadrao.getSenha().equals(senha)) {
            usuario = gerenciadorUsuarios.getUsuario(login);
            return true;
        } else if (gerenciadorCliente.getCliente(login) != null && usuarioCliente.getSenha().equals(senha)) {
            usuario = gerenciadorCliente.getCliente(login);
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    @Override
    public void logar() {
        do {
            System.out.println("---------- Login ----------");
            System.out.println("Usuario:");
            String login = in.next();
            System.out.println("Senha:");
            String senha = in.next();
            if (autenticar(login, senha)) {
                guiInicialServico.acessarInterface(usuario);
            }
        } while (true);
    }

}
