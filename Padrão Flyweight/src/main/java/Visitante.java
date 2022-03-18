public class Visitante {
    private String nome;
    private Cidade cidadeVisitada;

    public Visitante(String nome, Cidade cidadeVisitada) {
        this.nome = nome;
        this.cidadeVisitada = cidadeVisitada;
    }

    public String obterVisitante() {
        return "Visitante{" +
                "nome='" + this.nome + '\'' +
                ", cidade='" + cidadeVisitada.getNome() + '\'' +
                ", UF='" + cidadeVisitada.getUf() + '\'' +
                '}';
    }
}
