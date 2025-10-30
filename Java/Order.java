public class Order {
    private State state; 
    private String identificador;
    
    public Order(String identificador) {
        this.identificador = identificador;
 
        this.state = new NewState(this); 
        System.out.println("Pedido " + identificador + " criado. Sitaucao inicial: Pedido adicionado.");
    }

   
    public void setState(State newState) { 
        this.state = newState;

        String nomeEstado = newState.getClass().getSimpleName().replace("State", "").toUpperCase();
        System.out.println("=== Pedido " + identificador + " mudou para a situacao: " + nomeEstado);
    }

  
    public void pagar() {
        state.pagar();
    }
    
    public void enviar() {
        state.enviar();
    }
    
    public void entregar() {
        state.entregar();
    }
    
    public void cancelar() {
        state.cancelar();
    }
    
    public String getIdentificador() {
        return identificador;
    }
}