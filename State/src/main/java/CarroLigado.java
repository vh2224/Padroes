public class CarroLigado implements CarroEstado {
    private CarroLigado(){};
    private static CarroLigado instance = new CarroLigado();
    public static CarroLigado getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public String ligado(Carro usuario) {
        return "Ligado";
    }

    @Override
    public String desligado(Carro usuario) {
        return "Carro Desligado";
    }

    @Override
    public String emMovimento(Carro usuario) {
        return "Carro Parado";
    }

}
