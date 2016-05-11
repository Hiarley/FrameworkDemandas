/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Demanda;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class DaoDemanda implements IDaoDemanda{
    
    static DaoDemanda daoDemanda = null;

    public DaoDemanda getInstance() {
        if(daoDemanda == null){
            daoDemanda = new DaoDemanda();
        }
        return daoDemanda;
    }
    
    @Override
    public void adicionarDemanda(Demanda demanda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerDemanda(Demanda demanda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarDemanda(Demanda demanda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Demanda pegarDemanda(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Demanda> listarDemandas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Demanda> listarDemandasSituacao(char status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
