/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoDemanda;
import dao.IDaoDemanda;
import domain.Demanda;
import excecao.DemandaInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorDemandas {
    private IDaoDemanda daoDemandas;

    public GerenciadorDemandas() {
        daoDemandas = DaoDemanda.getInstance();
    }

    public void cadastrarDemanda(Demanda demanda) throws DemandaInvalidoException {
        if(demanda.validarDemanda()) {
            this.daoDemandas.adicionarDemanda(demanda);
        }
    }

    public void removerCliente(Demanda demanda) {
        this.daoDemandas.removerDemanda(demanda);
    }

    public ArrayList<Demanda> listarDemandas(){
        return this.daoDemandas.listarDemandas();
    }

    public Demanda getCliente(Long codigo) {
        return this.daoDemandas.pegarDemanda(codigo);
    }    
}
