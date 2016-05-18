/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIUsuario;
import control.GerenciadorClientes;
import domain.Usuario;
import domain.UsuarioCliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Thiago
 */
public class GUIUsuarioServico implements GUIUsuario{
    
    private static Scanner in = new Scanner(System.in);
    private GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    private static AtomicInteger count = new AtomicInteger(0);
    
    
    @Override
    public void cadastrarCliente() {
        try {
           
            System.out.println("---------- Cadastrar Cliente----------");
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Endereço: ");
            String setor = in.nextLine();
            System.out.print("Telefone: ");
            String telefone = in.nextLine();
            System.out.print("Login: ");
            String login = in.nextLine();
            System.out.print("Senha: ");
            String senha = in.nextLine();
            
            UsuarioCliente usuarioCliente = new UsuarioCliente(count.incrementAndGet(), nome, setor, telefone, login, senha);
            gerenciadorCliente.cadastrarCliente(usuarioCliente);
        } catch (Exception e) {
            

        }
            System.out.println("Cliente cadastrado com sucesso!!");
    }

    @Override
    public void removerCliente() {
        try {
            System.out.println("---------- Remover Cliente----------");
            System.out.print("Id: ");
            long id = Long.parseLong(in.nextLine());
            gerenciadorCliente.removerCliente(gerenciadorCliente.getCliente(id));
        } catch (Exception e) {

        }
        System.out.println("Cliente removido com sucesso");
    }

    @Override
    public void listarCliente() {
        ArrayList<UsuarioCliente> listUsuario = gerenciadorCliente.listarClientes();
        Iterator<UsuarioCliente> it = listUsuario.iterator();
        
        while(it.hasNext()){
            UsuarioCliente usuarioCliente = it.next();
            System.out.println("Id: " + usuarioCliente.getId());
            System.out.println("Nome: " + usuarioCliente.getNome());
            System.out.println("Endereço: " + usuarioCliente.getEndereco());
            System.out.println("Telefone: " + usuarioCliente.getTelefone());
            System.out.println("Login: " + usuarioCliente.getLogin());
            System.out.println("Senha: " + usuarioCliente.getSenha());
        }
        
    }

    @Override
    public void analisarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
