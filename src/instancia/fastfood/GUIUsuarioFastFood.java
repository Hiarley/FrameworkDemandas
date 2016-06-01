/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import instancia.estoque.*;
import instancia.servico.*;
import GUI.GUIUsuario;
import control.GerenciadorClientes;
import control.GerenciadorPedidos;
import control.GerenciadorHistoricos;
import control.GerenciadorNotificao;
import domain.Pedido;
import domain.Historico;
import domain.Usuario;
import domain.UsuarioCliente;
import excecao.HistoricoInvalidoException;
import excecao.PedidoInvalidoException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class GUIUsuarioFastFood implements GUIUsuario {

    private static Scanner in = new Scanner(System.in);
    private GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    private GerenciadorPedidos gerenciadorPedido = new GerenciadorPedidos(new FabricaNotificacaoFastFood(), new NotaFiscalBuilderFastFood());
    private GerenciadorHistoricos gerenciadorHistorico = new GerenciadorHistoricos();
    private GerenciadorNotificao gerenciadorNotificacao = new GerenciadorNotificao(new FabricaNotificacaoFastFood());

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

            gerenciadorCliente.cadastrarCliente(new UsuarioCliente(nome, setor, telefone, login, senha));
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

    public void listarPedidos() {
        List<Pedido> listPedido = gerenciadorPedido.listarPedidos();

        for (Pedido pedido : listPedido) {
            System.out.println("----------------------------------");
            System.out.println("IdUsuarioSolicitante: " + pedido.getIdUsuarioSolicitante());
            System.out.println("IdDemanda: " + pedido.getIdServico());
            System.out.println("Data: " + pedido.getDataAbertura());
            System.out.println("IdUsuarioDemandando: " + pedido.getIdUsuarioDemandando());
            System.out.println("Descricao: " + pedido.getDescricao());
            System.out.println("Status: " + pedido.getStatus());
        }
    }

    @Override
    public void analisarPedido(Usuario usuario) {
        listarPedidos();
        System.out.println("Digite o IdDemanda: ");
        long idDemanda = in.nextLong();
        Pedido pedido = gerenciadorPedido.getPedido(idDemanda);
        pedido.setIdUsuarioDemandando(usuario.getId());

        System.out.println("Descreva o historico: ");
        String descricao = in.nextLine();
        System.out.println("Status: ");
        char status = in.next().charAt(0);
        try {
            pedido.setStatus(status);
        } catch (PedidoInvalidoException ex) {
            Logger.getLogger(GUIUsuarioFastFood.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            gerenciadorHistorico.adicionarHistorico(new Historico(idDemanda, pedido.getIdUsuarioDemandando(), new Date(), descricao, usuario));
            gerenciadorNotificacao.NotificarAtualizacao(new Historico(idDemanda, pedido.getIdUsuarioDemandando(), new Date(), descricao, usuario));
        } catch (HistoricoInvalidoException ex) {
            Logger.getLogger(GUIUsuarioFastFood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
