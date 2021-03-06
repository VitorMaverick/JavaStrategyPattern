package cenario1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private FormaPagamento pagamento;
    private Cliente cliente;
    private List<Item> itens;

    public Pedido(FormaPagamento pagamento, Cliente cliente, List<Item> itens) {
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.itens = itens;
    }

    public double getTotal() {
        double total = 0;
        return total;
    }

    public double getTotalComDesconto() {
        if (pagamento.equals(FormaPagamento.APRAZO)) {
            // ...
            return getTotal() - (0.20 * getTotal());
        }
        if (pagamento.equals(FormaPagamento.CARTAO)) {
            // ...
            return getTotal() - (0.05 * getTotal());
        }
        else if (getTotal() > 500) {
            // ...
            return getTotal() - (0.15 * getTotal());

        } else if (getTotal() > 300) {
            // ...
            return getTotal() - (0.10 * getTotal());
        }

        return getTotal();
    }
}
