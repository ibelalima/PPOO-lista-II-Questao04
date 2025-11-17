package scr;
public class ServicoEstoque {
    public static boolean isAvailable(Produto product){
        System.out.println("Verificando estoque do produto: " + product.name);
        return true;
    }
}

