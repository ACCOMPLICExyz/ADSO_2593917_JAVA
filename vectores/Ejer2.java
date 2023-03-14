import java.util.Scanner;
public class Ejer2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cuantos numeros primos quiere-->");
        int cantidad=entrada.nextInt();
        int [] arreglo_1 = new int[cantidad];

        int i=0;
        while (i<arreglo_1.length){
            arreglo_1[i] = (int)(Math.random()*1000);
            //algoritmo para determinar si el numero es primo 
            int acumulador = 0;
            int j=1;
            while (j<=arreglo_1[i]){           
                if (arreglo_1[i]%j==0){
                    acumulador++;
                }
                j++;
            }
            if (acumulador==2){
                System.out.println("-> El primo " + i + " Generado " + arreglo_1[i]);
                i++;
            }
        }
    }
}