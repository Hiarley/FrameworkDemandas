 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Pedido;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoServico implements IDaoServico{
    
    static DaoServico daoServico = null;
    private Set<Pedido> demandas;

    public static DaoServico getInstance() {
        if(daoServico == null){
            daoServico = new DaoServico();
        }
        return daoServico;
    }

    public DaoServico() {
        demandas = new HashSet<>();
    }
    
    
    
    @Override
    public void adicionarServico(Pedido demanda) {
        demandas.add(demanda);
    }

    @Override
    public void removerServico(Pedido demanda) {
        Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			Pedido d = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(d.getIdServico() == demanda.getIdServico()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarServico(Pedido demanda) {
        Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			Pedido d = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(d.getIdServico() == demanda.getIdServico()) {
				d = demanda;
				return;
                    }    
                }
    }

    @Override
    public Pedido pegarServico(long id) {
        Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			Pedido d = it.next();
			
			if(d.getIdServico() == (id)) {
				return d;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Pedido> listarServicos() {
        ArrayList<Pedido> resultList = new ArrayList<>();
		
		Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }

    
}
