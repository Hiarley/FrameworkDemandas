/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import GUI.GUICliente;
import control.GerenciadorPedidos;
import control.GerenciadorPagamento;
import control.GerenciadorDemanda;
import instancia.servico.CartaoDebito;
import domain.Pedido;
import domain.Pagamento;
import domain.Demanda;
import instancia.estoque.Item;
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
public class GUIClienteFastFood implements GUICliente {

    private static Scanner in = new Scanner(System.in);
    private GerenciadorDemanda gerenciadorDemanda = new GerenciadorDemanda();
    private GerenciadorPedidos gerenciadorPedidos = new GerenciadorPedidos();
    private static AtomicInteger count = new AtomicInteger(0);
    ArrayList<Demanda> listaProdutos = new ArrayList<>();
    private GerenciadorPagamento gerenciadorPagamento = new GerenciadorPagamento();

    public void cadastrarPedido(Usuario usuario) {

        try {
            System.out.println("---------- Cadastrar Pedido----------");
            long idCliente = usuario.getId();
            System.out.println("Descrição: ");
            String descricao = in.next();
            System.out.println("Quantos alimentos deseja adicionar?");
            int servicos = in.nextInt();
            for (; servicos > 0; servicos--) {
                
                listarProdutos();
                System.out.println("Digite o Id do alimento escolhido: ");
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
            Alimento alimento;
            for (Demanda produto : listDemanda) {

                alimento = (Alimento) produto;
                System.out.println("Nome" + alimento.getNome());
                System.out.println("IdProduto: " + alimento.getIdDemanda());
                System.out.println("Tipo do Alimento: " + alimento.getTipoAlimento());
                System.out.println("Preco: " + alimento.getPreco());
                System.out.println("Descricao: " + alimento.getDescricao());
                System.out.println("Prazo: " + alimento.getPrazo());
                System.out.println("Fornecedor: " + alimento.getFornecedor());
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void listarDemandas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
