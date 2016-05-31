/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.estoque;

import instancia.servico.*;
import control.GerenciadorClientes;
import control.GerenciadorPedidos;
import domain.Pedido;
import domain.FabricaNotificacao;
import domain.Historico;
import instancia.servico.NotificaSMS;
import domain.Notificacao;
import domain.Demanda;
import instancia.servico.Servico;
import domain.UsuarioCliente;
import java.util.List;

/**
 *
 * @author hiarl
 */
public class FabricaNotificacaoEstoque implements FabricaNotificacao{
    
    
    
    private GerenciadorClientes gerenciadorCliente = new GerenciadorClientes();
    private GerenciadorPedidos gerenciadorServico = new GerenciadorPedidos(this);
    
    @Override
    public Notificacao NotificarInicioDemanda(Pedido pedido){
        UsuarioCliente usuariocliente = gerenciadorCliente.getCliente(pedido.getIdUsuarioDemandando());
        String mensagem = null;
        mensagem+="Olá, ";
        mensagem+=usuariocliente.getTelefone();
        mensagem+="!Um novo Pedido Realizado com o seu Id!!\n";
        mensagem+="idUsuarioSolicitante: " + pedido.getIdUsuarioSolicitante() + "\n";
        mensagem+="idDemanda: " + pedido.getIdServico() +"\n";
        mensagem+="dataAbertura " + pedido.getDataAbertura() + "\n";
        mensagem+="descricao: " + pedido.getDescricao()+"\n";
        mensagem+="status: " + pedido.getStatus() + "\n";
        mensagem+="Com o seguintes servicos: " + "\n";
        
        List<Demanda> listDemanda = pedido.getListaProdutos();
        for(Demanda produto : listDemanda){
            
            Item item = (Item) produto;
            mensagem+="Nome" + item.getNome();
            mensagem+="IdProduto: " + item.getIdDemanda();
            mensagem+="Quantidade: " + item.getQuantidadeEmEstoque();
            mensagem+="Preco: " + item.getPreco();
            mensagem+="Descricao: " + item.getDescricao();
            mensagem+="Prazo: " + item.getPrazo();
        }
        
        return new NotificaWhatsapp(mensagem);

            
        };

    @Override
    public Notificacao NotificarAtualizacaoDemanda(Historico historico) {
        Pedido demanda = gerenciadorServico.getPedido(historico.getIdDemanda());
        UsuarioCliente usuarioCliente = gerenciadorCliente.getCliente(demanda.getIdUsuarioDemandando());
        String mensagem = null;
        mensagem+="Olá, ";
        mensagem+=usuarioCliente.getTelefone();         
        mensagem+="!Uma nova atualização foi feita no seu Pedido:\n";
        mensagem+="Na Data: ";
        mensagem+=historico.getDataModificaco();
        mensagem+="\nDescricao:\n";
        mensagem+=historico.getDescricao();
        
                  
        return new NotificaWhatsapp(mensagem);
    }
        
    }


