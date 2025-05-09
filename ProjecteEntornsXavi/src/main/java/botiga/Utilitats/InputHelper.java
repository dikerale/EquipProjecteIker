import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class InputHelper {

    //Métode per veure si el input introduir es un enter
    public static int llegirInt() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Introdueix el nombre: ");
                nombre = Integer.parseInt(scanner.nextLine());
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Error.Nombre no valid. Torna a intentar-ho: ");
            }
        }
        return nombre;
    }

    //Métode per veure si un nombre és par
    public static int llegirPar(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Introdueix un nombre par: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0){
                valid = true;
            }
            else{
                System.out.println("Nombre incorrecte, torna a intentar-ho");
            }
        }
        return num;
    }

    //Métode per comprobar si un input és un nombre positiu
    public static int llegirPositiu(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Introdueix un nombre positiu: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num > 0){
                valid = true;
            }
            else{
                System.out.println("Nombre incorrecte, torna a intentar-ho.");
            }
        }
        return num;
    }



    //Fer un metode per veure si la cadena de text és més llarga de el necessari
    public static String llegirFrase(int longitud){
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("Introdueix un string de longidtud màxima de " + longitud +" caràcters: ");
            frase = scanner.nextLine();
            if (frase.length() <= longitud){
                valid = true;
            }
            else{
                System.out.println("Frase invàlida, torna a intentar-ho.");
            }
        }
        return frase;
    }
}
