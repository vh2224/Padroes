

public class Potencia extends CarroDecorator {

    public Potencia (Carro carro) {
        super(carro);
    }

    public float getPercentualDesempenho() {
        return 30.0f;
    }

    @Override
    public float getDesempenhoCarro() {
        return 0;
    }
}