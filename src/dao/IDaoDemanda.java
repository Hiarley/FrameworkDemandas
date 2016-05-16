/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import instanciaservico.Demanda;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoDemanda {
    public void adicionarDemanda(Demanda demanda);
    public void removerDemanda(Demanda demanda);
    public void atualizarDemanda(Demanda demanda);
    public Demanda pegarDemanda(long id);
    public ArrayList<Demanda> listarDemandas();
    public IDaoDemanda getInstance();
}
