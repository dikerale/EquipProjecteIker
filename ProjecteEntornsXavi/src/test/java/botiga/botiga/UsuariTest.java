package botiga.botiga;

import botiga.Usuaris.Usuari;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuariTest {

    @Test
    public void testConstructorAndGetters() {
        Usuari usuari = new Usuari("Lluc", "lluc@gmail.com", "CLIENT");

        assertEquals("Lluc", usuari.getNom());
        assertEquals("lluc@gmail.com", usuari.getCorreuElectronic());
        assertEquals("CLIENT", usuari.getRol());
    }

    @Test
    public void testSetters() {
        Usuari usuari = new Usuari("NomAntic", "antic@exemple.com", "CLIENT");

        usuari.setNom("NomNou");
        usuari.setCorreu("nou@exemple.com");
        usuari.setRol("ADMINISTRADOR");

        assertEquals("NomNou", usuari.getNom());
        assertEquals("nou@exemple.com", usuari.getCorreuElectronic());
        assertEquals("ADMINISTRADOR", usuari.getRol());
    }

    @Test
    public void testToString() {
        Usuari usuari = new Usuari("Nami", "nami@correu.com", "ADMINISTRADOR");

        String expected = "Nom: Nami\nCorreu: nami@correu.com\nRol: ADMINISTRADOR";
        assertEquals(expected, usuari.toString());
    }
}

