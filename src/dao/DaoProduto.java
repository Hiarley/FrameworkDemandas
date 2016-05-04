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
 * @author hiarl
 */
public class DaoProduto implements IDaoProduto{

    static DaoProduto daoProduto = null;

    public static DaoProduto getInstance() {
        if(daoProduto == null){
            daoProduto = new DaoProduto();
        }
        return daoProduto;
    }
        
    
    @Override
    public void adicionarProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente pegarProduto(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> listarProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
