public class ShippedState implements State {
    private Order order;

    public ShippedState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja está pago e em transito.");
    }

    @Override
    public void enviar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja foi enviado.");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido " + order.getIdentificador() + " foi confirmado como entregue ao cliente.");
        order.setState(new DeliveredState(order));
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido " + order.getIdentificador() + " cancelado enquanto estava em trânsito. Iniciando logística reversa.");
        order.setState(new CanceledState(order));
    }
}