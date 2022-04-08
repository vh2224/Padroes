package Facade;

public class ContabilidadePadaria {

    public boolean fecharCaixa() {
        return CaixaPadariaFacade.verificarPendenciasContabilidade(this);
    }
}
