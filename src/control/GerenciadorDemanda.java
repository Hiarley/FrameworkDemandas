/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoDemanda;
import dao.IDaoDemanda;
import domain.Demanda;
import domain.UsuarioPadrao;
import excecao.PedidoInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorDemanda {

    private IDaoDemanda daoDemanda;

    public GerenciadorDemanda() {
        daoDemanda = DaoDemanda.getInstance();
    }

    public void cadastrarDemanda(Demanda demanda) throws PedidoInvalidoException {
        if (validarDemanda(demanda)) {
            this.daoDemanda.adicionarDemanda(demanda);
        }
    }

    public void removerDemanda(Demanda demanda) {
        this.daoDemanda.removerDemanda(demanda);
    }

    public void atualizarDemanda(Demanda demanda) {
        this.daoDemanda.atualizarDemanda(demanda);
    }

    public ArrayList<Demanda> listarDemandas() {
        return this.daoDemanda.listarDemandas();
    }

    public Demanda getDemanda(Long id) {
        return this.daoDemanda.pegarDemanda(id);
    }
    
        private boolean validarDemanda(Demanda demanda) throws PedidoInvalidoException {
        if(demanda.getDescricao().equals("")){
            throw new PedidoInvalidoException("Descrição vazia.");
        }else if(demanda.getNome().equals("")){
            throw new PedidoInvalidoException("Nome vazio.");
            
        }else if(demanda.getPreco()<0){
            throw new PedidoInvalidoException("Valor invalido");
            
        }else if(this.daoDemanda.pegarDemanda(demanda.getIdDemanda()) != null){
            throw new PedidoInvalidoException("Demanda já cadastrado");
        }
        return true;
    }
}
