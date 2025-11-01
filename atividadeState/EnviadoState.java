public class EnviadoState implements OrderState{
    private Order order;

    public EnviadoState(Order order){
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("O pedido ja foi pago");
    }

    @Override
    public void enviar() {
        System.out.println("O pedido ja foi enviado");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregue ao cliente");
        order.setState(new EntregueState(order));
    }

    @Override
    public void cancelar() {
        System.out.println("Nao é possivel cancelar um pedido ja enviado");
    }
}
