public class CanceladoState implements OrderState{
    private Order order;

    public CanceladoState(Order order){
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Nao é possivel pagar um pedido cancelado");
    }

    @Override
    public void enviar() {
        System.out.println("Nao é possivel enviar um pedido cancelado");
    }

    @Override
    public void entregar() {
        System.out.println("Nao é possivel entregar um pedido cancelado");
    }

    @Override
    public void cancelar() {
        System.out.println("O pedido ja esta cancelado");
    }
}

