import java.util.Scanner;
public class Ejercicio1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del Punto A:");
        System.out.println("--->Ingrese el valor de X:");
        int x1=entrada.nextInt();
        System.out.println("--->Ingrese el valor de Y:");
        int y1=entrada.nextInt();
        System.out.println("Ingresando las coordenadas del Punto B:");
        System.out.println("--->Ingrese el valor de X:");
        int x2=entrada.nextInt();
        System.out.println("--->Ingrese el valor de Y:");
        int y2=entrada.nextInt();

        int proceso1= y2-(y1);
        int proceso2= x2-(x1);
        int proceso3= proceso1/proceso2;
        if (proceso3>0) {
            System.out.println("El valor de la pendiente es: "+proceso3);
            System.out.println("La recta tiene pendiente Positiva");
        }else if (proceso3<0) {
            System.out.println("El valor de la pendiente es: "+proceso3);
            System.out.println("La recta tiene pendiente Negativa");
        }
    }
}