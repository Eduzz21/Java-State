
public  class CanceledState implements State {
    private Order order;

    public CanceledState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Falha: O Pedido " + order.getIdentificador() + " esta cancelado e nao pode ser pago.");
    }

    @Override
    public void enviar() {
        System.out.println("Falha: O Pedido " + order.getIdentificador() + " esta cancelado e nao pode ser enviado.");
    }

    @Override
    public void entregar() {
        System.out.println("Falha: O Pedido " + order.getIdentificador() + " esta cancelado e nao pode ser entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Atencao: O Pedido " + order.getIdentificador() + " ja esta cancelado.");
    }
} 
    

