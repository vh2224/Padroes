package Decorator;

public class Estabilidade extends CarroDecorator {

    public Estabilidade (float carro) {
        super(carro);
    }

    public float getPercentualDesempenho() {
        return 20.0f;
    }

    @Override
    public float getDesempenhoCarro() {
        return 55000;
    }

}
