/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIInicial;
import control.GerenciadorClientes;
import control.GerenciadorUsuarios;
import domain.Usuario;
import domain.UsuarioPadrao;
import java.util.Scanner;

/**
 *
 * @author hiarl
 */
public class GUILoginServico implements GUI.GUILogin {
    private Scanner in = new Scanner(System.in);

    GerenciadorUsuarios gerenciadorUsuarios = new GerenciadorUsuarios();
    GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    GUIInicial guiInicialServico = new GUIInicialServico();
    

    @Override
    public boolean autenticar(String login, String senha) {
        Usuario usuarioPadrao = gerenciadorUsuarios.getUsuario(login);
        
        if(gerenciadorUsuarios.getUsuario(login) == null || ){
            System.out.println("Usuario não cadastrado");
            return false;
        }else if(usuarioPadrao.getSenha().equals(senha)){
            return true;
        }else{
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
            if(autenticar(login, senha)){
                guiInicialServico.acessarInterface(gerenciadorUsuarios.getUsuario(login));
            }
        } while (true);
    }

}
