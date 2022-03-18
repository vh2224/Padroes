import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class NutricionistaTest {

    @Test
    void deveRetornarAlimentoDieta() {
        Nutricionista nutricionista = new Nutricionista();
        nutricionista.setDieta("frango");

        assertEquals("frango", nutricionista.getDieta());
    }
}