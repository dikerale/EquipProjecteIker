import java.util.Scanner;

public class InputHelper {

    public static int llegirInt(Scanner scanner) {
        int nombre = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Introdueix el nombre: ");
                nombre = Integer.parseInt(scanner.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Error. Nombre no vàlid. Torna a intentar-ho:");
            }
        }
        return nombre;
    }

    public static int llegirPar(Scanner scanner) {
        int num = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Introdueix un nombre par: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                valid = true;
            } else {
                System.out.println("Nombre incorrecte, torna a intentar-ho.");
            }
        }
        return num;
    }

    public static int llegirPositiu(Scanner scanner) {
        int num = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("Introdueix un nombre positiu: ");
            num = Integer.parseInt(scanner.nextLine());
            if (num > 0) {
                valid = true;
            } else {
                System.out.println("Nombre incorrecte, torna a intentar-ho.");
            }
        }
        return num;
    }

    public static String llegirFrase(int longitud, Scanner scanner) {
        String frase = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("Introdueix un string de longitud màxima de " + longitud + " caràcters: ");
            frase = scanner.nextLine();
            if (frase.length() <= longitud) {
                valid = true;
            } else {
                System.out.println("Frase invàlida, torna a intentar-ho.");
            }
        }
        return frase;
    }
}
