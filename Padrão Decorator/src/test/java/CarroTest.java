package Decorator;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CarroTest {

    @Test
    void retornaValorCarroComEstabilidade() {
        Carro carro = new Estabilidade(50000.0f);

        assertEquals(55000.0f, carro.getPacoteDesempenho());
    }

    @Test
    void retornaValorCarroComPotencia() {
        Carro carro = new Potencia(50000.0f);

        assertEquals(60000.0f, carro.getPacoteDesempenho());
    }
}
