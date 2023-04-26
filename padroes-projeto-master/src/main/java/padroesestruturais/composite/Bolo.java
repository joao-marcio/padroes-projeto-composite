package padroesestruturais.composite;

public class Bolo {

    private Conteudo insumo;

    public void setInsumo(Conteudo insumo) {
        this.insumo = insumo;
    }

    public String getInsumo() {
        if (this.insumo == null) {
            throw new NullPointerException("Bolo sem insumos");
        }
        return this.insumo.getConteudo();
    }
}
