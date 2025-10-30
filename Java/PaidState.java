public class PaidState implements State {
    private Order order;

    public PaidState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja está pago.");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido " + order.getIdentificador() + " foi despachado para a transportadora.");
        order.setState(new ShippedState(order));
    }

    @Override
    public void entregar() {
        System.out.println("Falha: O Pedido " + order.getIdentificador() + " deve ser ENVIADO antes de ser entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido " + order.getIdentificador() + " cancelado apos o pagamento. Processando estorno.");
        order.setState(new CanceledState(order));
    }
}