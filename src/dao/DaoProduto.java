/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.UsuarioCliente;
import domain.Demanda;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoProduto implements IDaoProduto{

    static DaoProduto daoProduto = null;
    private Set<Demanda> produtos;

    public static DaoProduto getInstance() {
        if(daoProduto == null){
            daoProduto = new DaoProduto();
        }
        return daoProduto;
    }

    public DaoProduto() {
        produtos = new HashSet<>();
    }
    
    
        
    
    @Override
    public void adicionarProduto(Demanda produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Demanda produto) {
        Iterator<Demanda> it = produtos.iterator();
		while(it.hasNext()) {
			Demanda p = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(p.getIdProduto() == produto.getIdProduto()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarProduto(Demanda produto) {
        Iterator<Demanda> it = produtos.iterator();
		while(it.hasNext()) {
			Demanda p = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(p.getIdProduto() == produto.getIdProduto()) {
				p = produto;
				return;
                    }    
                }
    }

    @Override
    public Demanda pegarProduto(long id) {
        Iterator<Demanda> it = produtos.iterator();
		while(it.hasNext()) {
			Demanda p = it.next();
			
			if(p.getIdProduto() == (id)) {
				return p;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Demanda> listarProdutos() {
        ArrayList<Demanda> resultList = new ArrayList<>();
		
		Iterator<Demanda> it = produtos.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }
    
}
