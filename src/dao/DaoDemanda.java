/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Demanda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author hiarl
 */
public class DaoDemanda implements IDaoDemanda{
    
    static DaoDemanda daoDemanda = null;
    private Set<Demanda> demandas;

    public DaoDemanda getInstance() {
        if(daoDemanda == null){
            daoDemanda = new DaoDemanda();
        }
        return daoDemanda;
    }
    
    @Override
    public void adicionarDemanda(Demanda demanda) {
        demandas.add(demanda);
    }

    @Override
    public void removerDemanda(Demanda demanda) {
        Iterator<Demanda> it = demandas.iterator();
		while(it.hasNext()) {
			Demanda d = it.next();
			
			//Remove o objeto armazenado se o codigo for igual
			if(d.getIdDemanda() == demanda.getIdDemanda()) {
				it.remove();
				return;
			}
		}
    }

    @Override
    public void atualizarDemanda(Demanda demanda) {
        Iterator<Demanda> it = demandas.iterator();
		while(it.hasNext()) {
			Demanda d = it.next();
			
			//Atualiza objeto armazenado se o codigo for igual
			if(d.getIdDemanda() == demanda.getIdDemanda()) {
				d = demanda;
				return;
                    }    
                }
    }

    @Override
    public Demanda pegarDemanda(long id) {
        Iterator<Demanda> it = demandas.iterator();
		while(it.hasNext()) {
			Demanda d = it.next();
			
			if(d.getIdDemanda() == (id)) {
				return d;
			}
		}
		
		return null;
    }

    @Override
    public ArrayList<Demanda> listarDemandas() {
        ArrayList<Demanda> resultList = new ArrayList<>();
		
		Iterator<Demanda> it = demandas.iterator();
		while(it.hasNext()) {
			resultList.add(it.next());
		}
		
		return resultList;
    }

    
}
