/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoHistorico;
import domain.Historico;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorHistoricos {
    private DaoHistorico daoHistorico;

    public GerenciadorHistoricos() {
        daoHistorico = DaoHistorico.getInstance();
    }

    public void adicionarHistorico(Historico historico){
        if(historico.validarHistorico()) {
            this.daoHistorico.adicionarHistorico(historico);
        }
    }

    public void removerHistorico(Historico historico) {
        this.daoHistorico.removerHistorico(historico);
    }

    public ArrayList<Historico> listarHistorico(long idDemanda){
        return this.daoHistorico.pegarHistorico(idDemanda);
    }


}
