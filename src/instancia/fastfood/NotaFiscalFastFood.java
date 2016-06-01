/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancia.fastfood;

import domain.Demanda;
import domain.NotaFiscal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class NotaFiscalFastFood extends NotaFiscal{

    public NotaFiscalFastFood(String empresa, String nomeCliente, Long codigo, Date dataFaturamento, List<Demanda> demandas) {
        super(empresa, nomeCliente, codigo, dataFaturamento, demandas);
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
