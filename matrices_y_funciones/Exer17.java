import java.util.Scanner;
public class Exer17{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = entrada.nextLine();
        int cantidad = frase.length();

        System.out.println("Ingrese un número");
        int numero = entrada.nextInt();

        if (numero<=0 || numero>cantidad){
            System.out.print("Intente de nuevo");
        }else{
            for(int i = numero; i<cantidad; i++){
                System.out.print(frase.charAt(i));
            }
            for(int j = 0; j<numero; j++){
                System.out.print(frase.charAt(j));
            }
        }
    }
}