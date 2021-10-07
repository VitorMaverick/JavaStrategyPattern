package cenario2.imposto;

import cenario2.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {
    @Override
    public BigDecimal calcula(Orcamento orcamento) {

        BigDecimal valor = orcamento.getValor();
        return valor.multiply(new BigDecimal("0.25"));
    }
}
