import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PagamentoTest {

    @Test
    void deveRetornarPagamentoDebito(){
        Cliente cliente = new Cliente();
        cliente.pagarComDebito(500.35);
        assertEquals("Pagamento Realizado com sucesso, R$500.35 Foi debitado da sua conta bancária.", cliente.getMensagemPagamento());
    }
    @Test
    void deveRetornarPagamentoCredito(){
        Cliente cliente = new Cliente();
        cliente.pagarComCedito(101.11);
        assertEquals("Pagamento Realizado com sucesso, R$101.11 aparecerá na sua próxima fatura.", cliente.getMensagemPagamento());
    }

}