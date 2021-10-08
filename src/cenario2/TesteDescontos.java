package cenario2;

import cenario2.imposto.CalculadoraDeImpostos;
import cenario2.imposto.ICMS;
import cenario2.imposto.ISS;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200.00"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
