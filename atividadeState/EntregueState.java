public class EntregueState implements OrderState{
    private Order order;

    public EntregueState(Order order){
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Pedido ja finalizado");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido ja finalizado");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido ja finalizado");
    }

    @Override
    public void cancelar() {
        System.out.println("Nao é possivel cancelar um pedido entregue");
    }
}

