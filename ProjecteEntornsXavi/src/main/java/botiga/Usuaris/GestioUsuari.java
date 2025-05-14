package botiga.Usuaris;

import java.util.ArrayList;

public class GestioUsuari {
    private ArrayList<Usuari> llistaUsuaris;

    public void GestorUsuaris() {
        llistaUsuaris = new ArrayList<>();
    }

    public void afegirUsuari(Usuari usuari) {
        llistaUsuaris.add(usuari);
        System.out.println("Usuari afegit correctament.");
    }

    public Usuari obtenirUsuariPerNom(String nom) {
        for (Usuari u : llistaUsuaris) {
            if (u.getNom().equalsIgnoreCase(nom)) {
                return u;
            }
        }
        return null;
    }

    public boolean validarExistencia(String correu) {
        for (Usuari u : llistaUsuaris) {
            if (u.getCorreuElectronic().equalsIgnoreCase(correu)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarTotsElsUsuaris() {
        for (Usuari u : llistaUsuaris) {
            System.out.println(u);
            System.out.println("------");
        }
    }


}
