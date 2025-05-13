package botiga.botiga;

import botiga.Producte.GestorProductes;
import botiga.Producte.Producte;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GestorProducteTest {

    @Test
    public void AfegirProducteTest(){
        GestorProductes gestorProductes = new GestorProductes();
        gestorProductes.afegirProducte();
    }

    @Test
    public void CercarProducteTest(){
        GestorProductes gestorProductes = new GestorProductes();
        gestorProductes.cercarProducte();
    }

    @Test
    public void EliminarProducteTest(){
        GestorProductes gestorProductes = new GestorProductes();
        gestorProductes.eliminarProdute();
    }

    @Test
    public void AplicarProducteTest(){
        GestorProductes gestorProductes = new GestorProductes();
        gestorProductes.afegirProducte();
    }


}