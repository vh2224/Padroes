package Flyweight;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

class VisitantesTest {

    @Test
    void deveRetornarVisitantes() {
        Turismo turismo = new Turismo();
        programa.passear("Vinicius", "Volta Redonda", "RJ");
        programa.passear("Yasmin", "Campo Belo", "MG");
        programa.passear("Gabriela", "Resende", "RJ");

        List<String> saida = Arrays.asList(
            "Participante{nome='Vinicius', cidade='Volta Redonda', UF='RJ'}",
            "Participante{nome='Yasmin', cidade='Campo Belo', UF='MG'}",
            "Participante{nome='Gabriela', cidade='Resende', UF='RJ'}"
        );

        assertEquals(saida, programa.obterVisitantes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Turismo turismo = new Turismo();
        programa.passear("Vinicius", "Volta Redonda", "RJ");
        programa.passear("Yasmin", "Campo Belo", "MG");
        programa.passear("Gabriela", "Resende", "RJ");

        assertEquals(3, CidadeFactory.getTotalCidades());
    }
}