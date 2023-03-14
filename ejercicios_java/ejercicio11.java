import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" => Ingrese el numero a multiplicar: ");
        int numero = entrada.nextInt();

        int i = 1;
        for (i=1; i<=10 ;i++ ) {
            int multi=i*numero;
            System.out.println( +numero+ "x" + i + "=" + multi);
        }
    }
}