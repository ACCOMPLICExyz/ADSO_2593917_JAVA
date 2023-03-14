import java.util.Scanner;
public class Ciclos8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un numero: ");
        int numero = entrada.nextInt();

        int resultado = (numero % 10);
        int resultado2 = (numero/10)%10;
        int resultado3 = (numero/10/10)%10;
        int resultado4 = (numero/10/10/10)%10;
        int resultado5 = (numero/10/10/10/10)%10;
        int resultado6 = (numero/10/10/10/10/10);
        int i = 1;
        for (i=1; i<=1; i++){
            if(resultado>=0 && resultado2>=0 && resultado3>=0 && resultado4>=0 && resultado5>=0 && resultado6>=0){
                System.out.println("El digito 01 es:" + resultado6);
                System.out.println("El digito 02 es:" + resultado5);
                System.out.println("El digito 03 es:" + resultado4);
                System.out.println("El digito 04 es:" + resultado3);
                System.out.println("El digito 05 es:" + resultado2);
                System.out.println("El digito 06 es:" + resultado);
            }else{
                System.out.println(" ");

            }
        }
    }
}