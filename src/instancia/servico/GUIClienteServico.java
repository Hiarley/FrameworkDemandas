/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import GUI.GUICliente;
import control.GerenciadorDemandas;
import control.GerenciadorProduto;
import domain.Demanda;
import domain.Produto;
import domain.Servico;
import domain.UsuarioPadrao;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Thiago
 */
public class GUIClienteServico implements GUICliente{
    
    private static Scanner in = new Scanner(System.in);
    private GerenciadorProduto gerenciadorProduto = new GerenciadorProduto();
    private GerenciadorDemandas gerenciadorDemanda = new GerenciadorDemandas();
    private static AtomicInteger count = new AtomicInteger(0); 
    
    @Override
    public void cadastrarPedido() {
        try {
            ArrayList<Produto> listaProdutos = new ArrayList<>();
            System.out.println("---------- Cadastrar Pedido----------");
            System.out.println("id Cliente: ");
            long nome = in.nextLong();
            System.out.println("Descrição: ");
            String setor = in.nextLine();
            System.out.println("Quantos servicos deseja adicionar?");
            int servicos = in.nextInt();
            for(;servicos < 0;servicos--){
                ListarProdutos();
                System.out.println("Digite o IdProduto do servico escolhido: ");
                long id = in.nextLong();
                listaProdutos.add(gerenciadorProduto.getProduto(id));
            }
            
            Demanda demanda = new Demanda(nome, count.incrementAndGet(), null, nome, setor, 'a', listaProdutos);
            gerenciadorDemanda.cadastrarDemanda(demanda);
        } catch (Exception e) {

        }
    }
    
    public void ListarProdutos(){
        try {
            List<Produto> listProdutos = gerenciadorProduto.listarProdutos();
        
        for(Produto produto : listProdutos){
            
            Servico servico = (Servico) produto;
            System.out.println("Nome" + servico.getNome());
            System.out.println("IdProduto: " + servico.getIdProduto());
            System.out.println("Empresa Fornecedora: " + servico.getEmpresaFornecedora());
            System.out.println("Preco: " + servico.getPreco());
            System.out.println("Descricao: " + servico.getDescricao());
            System.out.println("Prazo: " + servico.getPrazo());
        }
        } catch (Exception e) {
        }
    }
}
