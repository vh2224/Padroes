import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.assertEquals;


public class ContarEstoqueTest {

    @Test
    void contadorDeEstoquePorTipo() {
        Tipo tipo = new Tipo(
                new Veiculo("Focus", true),
                new Veiculo("Corolla", true),
                new Veiculo("Civic", false)


        );
        assertEquals(2, ContagemDeEstoque.contadorDeEstoquePorTipo(tipo));
    }

    @Test
    void contadorDeEstoqueTotal() {
        Tipo tipo = new Tipo(
                new Veiculo("Focus", true),
                new Veiculo("Corolla", true),
                new Veiculo("Civic", false)
        );
        assertEquals(3, ContagemDeEstoque.contadorDeEstoqueTotal(tipo));
    }

}