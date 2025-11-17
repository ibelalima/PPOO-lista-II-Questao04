public class PedidoFacade {

    public boolean processarPedido(Produto produto){
        System.out.println("Iniciando processamento do pedido...");

        if(!ServicoEstoque.isAvailable(produto)){
            System.out.println("Produto indisponível no estoque.");
            return false;
        }

        if(!ServicoPagamento.makePayment()){
            System.out.println("Falha no pagamento.");
            return false;
        }

        ServicoRemessa.shipProduct(produto);

        System.out.println("Pedido processado com sucesso!");
        return true;
    }
}
