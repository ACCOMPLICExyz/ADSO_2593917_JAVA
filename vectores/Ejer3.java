import java.util.Scanner;
public class Ejer3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int cantidad=entrada.nextInt();
        int [] g1 = new int[cantidad];
        int acum=0;
        for (int i=0; i<g1.length-1; i++) {
            acum=acum+cantidad-1;
            System.out.println(+acum);
        }   
    }
}
