package FactoryMethod;

public class BuscarProdutosVencidos implements IServico{

    public String executar() {
        return "Produto Vencido Encontrado";
    }

    public String cancelar() {
        return "Produto vencido não encontrado";
    }
}