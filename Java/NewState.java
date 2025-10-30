public class NewState implements State {
    private Order order;

    public NewState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento do Pedido " + order.getIdentificador() + " registrado com sucesso.");
        order.setState(new PaidState(order));
    }

    @Override
    public void enviar() {
        System.out.println("Falha: O Pedido " + order.getIdentificador() + " nao pode ser enviado antes do pagamento.");
    }

    @Override
    public void entregar() {
        System.out.println("Falha: O Pedido " + order.getIdentificador() + " nao pode ser entregue, ainda está como NOVO.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido " + order.getIdentificador() + " cancelado antes do pagamento.");

        order.setState(new CanceledState(order));
    }
}