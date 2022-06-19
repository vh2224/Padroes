public class Carro {
    private String nome;
    private CarroEstado estado;

    public Carro(){
        this.estado = CarroLigado.getInstance();
    }

    public void setEstado(CarroEstado estado){
        this.estado = estado;
    }

    public String ligado(){
        return estado.ligado(this);
    }

    public String desligado(){
        return estado.desligado(this);
    }

    public String emMovimento(){
        return estado.emMovimento(this);
    }


}
