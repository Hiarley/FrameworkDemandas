/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import domain.Demanda;
import domain.NotaFiscal;
import domain.NotaFiscalBuilder;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class NotaFiscalBuilderFastFood implements NotaFiscalBuilder{

    private String nomeEmpresa;
    private String nomeCliente;
    private Long codigo;
    private Date dataFaturamento;
    private int valorTotal;
    private List<Demanda> demandas;

    @Override
    public void buildCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public void buildEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public void buildCodigoPedido(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public void buildDataFaturamento(Date dataFaturamento) {
        this.dataFaturamento = dataFaturamento;
    }

    @Override
    public void buildDemandas(List<Demanda> demandas) {
        this.demandas = demandas;
    }

    @Override
    public void buildValorTotal() {
        for (Demanda produto : demandas) {

                Alimento alimento = (Alimento) produto;
                valorTotal += alimento.getPreco();
               
        }
    }

    @Override
    public NotaFiscal getComprovante() {
        return new NotaFiscalFastFood(nomeEmpresa, nomeCliente, codigo, dataFaturamento, valorTotal, demandas);
    }
    
}