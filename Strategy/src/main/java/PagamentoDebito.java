public class PagamentoDebito implements  Pagamento{
    @Override
    public String calcular(double dinheiro) {
        return "Pagamento Realizado com sucesso, R$"+ dinheiro + " Foi debitado da sua conta bancária.";
    }
}