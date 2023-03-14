import java.util.Scanner;
public class taller1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Ingrese un sueldo total ");
        int numero=entrada.nextInt();

        System.out.print(" Cantidad de pagos ");
        int pagos=entrada.nextInt();

        System.out.println("");
        System.out.println("|------------- FORMAS DE PAGO ------------|");
        System.out.println("| 1. Pagos de igual valor.                |");
        System.out.println("| 2. Primer pago diferente.               |");
        System.out.println("| 3. Ultimo pago diferente.               |");
        System.out.println("| 4. Primer y Ultimo pago diferente.      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("");
        System.out.println("ingrese forma de pago");
        int opcion = entrada.nextInt();

        int multi=0;
        int total=0;
        if (opcion==1) {
            for (int i=0;i<=pagos;i++) {
            multi=numero/pagos;
            System.out.println("mes" + i+":"+ multi);
            }
        }else if (opcion==2) {
            multi=(numero/2);
            total=numero-multi;
            int totalidad=total/(pagos-1);
            System.out.println("mes " + "0"+":"+ total);
            for (int i=1;i<=pagos-1;i++) {
                System.out.println("mes " + i+":"+ totalidad);
            }
        }else if (opcion==3) {
            System.out.print("De cuanto valor quiere ser su ultimo pago?");
            int tercer = entrada.nextInt();
            int resta=numero-tercer;
            total=resta/(pagos-1);
            for (int i=1;i<=pagos-1;i++) {
                System.out.println("mes " + i+":"+ total);
            }
            System.out.println("Ultimo mes " +":"+ tercer);
        }else if (opcion==4) {
            System.out.print("De cuanto valor quiere ser su ultimo pago?");
            int tercer = entrada.nextInt();
            multi=(numero/2);
            total=numero-multi;
            int totalidad=total/(pagos-1);
            System.out.println("mes " + "0"+":"+ total);
            for (int i=1;i<=pagos-2;i++) {
                System.out.println("mes " + i+":"+ totalidad);
            }
            int resta=numero-tercer;
            int cruch=resta/(pagos1-1);
            for (int i=1;i<=pagos-1;i++) {
                System.out.println("mes " + i+":"+ cruch);
            }
            System.out.println("Ultimo mes " +":"+ tercer);
        }
    }
}