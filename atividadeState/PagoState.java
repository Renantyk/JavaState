public class PagoState implements OrderState{
    private Order order;

    public PagoState(Order order){
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("O pedido ja foi pago");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido enviado");
        order.setState(new EnviadoState(order));
    }

    @Override
    public void entregar() {
        System.out.println("O pedido ainda nao foi enviado");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado");
        order.setState(new CanceladoState(order));
    }
}
