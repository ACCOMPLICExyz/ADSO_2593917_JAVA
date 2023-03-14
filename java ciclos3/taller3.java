import java.util.Scanner;
public class taller3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Ingrese el valor total a financiar--> ");
        int financiar=entrada.nextInt();
        System.out.print(" Ingrese la tasa de interes--> ");
        int tasa_interes=entrada.nextInt();
        System.out.print(" Ingrese la cantidad de cuotas--> ");
        int cantidad=entrada.nextInt();

        int multi=0;
        int acum_interes=0;
        int interes_cuota=0;
        int resta=0;
        for (int i=1;i<=cantidad;i++) {
            System.out.println("Ingrese el valor que quiere en su cuota "+i+":");
            int valorcuota = entrada.nextInt();

            multi= financiar * tasa_interes;
            interes_cuota= multi/100;

            System.out.println("Este es el valor que pagara en interes: "+interes_cuota);
            acum_interes= acum_interes+resta;
            resta= valorcuota-interes_cuota;

            System.out.println("Este es el abono al capital financiado: "+resta);


            System.out.println("Este es el abono al capital financiado: "+financiar);
            financiar= financiar-resta;
            
            System.out.println("|ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo|");
        }
        System.out.println("Este es el total que pago de intereses---> " + acum_interes);
    }
}