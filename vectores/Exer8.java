import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = entrada.nextLine();
        System.out.print("Ingrese número: ");
        int numero = entrada.nextInt();

        String resultado = moverIzquierda(frase, numero);
        System.out.println("Resultado: " + resultado);
    }

    public static String moverIzquierda(String frase, int numero) {
        int longitud = frase.length();
        numero = numero % longitud;
        if (numero < 0) {
            numero += longitud;
        }
        String one = frase.substring(numero);
        String two = frase.substring(0, numero);
        return one + two;
    }
}
