/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Pedido;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public interface IDaoServico {
    public void adicionarDemanda(Pedido demanda);
    public void removerDemanda(Pedido demanda);
    public void atualizarDemanda(Pedido demanda);
    public Pedido pegarDemanda(long id);
    public ArrayList<Pedido> listarDemandas();
}
