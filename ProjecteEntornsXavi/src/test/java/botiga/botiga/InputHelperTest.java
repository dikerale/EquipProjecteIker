import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class InputHelperTest {

    @Test
    public void testLlegirIntCorrecte() {
        Scanner scanner = new Scanner("42\n");
        int resultat = InputHelper.llegirInt(scanner);
        assertEquals(42, resultat);
    }

    @Test
    public void testLlegirPar() {
        Scanner scanner = new Scanner("3\n6\n");
        int resultat = InputHelper.llegirPar(scanner);
        assertEquals(6, resultat);
    }

    @Test
    public void testLlegirPositiu() {
        Scanner scanner = new Scanner("-1\n10\n");
        int resultat = InputHelper.llegirPositiu(scanner);
        assertEquals(10, resultat);
    }

    @Test
    public void testLlegirFrase() {
        Scanner scanner = new Scanner("Aquesta frase és curta\n");
        String resultat = InputHelper.llegirFrase(30, scanner);
        assertEquals("Aquesta frase és curta", resultat);
    }
}
