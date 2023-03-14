import java.util.Scanner;
public class Ejer6{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero N " );
        int primero = entrada.nextInt();
        System.out.print("Ingrese el numero M " );
        int segundo = entrada.nextInt();
        int i= primero;
        int h=1;
        while (i<=segundo){
            int j=1;
            while(j<=i){
                h *=j;
                if (j==i){
                    System.out.print(j + "=");
                }else{
                    System.out.print(j + "+");
                }
                if (i==j){
                    System.out.println(h);
                    h=1;
                }
                j++;
            }
            i++;
        }
    }
}