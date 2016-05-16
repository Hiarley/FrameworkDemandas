/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Cliente;
import domain.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoProduto implements IDaoProduto{

    static DaoProduto daoProduto = null;
    private Set<Produto> produtos;

    public static DaoProduto getInstance() {
        if(daoProduto == null){
            daoProduto = new DaoProduto();
        }
        return daoProduto;
    }
        
    
    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        Iterator<Produto> it = produtos.iterator();
		while(it.hasNext()) {
			Produto p = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(p.getIdProduto() == produto.getIdProduto()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarProduto(Produto produto) {
        Iterator<Produto> it = produtos.iterator();
		while(it.hasNext()) {
			Produto p = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(p.getIdProduto() == produto.getIdProduto()) {
				p = produto;
				return;
                    }    
                }
    }

    @Override
    public Produto pegarProduto(long id) {
        Iterator<Produto> it = produtos.iterator();
		while(it.hasNext()) {
			Produto p = it.next();
			
			if(p.getIdProduto() == (id)) {
				return p;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Produto> listarProdutos() {
        ArrayList<Produto> resultList = new ArrayList<>();
		
		Iterator<Produto> it = produtos.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }
    
}
