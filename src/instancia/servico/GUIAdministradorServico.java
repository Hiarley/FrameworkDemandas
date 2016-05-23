/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUIAdministrador;
import control.GerenciadorClientes;
import control.GerenciadorDemandas;
import control.GerenciadorHistoricos;
import control.GerenciadorNotificao;
import control.GerenciadorProduto;
import control.GerenciadorUsuarios;
import domain.Demanda;
import domain.Historico;
import domain.Usuario;
import domain.UsuarioCliente;
import domain.UsuarioPadrao;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
    private GerenciadorHistoricos gerenciadorHistoricos = new GerenciadorHistoricos();
    private GerenciadorNotificao gerenciadorNotificacao = new GerenciadorNotificao();


    @Override
    public void cadastrarUsuario() {
        try {
           
            System.out.println("---------- Cadastrar Usuario----------");
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("Endereço: ");
            String setor = in.next();
            System.out.print("Telefone: ");
            String telefone = in.next();
            System.out.print("Login: ");
            String login = in.next();
            System.out.print("Senha: ");
            String senha = in.next();
            System.out.print("Administrador: ");
            boolean administrador = in.nextBoolean();
            
            UsuarioPadrao usuarioPadrao = new UsuarioPadrao(administrador, nome, setor, telefone, login, senha);
            gerenciadorUsuarios.cadastrarUsuario(usuarioPadrao);
        } catch (Exception e) {

        }

    }

    @Override
    public void cadastrarProdutos() {
        System.out.println("Nome" );
        String nome = in.nextLine();
        System.out.println("IdProduto: ");
        long IdProduto = Long.parseLong(in.nextLine());
        System.out.println("Empresa Fornecedora: ");
        String empresaFornecedora = in.nextLine();
        System.out.println("Preco: ");
        double preco = Double.parseDouble(in.nextLine());
        System.out.println("Descricao: ");
        String descricao = in.nextLine();
        System.out.println("Prazo: ");
        String prazo = in.nextLine();
            
        
    }

    @Override
    public void removerUsuario() {
        try {
            System.out.println("---------- Remover Usuario----------");
            System.out.print("Id: ");
            long id = Long.parseLong(in.nextLine());
            gerenciadorUsuarios.removerUsuario(gerenciadorUsuarios.getUsuario(id));
        } catch (Exception e) {

        }
    }

    @Override
    public void removerProdutos() {
        System.out.println("Digite o id do Produto: ");
        long id = in.nextLong();
        gerenciadorProduto.removerProduto(gerenciadorProduto.getProduto(id));
    }

    @Override
    public void listarUsuarios() {
        try {
            ArrayList<UsuarioPadrao> listUsuario = gerenciadorUsuarios.listarUsuarios();
            Iterator<UsuarioPadrao> it = listUsuario.iterator();
        
        while(it.hasNext()){
            UsuarioPadrao usuarioPadrao = it.next();
            System.out.println("Administrador" + usuarioPadrao.isAdministrador());
            System.out.println("Id: " + usuarioPadrao.getId());
            System.out.println("Nome: " + usuarioPadrao.getNome());
            System.out.println("Endereço: " + usuarioPadrao.getEndereco());
            System.out.println("Telefone: " + usuarioPadrao.getTelefone());
            System.out.println("Login: " + usuarioPadrao.getLogin());
            System.out.println("Senha: " + usuarioPadrao.getSenha());
        }
        } catch (Exception e) {
        }
    
    }


    @Override
    public void cadastrarCliente() {
        try {
           
            System.out.println("---------- Cadastrar Cliente----------");
            System.out.println("Nome: ");
            String nome = in.next();
            System.out.println("Endereço: ");
            String setor = in.next();
            System.out.println("Telefone: ");
            String telefone = in.next();
            System.out.println("Login: ");
            String login = in.next();
            System.out.println("Senha: ");
            String senha = in.next();
            
            UsuarioCliente usuarioCliente = new UsuarioCliente( nome, setor, telefone, login, senha);
            gerenciadorCliente.cadastrarCliente(usuarioCliente);
        } catch (Exception e) {

        }
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
    }

    @Override
    public void listarCliente() {
        ArrayList<UsuarioCliente> listUsuario = gerenciadorCliente.listarClientes();
        Iterator<UsuarioCliente> it = listUsuario.iterator();
        
        while(it.hasNext()){
            UsuarioCliente usuarioCliente = it.next();
            System.out.println("Nome: " + usuarioCliente.getNome());
            System.out.println("Endereço: " + usuarioCliente.getEndereco());
            System.out.println("Telefone: " + usuarioCliente.getTelefone());
            System.out.println("Login: " + usuarioCliente.getLogin());
            System.out.println("Senha: " + usuarioCliente.getSenha());
        }
    }

    @Override
    public void analisarPedido(Usuario usuario) {
        System.out.println("Digite o IdDemanda: ");
        long idDemanda = in.nextLong();
        Demanda demanda = gerenciadorDemanda.getDemanda(idDemanda);
        demanda.setIdUsuarioDemandando(usuario.getId());
        
        System.out.println("Descreva o historico: ");
        String descricao = in.nextLine();
        
        Historico historico = new Historico(idDemanda, demanda.getIdUsuarioDemandando(), new Date(), descricao, new UsuarioCliente());
        
        gerenciadorNotificacao.NotificarAtualizacao(historico);
        
        gerenciadorHistoricos.adicionarHistorico(historico);
    }
    
    @Override
    public void listarDemandas(){
        
        List<Demanda> listDemandas = gerenciadorDemanda.listarDemandas();
        
        for(Demanda demanda : listDemandas){
    
            System.out.println("IdUsuarioSolicitante: " + demanda.getIdUsuarioSolicitante());
            System.out.println("IdDemanda: " + demanda.getIdDemanda());
            System.out.println("Data: " + demanda.getDataAbertura());
            System.out.println("IdUsuarioDemandando: " + demanda.getIdUsuarioDemandando());
            System.out.println("Descricao: " + demanda.getDescricao());
            System.out.println("Status: " + demanda.getStatus());
        }
    }

}
