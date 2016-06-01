/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.servico;

import domain.Demanda;
import domain.NotaFiscal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class NotaFiscalServico extends NotaFiscal {

    public NotaFiscalServico(String empresa, String nomeCliente, Long codigo, Date dataFaturamento, List<Demanda> demandas) {
        super(empresa, nomeCliente, codigo, dataFaturamento, demandas);
    }

    @Override
    public void imprimir() {
        String nota = "------Nota Fiscal------"+"\n";
        nota += getEmpresa()+"\n";
        nota += "---------------------------";
        nota += "ID da Nota:" + getCodigo() + "\n";
        nota += "Nome do Cliente: " + getNomeCliente() + "\n";
        nota += "Data de Faturamento: " + getDataFaturamento() + "\n";

        nota += "Com o seguintes servicos: " + "\n";

        for (Demanda produto : getDemandas()) {
            Servico servico = (Servico) produto;
            nota += "Nome" + servico.getNome();
            nota += "IdProduto: " + servico.getIdDemanda();
            nota += "Preco: " + servico.getPreco();
            nota += "Descricao: " + servico.getDescricao();
            nota += "Prazo: " + servico.getPrazo();
        }
    }

}
