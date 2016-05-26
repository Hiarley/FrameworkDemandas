/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DaoServico;
import dao.IDaoServico;
import domain.Pedido;
import domain.Pagamento;
import excecao.DemandaInvalidoException;
import java.util.ArrayList;

/**
 *
 * @author hiarl
 */
public class GerenciadorServicos {

    private IDaoServico daoServicos;
    private GerenciadorPagamento gerenciadorPagamento;
    private GerenciadorNotificao notificao = new GerenciadorNotificao();

    public GerenciadorServicos() {
        daoServicos = DaoServico.getInstance();

    }

    public void cadastrarServico(Pedido demanda, Pagamento pagamento, int opcao) throws DemandaInvalidoException {
        if (validarServico(demanda)) {
            this.daoServicos.adicionarServico(demanda);
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

    public void removerServico(Pedido demanda) {
        this.daoServicos.removerServico(demanda);
    }

    public ArrayList<Pedido> listarServicos() {
        return this.daoServicos.listarServicos();
    }

    public Pedido getServico(Long codigo) {
        return this.daoServicos.pegarServico(codigo);
    }

    private boolean validarServico(Pedido demanda) throws DemandaInvalidoException {
        if (demanda.getIdUsuarioSolicitante() < 0) {
            throw new DemandaInvalidoException("Solicitante não encontrado");

        } else if (demanda.getDescricao().equals("")) {
            throw new DemandaInvalidoException("Servico estar vazia");

        } else if (daoServicos.pegarServico(demanda.getIdServico()) != null) {
            throw new DemandaInvalidoException("ID da demanda invalido, contate o administrador.");

        }
        return true;
    }
}
