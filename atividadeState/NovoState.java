public class NovoState implements OrderState{

    private Order order;

    public NovoState(Order order){
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado");
        order.setState(new PagoState(order));
    }

    @Override
    public void enviar() {
        System.out.println("Nao é possivel enviar um pedido nao pago");
    }

    @Override
    public void entregar() {
        System.out.println("Nao é possivel entregar um pedido nao pago");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado com sucesso");
        order.setState(new CanceladoState(order));
    }
    
}
