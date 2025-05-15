package botiga;

import botiga.Producte.GestorProductes;
import botiga.Producte.Producte;
import botiga.Usuaris.GestioUsuari;
import botiga.Usuaris.Usuari;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------\n\t  --Benvingut al sistema--\n--------------------------------------");
        Scanner sc = new Scanner(System.in);

        //menu
        while (true) {
            try {
                GestorProductes gestorProductes = new GestorProductes();
                GestioUsuari gestioUsuari = new GestioUsuari();
                //creació productes inicials
                gestorProductes.afegirProducte("pilota blanca", 10, 50);
                gestorProductes.afegirProducte("pilota vermella", 12, 25);
                gestorProductes.afegirProducte("pilota colors", 16, 46);
                gestorProductes.afegirProducte("samarreta Mesi", 60, 105);

                System.out.println("| Menu |\n1-Productes\n2-Usuaris\n3-Venda\n4-Sortir del programa");
                int menu1 = sc.nextInt();
                if (menu1 == 1) {
                    while (true) {
                        try {
                            System.out.println("| Productes |\n1-Llistar productes\n2-Cercar producte\n3-Afegir producte\n4-Eliminar producte\n5-Aplicar descompte\n6-Sortir al menu principal");
                            int menu2 = sc.nextInt();
                            if (menu2 == 1) {
                                System.out.println("---------");
                                gestorProductes.llistatProductes();
                                System.out.println("---------");

                            } else if (menu2 == 2) {
                                System.out.println("---------");
                                gestorProductes.cercarProducte();
                                System.out.println("---------");

                            } else if (menu2 == 3) {
                                System.out.println("---------");
                                gestorProductes.afegirProducte();
                                System.out.println("---------");

                            } else if (menu2 == 4) {
                                System.out.println("---------");
                                gestorProductes.eliminarProdute();
                                System.out.println("---------");

                            } else if (menu2 == 5) {
                                System.out.println("---------");
                                gestorProductes.aplicarDescompte();
                                System.out.println("---------");

                            } else if (menu2 == 6) {
                                System.out.println("---------");
                                break;
                            } else {
                                System.out.println("No has introduit un nombre correcte");
                            }
                        } catch (InputMismatchException IME) {
                            System.out.println("Caràcter incorrecte");
                            sc.nextLine();
                        } catch (Exception e) {
                            System.out.println("S'ha produït un error inesperat: " + e.getMessage());
                        }
                    }
                } else if (menu1 == 2) {
                    System.out.println("| Usuaris |\n1-Afegir un usuari\n2-Cercar un usuari\n3-Validar existencia\n4-Sortir al menu principal");
                    int menu2 = sc.nextInt();
                    sc.nextLine();
                    if (menu2 == 1) {
                        System.out.println("---------");
                        System.out.println("Introdueix el nom de l'Usuari: ");
                        String nom = sc.nextLine();
                        System.out.println("Introdueix el correu de l'Usuari: ");
                        String correu = sc.nextLine();
                        System.out.println("Introdueix el rol de l'Usuari: ");
                        String rol = sc.nextLine();

                        Usuari usuari = new Usuari(nom, correu, rol);
                        gestioUsuari.afegirUsuari(usuari);
                        System.out.println("---------");

                    }
                } else if (menu1 == 3) {
                    System.out.println("");
                } else if (menu1 == 4) {
                    System.out.println("Sortint del programa...");
                    break;
                } else {
                    System.out.println("No has introduit un nombre correcte");
                }
            }catch (InputMismatchException ime) {
                System.out.println("Caràcter incorrecte");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("S'ha produït un error inesperat: " + e.getMessage());
            }
        }
    }

}
