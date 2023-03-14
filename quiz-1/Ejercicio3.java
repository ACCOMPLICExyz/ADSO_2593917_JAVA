import java.util.Scanner;
public class Ejercicio3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Ingrese un numero ");
        int numero=entrada.nextInt();
        int [] arreglo_1= new int[numero];
        int t1=1;
        for (int i=1;i<=arreglo_1.length;i++) {
            for (int j=1;j<=arreglo_1.length;j++) {
                if (t1%2==0) {
                    int h=0;
                    while (h<1){
                        arreglo_1[i] =(int)(Math.random()*999);
                        //
                        int acumulador=0;
                        int b=1;
                        while (b<=arreglo_1[i] ){
                            if (arreglo_1[i] %b==0) {
                                acumulador++;
                            }
                            b++;
                        }
                        if (acumulador>2) {
                            System.out.print(" "+((arreglo_1[i] <10)? "00" : ((arreglo_1[i] <100)? "0":""))+arreglo_1[i]  + " ");
                            h++;
                        }
                    }
                }else{
                    int h=0;
                    while (h<1) {
                        arreglo_1[i] =(int)(Math.random()*999);
                        //
                        int acumulador=0;
                        int b=1;
                        while (b<=arreglo_1[i] ){
                            if (arreglo_1[i] %b==0) {
                                acumulador++;
                            }
                            b++;
                        }
                        if (acumulador==2) {
                            System.out.print(" "+((arreglo_1[i] <10)? "00" : ((arreglo_1[i] <100)? "0":""))+arreglo_1[i]  + " ");
                            h++;
                        }
                    }
                }
                t1++;
            }
            System.out.println(" ");
        }
    }
}