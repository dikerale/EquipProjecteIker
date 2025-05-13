package botiga.Venda;
import botiga.Producte.Producte;

public class LiniaVenda {
    private Producte producte;
    private int quantitat;

    public LiniaVenda(Producte producte, int quantitat) {
        this.producte = producte;
        this.quantitat = quantitat;
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }
    public double getSubtotal(){
        return producte.getPreu() * quantitat;
    }
}
