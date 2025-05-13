package botiga.Producte;
import botiga.Producte.Producte;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorProductes {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Producte> llistaProductes = new ArrayList<>();


    //CREACIÓ D'UN PRODUCTE NOU
    public void afegirProducte() {
        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();

        System.out.println("Introdueix el preu del producte: ");
        double preu = sc.nextDouble();

        System.out.println("Introdueix l'estoc del producte: ");
        sc.nextInt();
        int stock = sc.nextInt();
        Producte p = new Producte(nom,preu,stock);

        System.out.println("Producte creat correctament.");
        llistaProductes.add(p);
    }

    public void cercarProducte() {
        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();

        if (llistaProductes.isEmpty()) {
            System.out.println("La llista està buida.");
        } else {
            Boolean ProducteCercat = Boolean.FALSE;
            for (Producte p : llistaProductes) {
                if (p.getNom().equals(nom)) {
                    System.out.println(p);
                    ProducteCercat = Boolean.TRUE;
                }
            }
        }
    }

    public void eliminarProdute() {
        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();

        if (llistaProductes.isEmpty()) {
            System.out.println("La llista està buida.");
        } else {

            for (Producte p : llistaProductes) {
                if (p.getNom().equals(nom)) {
                    System.out.println("Vols eliminar aquest producte? 1. Sí - 2. No");
                    System.out.println(p);
                    int confirmacio = sc.nextInt();
                    if (confirmacio == 1) {
                        llistaProductes.remove(p);
                        System.out.println("S'ha eliminat el producte.");
                    } else  if (confirmacio == 2) {
                        System.out.println("No s'ha eliminat el producte.");
                    } else {
                        System.out.println("ERROR - No s'ha introduit un nombre vàlid");
                    }
                }
            }
        }

    }
    public void aplicarDescomptes() {
        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();
        System.out.println("Introdueix el descompte a aplicar: ");
        double descompte = sc.nextDouble();

        for (Producte p : llistaProductes) {
            if (p.getNom().equals(nom)) {
                System.out.println("Vols modificar el preu d'aquest producte? 1. Sí - 2. No");
                System.out.println(p);
                int confirmacio = sc.nextInt();
                if (confirmacio == 1) {
                    p.setPreu(p.getPreu()-descompte);
                    System.out.println("Descompte aplicat");
                } else  if (confirmacio == 2) {
                    System.out.println("No s'ha aplicat cap descompte");
                } else {
                    System.out.println("ERROR - No s'ha introduit un nombre vàlid");
                }
            }
        }
    }
}

