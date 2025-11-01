public class Main {
    public static void main(String[] args) {
        Order pedido = new Order();

        System.out.println("Estado atual: " + pedido.getEstadoAtual());
        pedido.enviar();
        pedido.pagar();
        System.out.println("Estado atual: " + pedido.getEstadoAtual());
        pedido.enviar();
        pedido.entregar();
        System.out.println("Estado atual: " + pedido.getEstadoAtual());
        pedido.cancelar();
    }
}
