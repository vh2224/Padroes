package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Turismo {
    private List<Visitante> visitantes = new ArrayList<>();

    public void passear(String nomeVisitante, String nomeCidade, String UF) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, UF);
        Visitante visitante = new Visitante(nomeVisitante, cidade);
        visitantes.add(visitante);
    }

    public List<String> obterVisitante() {
        List<String> saida = new ArrayList<String>();
        for (Visitante visitantes : this.visitantes) {
            saida.add(visitantes.obterVisitante());
        }
        return saida;
    }
}
