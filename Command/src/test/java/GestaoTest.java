import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestaoTest {
    Gestor gestor;
    Projeto projeto;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
        projeto = new Projeto(2022, 1);
    }

    @Test
    void deveIniciarProjeto() {
        Acao acao = new AcaoIniciarProjeto(projeto);
        gestor.executarAcao(acao);

        assertEquals("Desenvolvimento Iniciado", projeto.getSituacao());
    }

    @Test
    void deveFinalizarProjeto() {
        Acao acao = new AcaoFinalizarProjeto(projeto);
        gestor.executarAcao(acao);

        assertEquals("Desenvolvimento Finalizado", projeto.getSituacao());
    }
}