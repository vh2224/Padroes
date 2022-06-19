public class AcaoIniciarProjeto implements Acao {

    private Projeto projeto;

    public AcaoIniciarProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void executar() {
        this.projeto.iniciarProjeto();
    }

    public void cancelar() {
        this.projeto.finalizarProjeto();
    }
}