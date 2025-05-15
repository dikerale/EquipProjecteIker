package botiga.botiga;

import botiga.Producte.Producte;
import botiga.Usuaris.Usuari;
import botiga.Venda.GestorVenda;
import botiga.Venda.LiniaVenda;
import botiga.Venda.Venda;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LiniaVendaTest {

    @Test
    public void testGetSubtotal() {
        Producte producte = new Producte("Pa", 2.5, 10); // afegit stock
        LiniaVenda linia = new LiniaVenda(producte, 4);

        double subtotal = linia.getSubtotal();

        assertEquals(10.0, subtotal, 0.001); // 2.5 * 4 = 10.0
    }

    @Test
    public void testGettersSetters() {
        Producte producte1 = new Producte("Llet", 1.2, 20);
        Producte producte2 = new Producte("Cafè", 3.0, 15);

        LiniaVenda linia = new LiniaVenda(producte1, 2);

        assertEquals(producte1, linia.getProducte());
        assertEquals(2, linia.getQuantitat());

        linia.setProducte(producte2);
        linia.setQuantitat(5);

        assertEquals(producte2, linia.getProducte());
        assertEquals(5, linia.getQuantitat());
    }
}
