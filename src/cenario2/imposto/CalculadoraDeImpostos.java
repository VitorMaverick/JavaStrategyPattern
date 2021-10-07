package cenario2.imposto;

import cenario2.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {

        return imposto.calcula(orcamento);
    }


}
