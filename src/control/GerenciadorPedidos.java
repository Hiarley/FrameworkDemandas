/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoPedido;
import dao.IDaoPedido;
import domain.Demanda;
import domain.Item;
import domain.Pedido;
import domain.Pagamento;
import excecao.PedidoInvalidoException;
import excecao.ProdutoInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorPedidos {

    private IDaoPedido daoPedido;
    private GerenciadorPagamento gerenciadorPagamento;
    private GerenciadorDemanda gerenciadorDemandas;
    private GerenciadorNotificao notificao = new GerenciadorNotificao();

    public GerenciadorPedidos() {
        daoPedido = DaoPedido.getInstance();

    }

    public void cadastrarPedidos(Pedido pedidos, Pagamento pagamento, int opcao) throws PedidoInvalidoException, ProdutoInvalidoException {
        if (validarPedido(pedidos)) {
            this.daoPedido.adicionarPedido(pedidos);
            switch (opcao) {
                case 1:
                    gerenciadorPagamento.adicionarPagamento(pagamento);
                    notificao.NotificarInicio(pedidos);
                    break;
                default:
                    break;

            }
        }
        if (pedidos.getListaProdutos().get(0) instanceof Item && pedidos.getListaProdutos() != null) {
            Item item;
            Item itemBanco;
            for (Demanda demanda : pedidos.getListaProdutos()) {
                item = (Item) demanda;
                itemBanco = (Item) gerenciadorDemandas.getDemanda(demanda.getIdDemanda());
                itemBanco.setQuantidadeEmEstoque((itemBanco.getQuantidadeEmEstoque() - item.getQuantidadeEmEstoque()));
                gerenciadorDemandas.atualizarDemanda(itemBanco);
            }
        }
    }

    public void removerPedido(Pedido pedido) {
        this.daoPedido.removerPedido(pedido);
    }

    public ArrayList<Pedido> listarPedidos() {
        return this.daoPedido.listarPedidos();
    }

    public Pedido getPedido(Long codigo) {
        return this.daoPedido.pegarPedido(codigo);
    }

    private boolean validarPedido(Pedido pedido) throws PedidoInvalidoException {
        if (pedido.getIdUsuarioSolicitante() < 0) {
            throw new PedidoInvalidoException("Solicitante não encontrado");

        } else if (pedido.getDescricao().equals("")) {
            throw new PedidoInvalidoException("Servico estar vazia");

        } else if (daoPedido.pegarPedido(pedido.getIdServico()) != null) {
            throw new PedidoInvalidoException("ID da demanda invalido, contate o administrador.");

        }
        return true;
    }
}
