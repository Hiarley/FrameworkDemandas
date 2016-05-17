/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoProduto;
import dao.IDaoProduto;
import domain.Produto;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorProduto {

    public void adicionarProduto(Produto produto) {

    }
    private IDaoProduto daoProduto;

    public GerenciadorProduto() {
        daoProduto = DaoProduto.getInstance();
    }

    public void cadastrarProduto(Produto setor) {
        if (setor.validarProduto()) {
            this.daoProduto.adicionarProduto(setor);
        }
    }

    public void removerProduto(Produto setor) {
        this.daoProduto.removerProduto(setor);
    }

    public void atualizarProduto(Produto setor) {
        this.daoProduto.atualizarProduto(setor);
    }

    public ArrayList<Produto> listarProdutos() {
        return this.daoProduto.listarProdutos();
    }

    public Produto getProduto(Long id) {
        return this.daoProduto.pegarProduto(id);
    }
}
