/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoProduto;
import dao.IDaoProduto;
import domain.Produto;
import domain.UsuarioPadrao;
import excecao.ProdutoInvalidoException;
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

    public void cadastrarProduto(Produto produto) throws ProdutoInvalidoException {
        if (validarProduto(produto)) {
            this.daoProduto.adicionarProduto(produto);
        }
    }

    public void removerProduto(Produto produto) {
        this.daoProduto.removerProduto(produto);
    }

    public void atualizarProduto(Produto produto) {
        this.daoProduto.atualizarProduto(produto);
    }

    public ArrayList<Produto> listarProdutos() {
        return this.daoProduto.listarProdutos();
    }

    public Produto getProduto(Long id) {
        return this.daoProduto.pegarProduto(id);
    }
    
        private boolean validarProduto(Produto produto) throws ProdutoInvalidoException {
        if(produto.getDescricao().equals("")){
            throw new ProdutoInvalidoException("Descrição vazia.");
        }else if(produto.getNome().equals("")){
            throw new ProdutoInvalidoException("Nome vazio.");
            
        }else if(produto.getPreco()<0){
            throw new ProdutoInvalidoException("Valor invalido");
            
        }else if(this.daoProduto.pegarProduto(produto.getIdProduto()) != null){
            throw new ProdutoInvalidoException("Produto já cadastrado");
        }
        return true;
    }
}
