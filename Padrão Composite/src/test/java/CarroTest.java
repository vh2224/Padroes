package Composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarConcessionariaCarro() {
        Unidade unidadeLapa = new Unidade("Veiculos mais buscados");

        Unidade unidadeTijuca = new Unidade("Veiculos procurados por famosos");

        Unidade concessionaria = new Unidade("Veiculos mais buscados");
        concessionaria.addConcessionaria(unidadeLapa);
        concessionaria.addConcessionaria(unidadeTijuca);

        assertEquals("Concessionaria: Veiculos mais buscados\n" +
                "Concessionaria: Veiculos procurados por famosos", concessionaria.getConcessionaria());

    }
}


