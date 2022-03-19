import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AugeTest {

    @Test
    void retornaHonraParaCombatenteNivelEasy() {
        Dificuldade nivel = new Easy();
        Combatente combatente = new Combatente(10f);
        combatente.setNivel(nivel);

        assertEquals(13, combatente.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaCombatenteNivelNormal() {
        Dificuldade nivel = new Normal();
        Combatente combatente = new Combatente(10f);
        combatente.setNivel(nivel);

        assertEquals(14f, combatente.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaCombatenteNivelHard() {
        Dificuldade nivel = new Hard();
        Combatente combatente = new Combatente(10f);
        combatente.setNivel(nivel);

        assertEquals(16f, combatente.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaRivalNivelEasy() {
        Dificuldade nivel = new Easy();
        Rival rival = new Rival(20f);
        rival.setNivel(nivel);

        assertEquals(24, rival.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaRivalNivelNormal() {
        Dificuldade nivel = new Normal();
        Rival rival = new Rival(20f);
        rival.setNivel(nivel);

        assertEquals(26f, rival.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaRivalNivelHard() {
        Dificuldade nivel = new Hard();
        Rival rival = new Rival(20f);
        rival.setNivel(nivel);

        assertEquals(30f, rival.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaDuelistaNivelEasy() {
        Dificuldade nivel = new Easy();
        Duelista duelista = new Duelista(30f);
        duelista.setNivel(nivel);

        assertEquals(36, duelista.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaDuelistaNivelNormal() {
        Dificuldade nivel = new Normal();
        Duelista duelista = new Duelista(30f);
        duelista.setNivel(nivel);

        assertEquals(39, duelista.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaDuelistaNivelHard() {
        Dificuldade nivel = new Hard();
        Duelista duelista = new Duelista(30f);
        duelista.setNivel(nivel);

        assertEquals(45, duelista.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaGladiadorNivelEasy() {
        Dificuldade nivel = new Easy();
        Gladiador gladiador = new Gladiador(40f);
        gladiador.setNivel(nivel);

        assertEquals(48, gladiador.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaGladiadorNivelNormal() {
        Dificuldade nivel = new Normal();
        Gladiador gladiador = new Gladiador(40f);
        gladiador.setNivel(nivel);

        assertEquals(52, gladiador.obterPontuacao(), 0.01);
    }

    @Test
    void retornaHonraParaGladiadorNivelHard() {
        Dificuldade nivel = new Hard();
        Gladiador gladiador = new Gladiador(40f);
        gladiador.setNivel(nivel);

        assertEquals(60, gladiador.obterPontuacao(), 0.01);
    }

}