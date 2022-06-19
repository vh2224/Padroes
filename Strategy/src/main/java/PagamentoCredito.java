public class PagamentoCredito implements  Pagamento{
    @Override
    public String calcular(double dinheiro) {
        return "Pagamento Realizado com sucesso, R$"+ dinheiro + " aparecerá na sua próxima fatura.";
    }
}