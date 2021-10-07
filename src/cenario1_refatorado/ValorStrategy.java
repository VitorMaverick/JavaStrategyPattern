package cenario1_refatorado;

public class ValorStrategy implements IDescontoStrategy {
    @Override
    public double calculaDesconto(Pedido pedido) {
        if (pedido.getTotal() > 500) {
            // ...
            return pedido.getTotal() - (0.15 * pedido.getTotal());

        } else if (pedido.getTotal() > 300) {
            // ...
            return pedido.getTotal() - (0.10 * pedido.getTotal());
        } else {
            return pedido.getTotal();
        }
    }
}
