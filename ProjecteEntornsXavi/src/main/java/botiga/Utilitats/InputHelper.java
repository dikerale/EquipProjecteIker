package botiga.Utilitats;

public class InputHelper {
    public static int llegirInt() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Introdueix el nombre: ");
                nombre = Integer.parseInt(scanner.nextLine());
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Error.Nombre no valid. Torna a intentar-ho: ");
            }
        }
        return nombre;
    }
}
