import java.util.Scanner;
public class Ejercicio1_3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Señor usuario ingrese un número entero");
        int num = entrada.nextInt();
        int [] arreglo_1 = new int[num];

        //Llenar arreglo con numeros impares
        for (int i=0; i<arreglo_1.length; i++) {
            int impar=(int)(Math.random()*1000);
            if (impar%2==1){
                arreglo_1[i] = impar;
                
            }else{
                i--;
            }
            

        }
        // Imprimir arreglo
        for (int i=0; i<arreglo_1.length;i++) {
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}