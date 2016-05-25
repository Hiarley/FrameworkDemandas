/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoDemanda;
import dao.IDaoDemanda;
import domain.Pedido;
import domain.Pagamento;
import excecao.DemandaInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorDemandas {

    private IDaoDemanda daoDemandas;
    private GerenciadorPagamento gerenciadorPagamento;
    private GerenciadorNotificao notificao = new GerenciadorNotificao();

    public GerenciadorDemandas() {
        daoDemandas = DaoDemanda.getInstance();

    }

    public void cadastrarDemanda(Pedido demanda, Pagamento pagamento, int opcao) throws DemandaInvalidoException {
        if (validarDemanda(demanda)) {
            this.daoDemandas.adicionarDemanda(demanda);
            switch (opcao) {
                case 1:
                    gerenciadorPagamento.adicionarPagamento(pagamento);
                    notificao.NotificarInicio(demanda);
                    break;
                default:
                    break;

            }
        }
    }

    public void removerDemanda(Pedido demanda) {
        this.daoDemandas.removerDemanda(demanda);
    }

    public ArrayList<Pedido> listarDemandas() {
        return this.daoDemandas.listarDemandas();
    }

    public Pedido getDemanda(Long codigo) {
        return this.daoDemandas.pegarDemanda(codigo);
    }

    private boolean validarDemanda(Pedido demanda) throws DemandaInvalidoException {
        if (demanda.getIdUsuarioSolicitante() < 0) {
            throw new DemandaInvalidoException("Solicitante não encontrado");

        } else if (demanda.getDescricao().equals("")) {
            throw new DemandaInvalidoException("Demanda estar vazia");

        } else if (daoDemandas.pegarDemanda(demanda.getIdDemanda()) != null) {
            throw new DemandaInvalidoException("ID da demanda invalido, contate o administrador.");

        }
        return true;
    }
}
