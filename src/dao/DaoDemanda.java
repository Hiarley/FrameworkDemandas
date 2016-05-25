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
public class DaoDemanda implements IDaoDemanda{
    
    static DaoDemanda daoDemanda = null;
    private Set<Pedido> demandas;

    public static DaoDemanda getInstance() {
        if(daoDemanda == null){
            daoDemanda = new DaoDemanda();
        }
        return daoDemanda;
    }

    public DaoDemanda() {
        demandas = new HashSet<>();
    }
    
    
    
    @Override
    public void adicionarDemanda(Pedido demanda) {
        demandas.add(demanda);
    }

    @Override
    public void removerDemanda(Pedido demanda) {
        Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			Pedido d = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(d.getIdDemanda() == demanda.getIdDemanda()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarDemanda(Pedido demanda) {
        Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			Pedido d = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(d.getIdDemanda() == demanda.getIdDemanda()) {
				d = demanda;
				return;
                    }    
                }
    }

    @Override
    public Pedido pegarDemanda(long id) {
        Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			Pedido d = it.next();
			
			if(d.getIdDemanda() == (id)) {
				return d;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Pedido> listarDemandas() {
        ArrayList<Pedido> resultList = new ArrayList<>();
		
		Iterator<Pedido> it = demandas.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }

    
}
