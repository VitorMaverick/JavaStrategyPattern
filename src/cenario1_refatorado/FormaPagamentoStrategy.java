package cenario1_refatorado;

import cenario1.FormaPagamento;

public class FormaPagamentoStrategy implements IDescontoStrategy {

    @Override
    public double calculaDesconto(Pedido pedido) {
        if (pedido.getPagamento().equals(FormaPagamento.APRAZO)) {
            // ...
            return pedido.getTotal() - (0.20 * pedido.getTotal());
        }
        if (pedido.getPagamento().equals(FormaPagamento.CARTAO)) {
            // ...
            return pedido.getTotal() - (0.05 * pedido.getTotal());
        }
        return pedido.getTotal();
    }
}
