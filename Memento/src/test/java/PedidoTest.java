import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class PedidoTest {

    @Test
    void armazenaEstados() {
        Pedido pedido = new Pedido();
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        pedido.setStatus(PedidoStatusCancelado.getInstance());
        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void retornaStatusInicial() {
        Pedido pedido = new Pedido();
        pedido.setStatus(PedidoStatusEfetuado.getInstance());
        pedido.setStatus(PedidoStatusCancelado.getInstance());
        pedido.restauraStatus(0);
        assertEquals(PedidoStatusEfetuado.getInstance(), pedido.getStatus());
    }


    @Test
    void retornaExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restauraStatus(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
