import java.util.Scanner;
public class Ciclos9{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("--> Ingrese un numero: ");
        int n1 = entrada.nextInt();

        int cont=1;
        boolean buscando = true;

        while(buscando){
            if(cont*2==n1 | cont*3==n1 | cont*4==n1 | cont*5==n1 | cont*6==n1 | cont*7==n1 | cont*8==n1 | cont*9==n1 | cont*10==n1 && cont*1==n1){
                buscando = false;
            }else{
                cont++;
            }
        }
        System.out.println( n1 + "es un numero primo" );
    }
}