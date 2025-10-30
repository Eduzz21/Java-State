public class Main {
    public static void main(String[] args) {
        
        // Cenário 1: Fluxo de Sucesso
        System.out.println(" Cenario 1: Processo Completo ");
        Order pedido1 = new Order("A1001");
        
        pedido1.enviar(); 
        pedido1.pagar(); 
        pedido1.pagar();
        pedido1.enviar();
        pedido1.entregar();
        pedido1.cancelar();
        
        
        // Cenário 2: Fluxo de Cancelamento
        System.out.println("\n Cenario 2: Processo de cancelamento");
        Order pedido2 = new Order("B2002");
    
        pedido2.pagar();
        pedido2.cancelar();
        pedido2.enviar();
        pedido2.pagar();
    }
}