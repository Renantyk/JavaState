public class Order {
    private OrderState state;

    public Order(){
        this.state = new NovoState(this);
    }

    public void setState(OrderState state){
        this.state = state;
    }

    public void pagar(){
        state.pagar();
    }

    public void enviar(){
        state.enviar();
    }

    public void entregar(){
        state.entregar();
    }

    public void cancelar(){
        state.cancelar();
    }

    public String getEstadoAtual() {
        return state.getClass().getSimpleName();
    }
}
