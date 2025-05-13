package botiga.botiga;

import botiga.Producte.GestorProductes;
import botiga.Producte.Producte;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


public class GestorProducteTest {
    Scanner sc = new Scanner(System.in);

    @Test
    public void AfegirProducteTest(){

        System.out.println("Introdueix el nom del producte: ");
        String nom = sc.nextLine();

        System.out.println("Introdueix el preu del producte: ");
        double preu = sc.nextDouble();

        System.out.println("Introdueix l'estoc del producte: ");
        sc.nextInt();
        int stock = sc.nextInt();

        GestorProductes gestorProductes = new GestorProductes();
        gestorProductes.afegirProducte(nom,preu,stock);
    }

    @Test
    public void CercarProducteTest(){

    }

    @Test
    public void EliminarProducteTest(){

    }

    @Test
    public void AplicarProducteTest(){

    }


}