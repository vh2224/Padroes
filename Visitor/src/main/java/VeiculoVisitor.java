public class VeiculoVisitor implements Visitor {

    public String cadastrar(Carro carro) {
        return carro.accept(this);
    }

    @Override
    public String cadastrarCarro(Carro carro) {
        return "Carro{" +
                "renavam=" + carro.getRenavam() +
                ", marca='" + carro.getMarca() + '\'' +
                ", modelo='" + carro.getModelo() + '\'' +
                ", cor='" + carro.getCor() + '\'' +
                ", anoFabricacao=" + carro.getAnoFabricacao() +
                '}';
    }

}