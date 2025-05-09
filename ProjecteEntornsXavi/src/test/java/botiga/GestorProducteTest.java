package botiga;
import botiga.Producte.Producte;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorProducteTest {
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Producte> llistaProductes = new ArrayList<>();


    //CREACIÓ D'UN PRODUCTE NOU
    public void afegirProducte(Producte producte){
        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();

        System.out.println("Introdueix el preu del producte: ");
        double preu = sc.nextDouble();

        System.out.println("Introdueix l'stock del producte: ");
        sc.nextInt();
        int stock = sc.nextInt();
        Producte p = new Producte(nom,preu,stock);

        System.out.println("Producte creat correctament");
        llistaProductes.add(p);
    }

    public void cercarProducte(String nom){
        Boolean ProducteCercat = Boolean.FALSE;
        for (Producte p : llistaProductes) {
            if (p.getNom().equals(nom)) {
                System.out.println(p);
                ProducteCercat = Boolean.TRUE;
            }
        }
    }

    public void eliminarProdute(Producte producte){
        for (Producte p : llistaProductes) {
            if (p.getNom().equals(producte.getNom())) {
                System.out.println("Vols eliminar aquest producte?(1-si,2-no)");
                System.out.println(p);
                int confirmacio = sc.nextInt();
                if (confirmacio == 1){
                    llistaProductes.remove(p);
                    System.out.println("Producte eliminat");
                } else  if (confirmacio == 2){
                    System.out.println("Producte NO eliminat");
                } else {
                    System.out.println("No has introduit un nombre vàlid");
                }

            }
        }

    }

    public void aplicarDescomptes(Producte producte, double descompte){
        producte.setPreu(producte.getPreu()-descompte);
    }

}
