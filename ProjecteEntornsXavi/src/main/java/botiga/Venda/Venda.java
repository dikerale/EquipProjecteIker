package botiga.Venda;
import botiga.Producte.Producte;
import botiga.Usuaris.Usuari;

import java.time.LocalDate;
import java.util.*;

public class Venda {
    private LocalDate data;
    private Usuari usuari;
    private Double total;
    private ArrayList<LiniaVenda> linies;

    public Venda(Usuari usuari) {
        this.data = LocalDate.now();
        this.usuari = usuari;
        this.linies = new ArrayList<>();
        this.total = 0.0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<LiniaVenda> getLinies() {
        return linies;
    }

    public void setLinies(ArrayList<LiniaVenda> linies) {
        this.linies = linies;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    public void afegirLinia(Producte producte, int quantitat) {
        if (quantitat > producte.getStock()) {
            System.out.println("No hi ha suficient stock del producte: " + producte.getNom());
        }
        producte.setStock(producte.getStock() - quantitat); //Actualitzem l'estoc
        LiniaVenda linia = new LiniaVenda(producte, quantitat);
        linies.add(linia);
        actualitzarTotal();
    }

    private void actualitzarTotal() {
        total = 0.0;
        for (LiniaVenda linia : linies) {
            total += linia.getSubtotal();
        }
    }

    public String toString() {
        // Creem un StringBuilder, util per fer cadenes de text concatenades.
        StringBuilder sb = new StringBuilder();

        // Afegim la data de la venda
        sb.append("Data: ").append(data).append("\n");
        // Afegim el nom de l'usuari que ha fet la compra
        sb.append("Usuari: ").append(usuari.getNom()).append("\n");
        sb.append("Productes venuts:\n");

        for (LiniaVenda linia : linies) {
            sb.append(" - ")
                    // Afegim el nom del producte.
                    .append(linia.getProducte().getNom())
                    // Afegim la quantitat comprada
                    .append(" x").append(linia.getQuantitat())
                    // Calculem el subtotal
                    .append(" = ").append(String.format("%.2f", linia.getSubtotal()))
                    .append("€\n");
        }
        sb.append("Total: ").append(String.format("%.2f", total)).append("€");
        return sb.toString();
    }
}
