package FactoryMethod;

public class Estoque implements IServico{

    public String executar() {
        return "adicionado ao estoque";
    }
    public String cancelar() {
        return "item não foi adicionado";
    }
}