import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class VeiculoVisitorTest {

    @Test
    void deveRetornarCarroCadastrado() {
        Carro carro = new Carro(201910758, "Ford", "EcoSport", "Branca", 2014);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{renavam=201910758, marca='Ford', modelo='EcoSport', cor='Branca', anoFabricacao=2014}", visitor.cadastrar(carro));
    }

}