package botiga.botiga;

import botiga.Producte.Producte;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProducteTest {

    @Test
    public void testConstructor() {//test del constructor
        Producte p = new Producte("Producte1", 20, 100);
        assertEquals("Producte1", p.getNom());
        assertEquals(20, p.getPreu());
        assertEquals(100, p.getStock());
    }

    @Test
    public void testSettersAndGetters() {//test dels setters i getters
        Producte p = new Producte("Producte1", 20, 100);
        p.setNom("Producte2");
        p.setPreu(19);
        p.setStock(50);

        assertEquals("Producte2", p.getNom());
        assertEquals(19, p.getPreu());
        assertEquals(50, p.getStock());
    }

    @Test
    public void testToString() {//test del tostring
        Producte p = new Producte("Producte1", 20, 100);
        String expected = "Nom: Producte1\nPreu: 20.0\nStock: 100";
        assertEquals(expected, p.toString());
    }
}