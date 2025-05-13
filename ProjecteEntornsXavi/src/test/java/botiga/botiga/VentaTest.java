package botiga.botiga;

import botiga.Producte.Producte;
import botiga.Usuaris.Usuari;
import botiga.Venda.Venda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VentaTest {

    @Test
    public void testConstructor() {
        Usuari usuari = new Usuari("Joan", "joan@gmail.com", "client");
        Venda venda = new Venda(usuari);

        assertEquals(usuari, venda.getUsuari());
        assertNotNull(venda.getData());
        assertEquals(0.0, venda.getTotal());
        assertTrue(venda.getLinies().isEmpty());
    }

    @Test
    public void testAfegirLiniaIVerificarTotal() {
        Usuari usuari = new Usuari("Joan", "joan@gmail.com", "client");
        Producte producte = new Producte("Goma", 1.0, 200);
        Venda venda = new Venda(usuari);

        venda.afegirLinia(producte, 3);

        assertEquals(1, venda.getLinies().size());
        assertEquals(3.0, venda.getTotal(), 0.001);
    }

    @Test
    public void testToStringContingut() {
        Usuari usuari = new Usuari("Maria", "maria@gmail.com", "client");
        Producte producte = new Producte("Carpeta", 5.0, 50);
        Venda venda = new Venda(usuari);
        venda.afegirLinia(producte, 2); // 10€

        String resultat = venda.toString();
        assertTrue(resultat.contains("Carpeta"));
        assertTrue(resultat.contains("x2"));
        assertTrue(resultat.contains("10.00"));
        assertTrue(resultat.contains("Maria"));
    }
}
