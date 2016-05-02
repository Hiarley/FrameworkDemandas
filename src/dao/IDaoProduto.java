/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import domain.Produto;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public interface IDaoProduto {
    public void adicionarProduto(Produto produto);
    public void removerProduto(Produto produto);
    public void atualizarProduto(Produto produto);
    public Cliente pegarProduto(long id);
    public ArrayList<Produto> listarProdutos();
}
