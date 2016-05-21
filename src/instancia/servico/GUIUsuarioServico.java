/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIUsuario;
import control.GerenciadorClientes;
import control.GerenciadorDemandas;
import control.GerenciadorHistoricos;
import control.GerenciadorNotificao;
import domain.Demanda;
import domain.Historico;
import domain.Usuario;
import domain.UsuarioCliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Thiago
 */
public class GUIUsuarioServico implements GUIUsuario {

    private static Scanner in = new Scanner(System.in);
    private GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    private GerenciadorDemandas gerenciadorDemandas = new GerenciadorDemandas();
    private static AtomicInteger count = new AtomicInteger(0);
    private GerenciadorHistoricos gerenciadorHistorico = new GerenciadorHistoricos();
    private GerenciadorNotificao gerenciadorNotificacao = new GerenciadorNotificao();

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

        while (it.hasNext()) {
            UsuarioCliente usuarioCliente = it.next();
            System.out.println("Id: " + usuarioCliente.getId());
            System.out.println("Nome: " + usuarioCliente.getNome());
            System.out.println("Endereço: " + usuarioCliente.getEndereco());
            System.out.println("Telefone: " + usuarioCliente.getTelefone());
            System.out.println("Login: " + usuarioCliente.getLogin());
            System.out.println("Senha: " + usuarioCliente.getSenha());
        }

    }

    
    public void analisarPedido(long id) {
        ArrayList<Demanda> listUsuario = gerenciadorDemandas.listarDemandas();
        Iterator<Demanda> it = listUsuario.iterator();
        System.out.println("oi");
        while (it.hasNext()) {
            Demanda demanda = it.next();
            if(demanda.getIdDemanda() == (id)){
                long asd = 0;
                demanda.setIdUsuarioDemandando(asd);
                System.out.println("idUsuarioSolicitante: " + demanda.getIdUsuarioSolicitante() + "\n");
                System.out.println("idDemanda: " + demanda.getIdDemanda() + "\n");
                System.out.println("dataAbertura: " + demanda.getDataAbertura() + "\n");
                System.out.println("idUsuarioDemandado: " + demanda.getIdUsuarioDemandando() + "\n");
                System.out.println("descricao: " + demanda.getDescricao() + "\n");
                System.out.println("status: " + demanda.getStatus() + "\n");
                
                
                gerenciadorHistorico.adicionarHistorico(null);
        }
    }
        
    }

       
    
    
    @Override
    public void analisarPedido() {
        System.out.println("Digite o IdDemanda: ");
        long idDemanda = in.nextLong();
        Demanda demanda =gerenciadorDemandas.getDemanda(idDemanda);
        
        System.out.println("Descreva o historico: ");
        String descricao = in.nextLine();
        
        Historico historico = new Historico(idDemanda, demanda.getIdUsuarioDemandando(), new Date(), descricao, new UsuarioCliente());
        
        gerenciadorNotificacao.NotificarAtualizacao(historico);
        
        gerenciadorHistorico.adicionarHistorico(historico);
    }
}
