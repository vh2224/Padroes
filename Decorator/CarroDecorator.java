package Decorator;

public abstract class CarroDecorator implements Carro {

    private Carro carro;

    public CarroDecorator(float carro) {
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPercentualDesempenho();

    public float getValorDesempenho() {
        return this.carro.getDesempenhoCarro() * (1 + (this.getPercentualDesempenho() / 100));
    }
}
