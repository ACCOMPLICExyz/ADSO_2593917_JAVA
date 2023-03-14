import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expli7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contrasena = input.nextLine();
        input.close();
        boolean esValida = validarContrasena(contrasena);
        if (esValida) {
            System.out.println("La contraseña es valida.");
        } else {
            System.out.println("La contraseña No es valida.");
        }
    }
    
    public static boolean validarContrasena(String contrasena) {
        // Verificar si la contraseña tiene al menos 8 caracteres
        if (contrasena.length() < 8) {
            return false;
        }
        
        // Verificar si la contraseña tiene al menos una letra mayúscula
        Pattern patronMayuscula = Pattern.compile("[A-Z]");
        Matcher matcherMayuscula = patronMayuscula.matcher(contrasena);
        if (!matcherMayuscula.find()) {
            return false;
        }
        
        // Verificar si la contraseña tiene al menos una letra minúscula
        Pattern patronMinuscula = Pattern.compile("[a-z]");
        Matcher matcherMinuscula = patronMinuscula.matcher(contrasena);
        if (!matcherMinuscula.find()) {
            return false;
        }
        
        // Verificar si la contraseña tiene al menos un dígito numérico
        Pattern patronNumero = Pattern.compile("[0-9]");
        Matcher matcherNumero = patronNumero.matcher(contrasena);
        if (!matcherNumero.find()) {
            return false;
        }
        
        // Verificar si la contraseña tiene al menos un carácter especial
        Pattern patronEspecial = Pattern.compile("[.\\-_*{}\\[\\]#$%&/?!¡]");
        Matcher matcherEspecial = patronEspecial.matcher(contrasena);
        if (!matcherEspecial.find()) {
            return false;
        }
        
        // Verificar si la contraseña no contiene espacios
        if (contrasena.contains(" ")) {
            return false;
        }
        
        // Si la contraseña pasa todas las validaciones anteriores, entonces es válida
        return true;
    }
}
