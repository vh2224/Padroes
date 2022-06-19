public class CarroDesligado implements CarroEstado {
    private CarroDesligado(){};
    private static CarroDesligado instance = new CarroDesligado();
    public static CarroDesligado getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Falhando";
    }

    @Override
    public String ligado(Carro usuario) {
        return "Desligado";
    }

    @Override
    public String desligado(Carro usuario) {
        return "Desligado";
    }

    @Override
    public String emMovimento(Carro usuario) {
        return "Carro Parado";
    }
}
