public class Carro {

    private Concessionaria concessionaria;

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public String getConcessionaria() {
        if (this.concessionaria == null) {
            throw new NullPointerException("Concessionaria Inexistente!!!");
        }
        return this.concessionaria.getConcessionaria();
    }
}