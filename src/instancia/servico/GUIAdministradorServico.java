/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIAdministrador;
import control.GerenciadorClientes;
import control.GerenciadorDemandas;
import control.GerenciadorProduto;
import control.GerenciadorUsuarios;
import domain.UsuarioPadrao;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Thiago
 */
public class GUIAdministradorServico implements GUIAdministrador {

    private static Scanner in = new Scanner(System.in);
    private GerenciadorUsuarios gerenciadorUsuarios = new GerenciadorUsuarios();
    private GerenciadorProduto gerenciadorProduto = new GerenciadorProduto();
    private GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    private GerenciadorDemandas gerenciadorDemanda = new GerenciadorDemandas();
    private static AtomicInteger count = new AtomicInteger(0); 

    @Override
    public void cadastrarUsuario() {
        try {
           
            System.out.println("---------- Cadastrar Usuario----------");
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Setor: ");
            String setor = in.nextLine();
            System.out.print("Telefone: ");
            String telefone = in.nextLine();
            System.out.print("Login: ");
            String login = in.nextLine();
            System.out.print("Senha: ");
            String senha = in.nextLine();
            System.out.print("Administrador: ");
            boolean administrador = in.nextBoolean();
            
            UsuarioPadrao usuarioPadrao = new UsuarioPadrao(administrador, count.incrementAndGet(), nome, setor, telefone, login, senha);
            gerenciadorUsuarios.cadastrarUsuario(usuarioPadrao);
        } catch (Exception e) {

        }

    }

    @Override
    public void cadastrarInformacoes() {
        try {
            
        } catch (Exception e) {
        }
    }

    @Override
    public void removerUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerInformacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarUsuarios() {
        try {
          //  gerenciadorUsuarios.listarUsuarios();
        } catch (Exception e) {
        }
    
    }

    @Override
    public void listarInformacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void analisarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
