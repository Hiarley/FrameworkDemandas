/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import domain.Pedido;
import domain.FabricaNotificacao;
import domain.Historico;
import domain.Notificacao;

/**
 *
 * @author Thiago
 */
public class GerenciadorNotificao {

    private FabricaNotificacao fabricaNotificacao;
    private Notificacao notificao;

    public GerenciadorNotificao() {
    }
    
    public void NotificarInicio(Pedido demanda){
        fabricaNotificacao.NotificarInicioDemanda(demanda);
        notificao.enviar();
    }
    
    public void NotificarAtualizacao(Historico historico){
        fabricaNotificacao.NotificarAtualizacaoDemanda(historico);
        notificao.enviar();
    }
}
