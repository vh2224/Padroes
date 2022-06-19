public class CarroEmMovimento implements CarroEstado {
    private CarroEmMovimento(){};
    private static CarroEmMovimento instance = new CarroEmMovimento();
    public static CarroEmMovimento getInstance(){
        return instance;
    }

    @Override
    public String getEstado() {
        return "Executando";
    }

    @Override
    public String ligado(Carro usuario) {
        return "Ligado";
    }

    @Override
    public String desligado(Carro usuario) {
        return "Desligado";
    }

    @Override
    public String emMovimento(Carro usuario) {
        return "Carro em Movimento";
    }

}
