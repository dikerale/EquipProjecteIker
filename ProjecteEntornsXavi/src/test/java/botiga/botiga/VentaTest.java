package botiga.botiga;

import botiga.Producte.Producte;
import botiga.Usuaris.Usuari;
import botiga.Venda.Venda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class VentaTest {
    @Test
    public void testConstructor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'usuari: ");
        String nom = scan.nextLine();
        System.out.println("Introdueix el correu de l'usuari: ");
        String correu = scan.nextLine();
        System.out.println("Introdueix el rol de l'usuari: ");
        String rol = scan.nextLine();
        Usuari usuari = new Usuari(nom, correu, rol);

        Venda venda = new Venda(usuari);
        assertEquals(usuari, venda.getUsuari());
        assertNotNull(venda.getData());
        assertEquals(0.0, venda.getTotal());
        assertTrue(venda.getLinies().isEmpty());
    }

    @Test
    public void testAfegirLiniaIVerificarTotal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'usuari: ");
        String nom = scan.nextLine();
        System.out.println("Introdueix el correu de l'usuari: ");
        String correu = scan.nextLine();
        System.out.println("Introdueix el rol de l'usuari: ");
        String rol = scan.nextLine();
        Usuari usuari = new Usuari(nom, correu, rol);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom del prducte: ");
        String nomP = sc.nextLine();
        System.out.println("Introdueix preu de el producte de l'usuari: ");
        double preuP = sc.nextInt();
        System.out.println("Introdueix l'estoc de el producte: ");
        int stock = sc.nextInt();
        Producte producte = new Producte(nomP, preuP, stock );
        Venda venda = new Venda(usuari);
        System.out.println("Introdueix la quantitat de producte que vols: ");
        int quantitat = scan.nextInt();
        venda.afegirLinia(producte, quantitat);

        assertEquals(1, venda.getLinies().size());
        assertEquals(3.0, venda.getTotal(), 0.001);
    }

    @Test
    public void testToStringContingut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'usuari: ");
        String nom = scan.nextLine();
        System.out.println("Introdueix el correu de l'usuari: ");
        String correu = scan.nextLine();
        System.out.println("Introdueix el rol de l'usuari: ");
        String rol = scan.nextLine();
        Usuari usuari = new Usuari(nom, correu, rol);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el nom del prducte: ");
        String nomP = sc.nextLine();
        System.out.println("Introdueix preu de el producte de l'usuari: ");
        double preuP = sc.nextInt();
        System.out.println("Introdueix l'estoc de el producte: ");
        int stock = sc.nextInt();
        Producte producte = new Producte(nomP, preuP, stock);

        Venda venda = new Venda(usuari);
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix la quantitat de producte que vols: ");
        int quantitat = scan.nextInt();
        venda.afegirLinia(producte, quantitat);

        String resultat = venda.toString();
        assertTrue(resultat.contains("Carpeta"));
        assertTrue(resultat.contains("x2"));
        assertTrue(resultat.contains("10.00"));
        assertTrue(resultat.contains("Maria"));
    }
}
