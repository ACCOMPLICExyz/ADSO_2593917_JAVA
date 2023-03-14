import java.util.Scanner;
public class Ejer1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cuantos numeros impares quiere-->");
        int cantidad=entrada.nextInt();
        int [] arreglo_1 = new int[cantidad];

        //Llenar arreglo con numeros impares
        for (int i=0; i<arreglo_1.length; i++) {
            int k= i+1;
            arreglo_1[i] = (k*2)-1;
        }
        // Imprimir arreglo
        for (int i=0; i<arreglo_1.length;i++) {
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}
