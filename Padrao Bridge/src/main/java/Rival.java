public class Rival extends Auge {
    public Rival(float pontosHonra) {
        super(pontosHonra);
    }

    public float obterPontuacao() {
        return this.pontosHonra * (1 + this.nivel.multiplicador());
    }
}
