package botiga.botiga;

import botiga.Usuaris.Usuari;
import botiga.Venda.GestorVenda;
import botiga.Venda.Venda;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class GestorVentaTest {
    Scanner scan = new Scanner(System.in);

    @Test
    public void testAfegirVenda() {
        GestorVenda gestor = new GestorVenda();
        System.out.println("Introdueix el nom de l'usuari: ");
        String nom = scan.nextLine();
        System.out.println("Introdueix el correu de l'usuari: ");
        String correu = scan.nextLine();
        System.out.println("Introdueix el rol de l'usuari: ");
        String rol = scan.nextLine();
        Usuari usuari = new Usuari(nom, correu, rol);
        Venda venda = new Venda(usuari);

        gestor.afegirVenda(venda);

        assertEquals(1, gestor.getVendesPerData(venda.getData()).size());
    }

    @Test
    public void testGetVendesPerData() {
        Scanner scan = new Scanner(System.in);

        GestorVenda gestor = new GestorVenda();

        System.out.println("Introdueix el nom de l'usuari: ");
        String nom = scan.nextLine();
        System.out.println("Introdueix el correu de l'usuari: ");
        String correu = scan.nextLine();
        System.out.println("Introdueix el rol de l'usuari: ");
        String rol = scan.nextLine();
        Usuari usuari = new Usuari(nom, correu, rol);

        Venda vendaAvui = new Venda(usuari);
        gestor.afegirVenda(vendaAvui);

        Venda vendaAhir = new Venda(usuari);
        vendaAhir.setData(LocalDate.now().minusDays(1));
        gestor.afegirVenda(vendaAhir);


        ArrayList<Venda> vendesAvui = gestor.getVendesPerData(LocalDate.now());
        assertEquals(1, vendesAvui.size());
        assertEquals(vendaAvui, vendesAvui.get(0));

        ArrayList<Venda> vendesAhir = gestor.getVendesPerData(LocalDate.now().minusDays(1));
        assertEquals(1, vendesAhir.size());
        assertEquals(vendaAhir, vendesAhir.get(0));
    }

    @Test
    public void testGetVendesPerDataSenseResultats() {
        GestorVenda gestor = new GestorVenda();

        ArrayList<Venda> resultats = gestor.getVendesPerData(LocalDate.now());

        assertTrue(resultats.isEmpty());
    }
}

