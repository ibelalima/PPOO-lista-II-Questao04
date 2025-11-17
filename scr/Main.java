package scr;
public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto(1, "Fone Bluetooth");
        PedidoFacade pedidoFacade = new PedidoFacade();

        boolean resultado = pedidoFacade.processarPedido(produto);

        if(resultado){
            System.out.println("Fluxo concluído!");
        } else {
            System.out.println("Falha no processamento.");
        }
    }
}
