import java.util.Scanner;
public class Ejercicio2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingrese un numero entero-->");
        int cantidad=entrada.nextInt();
        int [] arreglo_1 = new int[cantidad];

        int i=0;
        while (i<arreglo_1.length){
            arreglo_1[i] = (int)(Math.random()*1000);
            int acumulador = 0;
            int j=1;
            while (j<=arreglo_1[i]){           
                if (arreglo_1[i]%j==0){
                    acumulador++;
                }
                j++;
            }
            if (acumulador==2){
                //ver si esta repetido
                boolean valido= true;
                for (int h=0;h<arreglo_1.length;h++ ) {
                    if (arreglo_1[h] == arreglo_1.length) {
                        valido = false;
                    }
                }
                if (valido) {
                    arreglo_1[i]=arreglo_1.length;
                }
                System.out.println("-> El primo " + i + " Generado " + arreglo_1[i]);
                i++;
            }
        }
    }
}