package FactoryMethod;

public class BuscarFuncionario implements IServico{

    public String executar() {
        return "Funcionario encontrado";
    }

    public String cancelar() {
        return "Busca não realizada";
    }
}