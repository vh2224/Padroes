import java.util.ArrayList;
import java.util.List;

public class Turismo {
    private List<Visitante> visitantes = new ArrayList<>();

    public void passear(String nomeVisitante, String nomeCidade, String UF) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, UF);
        Visitante visitante = new Visitante(nomeVisitante, cidade);
        visitantes.add(visitante);
    }

    public List<String> obterVisitantes() {
        List<String> saida = new ArrayList<String>();
        for (Visitante Visitante : this.visitantes) {
            saida.add(visitante.obterVisitantes());
        }
        return saida;
    }
}