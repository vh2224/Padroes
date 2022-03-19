public class Gladiador extends Auge {
    public Gladiador(float pontosHonra) {
        super(pontosHonra);
    }

    public float obterPontuacao() {
        return this.pontosHonra * (1 + this.nivel.multiplicador());
    }
}
