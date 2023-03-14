import java.util.Scanner;
public class CadenaTexto{
    public static void main(String [] args){

        //Variable para leer datos.
        Scanner entrada = new Scanner(System.in);

        //Pedir texto al usuario.
        System.out.print("Ingrese su nombre: ");
        String cadena = entrada.nextLine();

        //Pruebas
        System.out.println("Valor almacenado => "+ cadena);
        System.out.println("Cantidad letras => "+ cadena.length());
        System.out.println("Letras en Posicion 0 => "+ cadena.charAt(0));
        System.out.println("Letras en Posicion 1 => "+ cadena.charAt(1));
        System.out.println("Letras en Posicion 2 => "+ cadena.charAt(2));
        System.out.println("Letras en Posicion 3 => "+ cadena.charAt(3));
        System.out.println("Letras en Posicion 4 => "+ cadena.charAt(4));


        String palabra_1 = "Hola Mundo";
        String palabra_2 = "hOLA mUNDO";

        System.out.println( "CompareTo P1 a P2: "+ palabra_1.compareTo(palabra_2) );
        System.out.println( "CompareTo P2 a P1: "+ palabra_2.compareTo(palabra_1) );

        System.out.println( "equals P1 a P2: "+ palabra_1.equals(palabra_2));
        System.out.println( "equals P2 a P1: "+ palabra_2.equals(palabra_1));

        System.out.println( "equalsIgnoreCase P1 a P2: "+ palabra_1.equalsIgnoreCase(palabra_2));
        System.out.println( "equalsIgnoreCase P1 a P2: "+ palabra_2.equalsIgnoreCase(palabra_1));
    }
}