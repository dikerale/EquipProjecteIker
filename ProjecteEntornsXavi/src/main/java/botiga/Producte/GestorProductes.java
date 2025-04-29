package botiga.Producte;
import java.util.Scanner;

public class GestorProductes {
    Scanner sc = new Scanner(System.in);

    public void afegirProducte(Producte producte){
        return ;
        //afegir producte a on?
    }

    public void crearProducte(){
        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();

        System.out.println("Introdueix el preu del producte: ");
        double preu = sc.nextDouble();

        System.out.println("Introdueix l'stock del producte: ");
        sc.nextInt();
        int stock = sc.nextInt();
        Producte p = new Producte(nom,preu,stock);

        System.out.println("Producte creat correctament");
    }

    public void eliminarProdute(){
        return;
        //eliminar producte d'on?

    }

    public void aplicarDescomptes(Producte producte, double descompte){
        producte.setPreu(producte.getPreu()-descompte);
    }

}
