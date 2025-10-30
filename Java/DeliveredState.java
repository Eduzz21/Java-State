public class DeliveredState implements State {
    private Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja foi entregue e finalizado.");
    }

    @Override
    public void enviar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja foi entregue.");
    }

    @Override
    public void entregar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja foi entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Falaha: O Pedido " + order.getIdentificador() + " nao pode ser cancelado apos a entrega.");
    }
}