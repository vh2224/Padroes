package Prototype;

public class Gremlim implements Cloneable{

    private float altura;
    private String nome;
    private boolean bagunceiro;
    private boolean molhado;

    public Gremlim(float altura, String nome, boolean bagunceiro, boolean molhado) {
        this.altura = altura;
        this.nome = nome;
        this.bagunceiro = bagunceiro;
        this.molhado = molhado;
    }

    public boolean isMolhado() {
        return molhado;
    }

    public void setMolhado(boolean molhado) {
        this.molhado = molhado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isBagunceiro() {
        return bagunceiro;
    }

    public void setBagunceiro(boolean bagunceiro) {
        this.bagunceiro = bagunceiro;
    }

    public Gremlim clone() throws CloneNotSupportedException {
        Gremlim gremlimClone =(Gremlim)super.clone();
        return gremlimClone;
    }
    @Override
    public String toString() {
        return "Gremlim {" + "Altura=" + altura + ", Nome=" + nome +
                ", Bagunceiro=" + bagunceiro + ", Molhado=" + molhado + "}";
    }
}
