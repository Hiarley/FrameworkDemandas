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
    public void adicionarServico(Pedido demanda);
    public void removerServico(Pedido demanda);
    public void atualizarServico(Pedido demanda);
    public Pedido pegarServico(long id);
    public ArrayList<Pedido> listarServicos();
}
