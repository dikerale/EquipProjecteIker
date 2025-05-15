package botiga.botiga;

import botiga.Usuaris.GestioUsuari;
import botiga.Usuaris.Usuari;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GestorUsuariTest {

    @Test
    public void testAfegirUsuari() {
        GestioUsuari gestor = new GestioUsuari();
        Usuari usuari = new Usuari("Lluc", "lluc@gmail.com", "CLIENT");

        gestor.afegirUsuari(usuari);

        assertTrue(gestor.validarExistencia("lluc@gmail.com"));
    }

    @Test
    public void testObtenirUsuariPerNom() {
        GestioUsuari gestor = new GestioUsuari();
        Usuari usuari = new Usuari("Nami", "nami@gmail.com", "ADMINISTRADOR");
        gestor.afegirUsuari(usuari);

        Usuari resultat = gestor.obtenirUsuariPerNom("nami");

        assertNotNull(resultat);
        assertEquals("nami@gmail.com", resultat.getCorreuElectronic());
        assertEquals("ADMINISTRADOR", resultat.getRol());
    }

    @Test
    public void testValidarExistencia() {
        GestioUsuari gestor = new GestioUsuari();
        Usuari usuari = new Usuari("Furbo", "furbo@botiga.com", "CLIENT");
        gestor.afegirUsuari(usuari);

        assertTrue(gestor.validarExistencia("furbo@botiga.com"));
        assertFalse(gestor.validarExistencia("sensecorreu@botiga.com"));
    }
}

