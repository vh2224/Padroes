package Composite;

import java.util.ArrayList;
import java.util.List;

public class Unidade extends Concessionaria {

    private final List<Concessionaria> concessionarias;

    public Unidade(String concessionaria) {
        super(concessionaria);
        this.concessionarias = new ArrayList<Concessionaria>();
    }

    public void addConcessionaria(Concessionaria concessionaria) {
        this.concessionarias.add(concessionaria);
    }

    public String getConcessionaria() {
        String saida = "";
        saida = "Concessionaria: " + this.getConcessionaria() + "\n";
        for (Concessionaria concessionaria : concessionarias) {
            saida += concessionaria.getConcessionaria();
        }
        return saida;
    }

}
