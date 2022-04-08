package Bridge;

public class Duelista extends Auge {
    public Duelista(float pontosHonra) {
        super(pontosHonra);
    }

    public float obterPontuacao() {
        return this.pontosHonra * (1 + this.nivel.multiplicador());
    }
}
