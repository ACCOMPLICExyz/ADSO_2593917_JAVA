import java.util.Scanner;
public class taller2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);


        System.out.print(" Ingrese la cantidad total financiada ");
        int numero=entrada.nextInt();
        System.out.print(" Ingrese la cantidad de cuotas pagadas ");
        int numero2=entrada.nextInt();
        System.out.print(" Ingrese el valor de cada cuota ");
        int numero3=entrada.nextInt();

        int totalcuotas= numero3*numero2;
        int totalfinan= totalcuotas-numero;
        float divi= (float)totalfinan/(float)numero;
        float totalidad =  (float)divi*100;

        System.out.print("Este es el total del interes pagado--> " + totalidad+"%" );


    }
}