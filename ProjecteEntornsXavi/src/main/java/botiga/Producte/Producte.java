package botiga.Producte;

public class Producte {
    //variables
    private String nom;
    private double preu;
    private int stock;

    //constructor
    public Producte(String nom, double preu, int stock) {
        this.nom = nom;
        this.preu = preu;
        this.stock = stock;
    }

    //getters i setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //funcions
    public String toString(){
        return "Nom: "+ nom +"\n"+ "Preu: " + preu+"\n" + "Stock: " + stock;

    }
}