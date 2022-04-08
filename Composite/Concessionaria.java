package Composite;

public abstract class Concessionaria {

    private String concessionaria;

    public Concessionaria(String concessionaria) {
        this.concessionaria = concessionaria;
    }

    public String getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(String concessionaria) {
        this.concessionaria = concessionaria;
    }

}