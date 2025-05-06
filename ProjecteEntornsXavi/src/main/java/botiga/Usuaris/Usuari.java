package botiga.Usuaris;

public class Usuari {

    private String nom;
    private String correuElectronic;
    private String rol;

    public enum Rol{
        CLIENT,
        ADMINISTRADOR,
    }

    public Usuari(String nom, String correuElectronic, String rol) {
        this.nom = nom;
        this.correuElectronic = correuElectronic;
        this.rol = rol;
    }

    public String getNom() {
        return nom;
    }

    public String getCorreuElectronic() {
        return correuElectronic;
    }

    public String getRol() {
        return rol;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String toString() {
        return "Nom: " + nom + "\nCorreu: " + correu + "\nRol: " + rol;
    }
}
