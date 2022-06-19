public class Projeto {

    private int ano;
    private int projeto;
    private String situacao;

    public Projeto(int ano, int projeto) {
        this.ano = ano;
        this.projeto = projeto;
    }

    public String getSituacao() {
        return situacao;
    }

    public void iniciarProjeto() {
        this.situacao = "Desenvolvimento Iniciado";
    }

    public void finalizarProjeto() {
        this.situacao = "Desenvolvimento Finalizado";
    }
}