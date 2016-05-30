/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.estoque;

import GUI.GUICliente;
import control.GerenciadorPedidos;
import control.GerenciadorPagamento;
import control.GerenciadorDemanda;
import instancia.servico.CartaoDebito;
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
public class GUIClienteEstoque implements GUICliente {

    private static Scanner in = new Scanner(System.in);
    private GerenciadorDemanda gerenciadorDemanda = new GerenciadorDemanda();
    private GerenciadorPedidos gerenciadorPedidos = new GerenciadorPedidos();
    private static AtomicInteger count = new AtomicInteger(0);
    ArrayList<Demanda> listaProdutos = new ArrayList<>();
    private GerenciadorPagamento gerenciadorPagamento = new GerenciadorPagamento();

    public void cadastrarPedido(Usuario usuario) {

        try {
            Date date = new Date();
            System.out.println("---------- Cadastrar Pedido----------");
            long idCliente = usuario.getId();
            System.out.println("Descrição: ");
            String descricao = in.next();
            System.out.println("Quantos servicos deseja adicionar?");
            int servicos = in.nextInt();
            Item item;
            for (; servicos > 0; servicos--) {
                listarProdutos();
                System.out.println("Digite o IdServico do servico escolhido: ");
                long id = in.nextLong();    
                System.out.println("Digite a quantidade: ");
                int quantidade = in.nextInt();
                item = (Item) gerenciadorDemanda.getDemanda(id);
                if(item.getQuantidadeEmEstoque()<quantidade){
                    System.out.println("Quantidade indisponivel");
                }else{
                    item.setQuantidadeEmEstoque(quantidade);
                    listaProdutos.add(item);
                }
                
            }

            Pedido pedido = new Pedido(idCliente, date, descricao, 'P', listaProdutos);
            Pagamento pagamento = new BoletoBancario(new Date(), pedido.getIdServico(), "Cartao de Debito", 500);

            gerenciadorPedidos.cadastrarPedidos(pedido, pagamento, 1);
            

        } catch (Exception e) {

        }

    }

    @Override
    public void listarProdutos() {
        try {
            List<Demanda> listDemanda = gerenciadorDemanda.listarDemandas();
            Item item;
            for (Demanda produto : listDemanda) {

                item = (Item) produto;
                System.out.println("Nome" + item.getNome());
                System.out.println("IdProduto: " + item.getIdDemanda());
                System.out.println("Quantidade: " + item.getQuantidadeEmEstoque());
                System.out.println("Preco: " + item.getPreco());
                System.out.println("Descricao: " + item.getDescricao());
                System.out.println("Prazo: " + item.getPrazo());
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void listarDemandas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
