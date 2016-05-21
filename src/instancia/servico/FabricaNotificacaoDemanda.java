/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import domain.Demanda;
import domain.NotificaSMS;
import domain.Notificacao;
import domain.Produto;
import domain.Servico;
import java.util.List;

/**
 *
 * @author hiarl
 */
public class FabricaNotificacaoDemanda{
    public void NotificaoPeidoRealizado(Demanda demanda){
        System.out.println("Novo Pedido Realizado\n");
        System.out.println("idUsuarioSolicitante: " + demanda.getIdUsuarioSolicitante() + "\n");
        System.out.println("idDemanda: " + demanda.getIdDemanda() +"\n");
        System.out.println("dataAbertura: " + demanda.getDataAbertura() + "\n");
        System.out.println("idUsuarioDemandado: " + demanda.getIdUsuarioDemandando() + "\n");
        System.out.println("descricao: " + demanda.getDescricao()+"\n");
        System.out.println("status: " + demanda.getStatus() + "\n");
        System.out.println("Com o seguintes servicos: " + "\n");
        
        List<Produto> listProdutos = demanda.getListaProdutos();
        for(Produto produto : listProdutos){
            
            Servico servico = (Servico) produto;
            System.out.println("Nome" + servico.getNome());
            System.out.println("IdProduto: " + servico.getIdProduto());
            System.out.println("Empresa Fornecedora: " + servico.getEmpresaFornecedora());
            System.out.println("Preco: " + servico.getPreco());
            System.out.println("Descricao: " + servico.getDescricao());
            System.out.println("Prazo: " + servico.getPrazo());
        }
        
        
    }
}
