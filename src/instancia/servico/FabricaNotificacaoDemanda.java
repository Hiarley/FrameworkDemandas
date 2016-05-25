/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import control.GerenciadorClientes;
import control.GerenciadorDemandas;
import domain.Pedido;
import domain.FabricaNotificacao;
import domain.Historico;
import domain.NotificaSMS;
import domain.Notificacao;
import domain.Demanda;
import domain.Servico;
import domain.UsuarioCliente;
import java.util.List;

/**
 *
 * @author hiarl
 */
public class FabricaNotificacaoDemanda implements FabricaNotificacao{
    
    
    
    private GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    private GerenciadorDemandas gerenciadorDemandas = new GerenciadorDemandas();
    
    @Override
    public Notificacao NotificarInicioDemanda(Pedido demanda){
        UsuarioCliente usuariocliente = gerenciadorCliente.getCliente(demanda.getIdUsuarioDemandando());
        String mensagem = null;
        mensagem+="Olá, ";
        mensagem+=usuariocliente.getTelefone();
        mensagem+="!Um novo Pedido Realizado com o seu Id!!\n";
        mensagem+="idUsuarioSolicitante: " + demanda.getIdUsuarioSolicitante() + "\n";
        mensagem+="idDemanda: " + demanda.getIdDemanda() +"\n";
        mensagem+="dataAbertura: " + demanda.getDataAbertura() + "\n";
        mensagem+="idUsuarioDemandado: " + demanda.getIdUsuarioDemandando() + "\n";
        mensagem+="descricao: " + demanda.getDescricao()+"\n";
        mensagem+="status: " + demanda.getStatus() + "\n";
        mensagem+="Com o seguintes servicos: " + "\n";
        
        List<Demanda> listProdutos = demanda.getListaProdutos();
        for(Demanda produto : listProdutos){
            
            Servico servico = (Servico) produto;
            mensagem+="Nome" + servico.getNome();
            mensagem+="IdProduto: " + servico.getIdProduto();
            mensagem+="Empresa Fornecedora: " + servico.getEmpresaFornecedora();
            mensagem+="Preco: " + servico.getPreco();
            mensagem+="Descricao: " + servico.getDescricao();
            mensagem+="Prazo: " + servico.getPrazo();
        }
        
        return new NotificaSMS(mensagem);

            
        };

    @Override
    public Notificacao NotificarAtualizacaoDemanda(Historico historico) {
        Pedido demanda = gerenciadorDemandas.getDemanda(historico.getIdDemanda());
        UsuarioCliente usuarioCliente = gerenciadorCliente.getCliente(demanda.getIdUsuarioDemandando());
        String mensagem = null;
        mensagem+="Olá, ";
        mensagem+=usuarioCliente.getTelefone();         
        mensagem+="!Uma nova atualização foi feita no seu Pedido:\n";
        mensagem+="Na Data: ";
        mensagem+=historico.getDataModificaco();
        mensagem+="\nDescricao:\n";
        mensagem+=historico.getDescricao();
        
                  
        return new NotificaSMS(mensagem);
    }
        
    }


