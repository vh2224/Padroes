import java.util.Observable;
import java.util.Observer;

public class Carro implements Observer {

    private String modelo;
    private String notificar;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String notificar() {
        return this.notificar;
    }

    public void cadastrar(Concessionaria concessionaria) {
        concessionaria.addObserver(this);
    }

    public void update(Observable concessionaria, Object arg1) {
        this.notificar = this.modelo + ", carro cadastrado na " + concessionaria.toString();

    }
}