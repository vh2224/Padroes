package Bridge;

public class Combatente extends Auge{
    public Combatente(float pontosHonra) {
        super(pontosHonra);
    }

    public float obterPontuacao() {
        return this.pontosHonra * (1 + this.nivel.multiplicador());
    }
}
