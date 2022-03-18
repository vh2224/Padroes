public class DietaAdapter extends Calorias {

    private IDieta dietaAlimento;

    public DietaAdapter(IDieta dietaAlimento) {
        this.dietaAlimento = dietaAlimento;
    }

    public String Dieta() {
        if (this.getNumCalorias() < 120.0)
            dietaAlimento.setDieta("Só comer frango");
        else if (this.getNumCalorias() >= 121.0)
            dietaAlimento.setDieta("Pão integral com queijo");
        if (this.getNumCalorias() >= 600.0)
            dietaAlimento.setDieta("macarrao com ovo");
        return dietaAlimento.getDieta();
    }

    public void salvarDieta() {
        if (dietaAlimento.getDieta().equals("Só comer frango"))
            this.setNumCalorias(120);
        else if (dietaAlimento.getDieta().equals("Pão integral com queijo"))
            this.setNumCalorias(121);
        else if (dietaAlimento.getDieta().equals("macarrao com ovo"))
            this.setNumCalorias(600);
    }
}
