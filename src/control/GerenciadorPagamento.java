/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoPagamento;
import dao.IDaoPagamento;
import domain.Pagamento;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorPagamento {
    public void adicionarPagamento(Pagamento pagamento) {

    }
    private IDaoPagamento daoPagamento;

    public GerenciadorPagamento() {
        daoPagamento = DaoPagamento.getInstance();
    }

    public void cadastrarPagamento(Pagamento pagamento) {
        if (pagamento.validarPagamento()) {
            this.daoPagamento.adicionarPagamento(pagamento);
        }
    }

    public void removerPagamento(Pagamento pagamento) {
        this.daoPagamento.removerPagamento(pagamento);
    }

    public void atualizarPagamento(Pagamento pagamento) {
        this.daoPagamento.atualizarPagamento(pagamento);
    }

    public ArrayList<Pagamento> listarPagamentos() {
        return this.daoPagamento.listarPagamento();
    }

    public Pagamento getPagamento(Long id) {
        return this.daoPagamento.pegarPagamento(id);
    }
}
