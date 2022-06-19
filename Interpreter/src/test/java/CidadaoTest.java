import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CidadaoTest {
    @Test
    void deveCalcularImpostoDoCidadao() {
        Cidadao cidadao = new Cidadao();
        cidadao.setValue1(5000);

        assertEquals(4000, cidadao.calcular());
    }

}