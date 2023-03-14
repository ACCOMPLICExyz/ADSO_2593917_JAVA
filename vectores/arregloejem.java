import java.util.Scanner;
public class arregloejem{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int [] arreglo_1 = new int[5];

        //Llenar arreglo con numeros pares
        for (int i=0; i<arreglo_1.length; i++) {
            int k= i+1;
            arreglo_1[i] = (k+1)*2;
        }
        // Imprimir arreglo
        for (int i=0; i<arreglo_1.length;i++) {
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}
