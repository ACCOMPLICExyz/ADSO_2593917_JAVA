import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar una Palabra: ");
        String contrasena = entrada.nextLine();

        if (esValidaContrasena(contrasena)) {
            System.out.println("La contraseña es valida.");
        } else {
            System.out.println("La contraseña No es valida.");
        }
    }

    public static boolean esValidaContrasena(String contrasena) {
        Pattern patron = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = patron.matcher(contrasena);
        return matcher.matches() && !contrasena.contains(" ");
    }
}
