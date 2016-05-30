/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUICliente;
import control.GerenciadorPedidos;
import control.GerenciadorNotificao;
import control.GerenciadorPagamento;
import control.GerenciadorDemanda;
import domain.Pedido;
import domain.Pagamento;
import domain.Demanda;
import domain.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Thiago
 */
public class GUIClienteServico implements GUICliente {

    private static Scanner in = new Scanner(System.in);
    private GerenciadorDemanda gerenciadorDemanda = new GerenciadorDemanda();
    private GerenciadorPedidos gerenciadorPedidos = new GerenciadorPedidos();
    private static AtomicInteger count = new AtomicInteger(0);
    ArrayList<Demanda> listaProdutos = new ArrayList<>();
    private GerenciadorPagamento gerenciadorPagamento = new GerenciadorPagamento();

    @Override
    public void cadastrarPedido(Usuario usuario) {

        try {
            
            System.out.println("---------- Cadastrar Pedido----------");
            long idCliente = usuario.getId();
            System.out.println("Descrição: ");
            String descricao = in.next();
            System.out.println("Quantos servicos deseja adicionar?");
            int servicos = in.nextInt();

            for (; servicos > 0; servicos--) {
                listarProdutos();
                System.out.println("Digite o IdServico do servico escolhido: ");
                long id = in.nextLong();
                listaProdutos.add(gerenciadorDemanda.getDemanda(id));
            }
            System.out.println("Numero do Cartao");
            int numeroCartao = in.nextInt();
            System.out.println("Banco");
            String Banco = in.nextLine();

            
            Pedido pedido = new Pedido(idCliente, new Date(), descricao, 'I', listaProdutos);
            gerenciadorPedidos.cadastrarPedidos(pedido, new CartaoDebito(numeroCartao, Banco, pedido.getIdServico(), "Cartao de Debito", 500), 1);

        } catch (Exception e) {

        }

    }

    @Override
    public void listarProdutos() {
        try {
            List<Demanda> listDemanda = gerenciadorDemanda.listarDemandas();

            for (Demanda produto : listDemanda) {

                Servico servico = (Servico) produto;
                System.out.println("Nome" + servico.getNome());
                System.out.println("IdProduto: " + servico.getIdDemanda());
                System.out.println("Empresa Fornecedora: " + servico.getEmpresaFornecedora());
                System.out.println("Preco: " + servico.getPreco());
                System.out.println("Descricao: " + servico.getDescricao());
                System.out.println("Prazo: " + servico.getPrazo());
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void listarDemandas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
