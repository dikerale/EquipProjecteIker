package botiga.Producte;
import botiga.Producte.Producte;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class GestorProductes {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Producte> llistaProductes = new ArrayList<>();


    //Llistar productes
    public void llistatProductes() {
        if (llistaProductes.isEmpty()) {
            System.out.println("La llista està buida");
        } else {
            for (Producte producte : llistaProductes) {
                System.out.println(producte);
                System.out.println("___");
            }
        }
    }

    //CREACIÓ D'UN PRODUCTE NOU
    public void afegirProducte() {
        try {
            System.out.println("Introdueix el nom del producte: ");
            String nom = sc.nextLine();

            System.out.println("Introdueix el preu del producte: ");
            double preu = sc.nextDouble();

            System.out.println("Introdueix l'estoc del producte: ");
            int stock = sc.nextInt();
            sc.nextLine();
            Producte p = new Producte(nom,preu,stock);

            System.out.println("Producte creat correctament.");
            llistaProductes.add(p);
        }catch (InputMismatchException ime) {
            System.out.println("Caràcter incorrecte");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("S'ha produït un error inesperat: " + e.getMessage());
        }
    }
    //creació productes desdel codi
    public void afegirProducte(String nom, double preu, int stock) {
        Producte p = new Producte(nom,preu,stock);
        llistaProductes.add(p);
    }

    //Cercar un producte
    public void cercarProducte() {
        try {
            System.out.println("Introdueix el nom del producte: ");
            String nom = sc.nextLine().toLowerCase();
            Boolean ProducteCercat = Boolean.FALSE;

            if (llistaProductes.isEmpty()) {
                System.out.println("La llista està buida.");
            } else {
                for (Producte p : llistaProductes) {
                    if (p.getNom().toLowerCase().startsWith(nom)) {
                        System.out.println(p);
                        System.out.println("___");
                        ProducteCercat = Boolean.TRUE;
                    }
                }
                if (ProducteCercat == Boolean.FALSE) {
                    System.out.println("No s'ha trobat el producte buscat");
                }
            }
        }catch (InputMismatchException ime) {
            System.out.println("Caràcter incorrecte");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("S'ha produït un error inesperat: " + e.getMessage());
        }
    }

    //cercar productes per a venda
    public Producte cercarProducteVenda(String nom) {
        Boolean ProducteCercat = Boolean.FALSE;
        if (llistaProductes.isEmpty()) {
            System.out.println("La llista està buida.");
        } else {
            for (Producte p : llistaProductes) {
                if (p.getNom().toLowerCase().equals(nom)) {
                    ProducteCercat = Boolean.TRUE;
                    System.out.println("Vols afegir aquest producte? 1-Sí 2-No");
                    System.out.println(p);
                    int producteCorrecte = sc.nextInt();
                    sc.nextLine();
                    if (producteCorrecte == 1) {
                        return p;
                    } else if (producteCorrecte == 2) {
                        System.out.println("Producte no afegit");
                    }else{
                        System.out.println("No has introduït un nombre vàlid");
                    }
                }
            }
            if (ProducteCercat == Boolean.FALSE) {
                System.out.println("No s'ha trobat el producte buscat");
            }
        }
        return null;
    }

    //eliminar un producte
    public void eliminarProdute() {
        try {
            System.out.println("Introdueix el nom del producte: ");
            String nom = sc.nextLine();

            if (llistaProductes.isEmpty()) {
                System.out.println("La llista està buida.");
            } else {
                Boolean ProducteCercat = Boolean.FALSE;
                for (Producte p : llistaProductes) {
                    if (p.getNom().equals(nom)) {
                        System.out.println("Vols eliminar aquest producte? 1. Sí - 2. No");
                        System.out.println(p);
                        ProducteCercat = Boolean.TRUE;
                        int confirmacio = sc.nextInt();
                        if (confirmacio == 1) {
                            llistaProductes.remove(p);
                            System.out.println("S'ha eliminat el producte.");
                            break;
                        } else if (confirmacio == 2) {
                            System.out.println("No s'ha eliminat el producte.");
                        } else {
                            System.out.println("ERROR - No s'ha introduit un nombre vàlid");
                        }
                    }
                }
                if (ProducteCercat == Boolean.FALSE) {
                    System.out.println("No s'ha trobat el producte buscat");
                }
            }
        }catch (InputMismatchException ime) {
            System.out.println("Caràcter incorrecte");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("S'ha produït un error inesperat: " + e.getMessage());
        }
    }

    //aplicar descompte a un producte
    public void aplicarDescompte() {
        try {
            System.out.println("Introdueix el nom del producte: ");
            String nom = sc.nextLine();
            System.out.println("Introdueix el descompte a aplicar: ");
            double descompte = sc.nextDouble();
            sc.nextLine();
            Boolean ProducteCercat = Boolean.FALSE;
            for (Producte p : llistaProductes) {
                if (p.getNom().equals(nom)) {
                    System.out.println("Vols modificar el preu d'aquest producte? 1. Sí - 2. No");
                    System.out.println(p);
                    ProducteCercat = Boolean.TRUE;
                    int confirmacio = sc.nextInt();
                    sc.nextLine();
                    if (confirmacio == 1) {
                        p.setPreu(p.getPreu() * (1 - (descompte / 100)));
                        System.out.println("Descompte aplicat");
                        System.out.println(p);
                    } else if (confirmacio == 2) {
                        System.out.println("No s'ha aplicat cap descompte");
                    } else {
                        System.out.println("ERROR - No s'ha introduit un nombre vàlid");
                    }
                }
            }
            if (ProducteCercat == Boolean.FALSE) {
                System.out.println("No s'ha trobat el producte buscat");
            }
        }catch (InputMismatchException ime) {
            System.out.println("Caràcter incorrecte");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("S'ha produït un error inesperat: " + e.getMessage());
        }
    }
}

