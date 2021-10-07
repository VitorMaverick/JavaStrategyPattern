package cenario2.imposto;

import cenario2.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcula(Orcamento orcamento);
}
