import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese palabra 1: ");
        String palabra1 = entrada.nextLine();
        System.out.print("Ingrese palabra 2: ");
        String palabra2 = entrada.nextLine();
        String resultado = combinarPalabras(palabra1, palabra2);
        System.out.println("Resultado: " + resultado);
    }

    public static String combinarPalabras(String palabra1, String palabra2) {
        String resultado = "";
        int longitudMinima = Math.min(palabra1.length(), palabra2.length());
        for (int i = 0; i < longitudMinima; i++) {
            resultado += palabra1.charAt(i) + "" + palabra2.charAt(i);
        }
        if (palabra1.length() > palabra2.length()) {
            resultado += palabra1.substring(longitudMinima);
        } else if (palabra1.length() < palabra2.length()) {
            resultado += palabra2.substring(longitudMinima);
        }
        return resultado;
    }
}
