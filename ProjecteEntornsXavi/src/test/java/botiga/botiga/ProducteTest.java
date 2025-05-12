package botiga.botiga;

import botiga.Producte.Producte;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProducteTest {

    @Test
    public void testConstructor() {
        Producte p = new Producte("Llapis", 1.5, 100);
        assertEquals("Llapis", p.getNom());
        assertEquals(1.5, p.getPreu());
        assertEquals(100, p.getStock());
    }

    @Test
    public void testSettersAndGetters() {
        Producte p = new Producte("Llapis", 1.5, 100);
        p.setNom("Bolígraf");
        p.setPreu(2.0);
        p.setStock(50);

        assertEquals("Bolígraf", p.getNom());
        assertEquals(2.0, p.getPreu());
        assertEquals(50, p.getStock());
    }

    @Test
    public void testToString() {
        Producte p = new Producte("Llapis", 1.5, 100);
        String expected = "Nom: Llapis\nPreu: 1.5\nStock: 100";
        assertEquals(expected, p.toString());
    }
}