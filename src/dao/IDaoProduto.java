/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.UsuarioCliente;
import domain.Demanda;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public interface IDaoProduto {
    public void adicionarProduto(Demanda produto);
    public void removerProduto(Demanda produto);
    public void atualizarProduto(Demanda produto);
    public Demanda pegarProduto(long id);
    public ArrayList<Demanda> listarProdutos();

    
}
