public class AcaoFinalizarProjeto implements Acao {

    private Projeto projeto;

    public AcaoFinalizarProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void executar() {
        this.projeto.finalizarProjeto();
    }

    public void cancelar() {
        this.projeto.iniciarProjeto();
    }
}