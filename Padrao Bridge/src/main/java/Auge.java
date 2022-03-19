public abstract class Auge {
    protected Dificuldade nivel;

    protected float pontosHonra;

    public Auge(float pontosHonra) {
        this.pontosHonra = pontosHonra;
    }

    public void setNivel(Dificuldade nivel) {
        this.nivel = nivel;
    }

    public void setPontosHonra(float pontosHonra) {
        this.pontosHonra= pontosHonra;
    }

    public abstract float obterPontuacao();
}
