import java.util.Scanner;
public class Exer1{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una oración: ");
        String oracion = entrada.nextLine();
        System.out.println("Valor almacenado => "+ oracion);
        int cont= 0;

        for (int i=0; i<oracion.length(); i++){
            System.out.println("Letra en Posicion "+i+" :"+oracion.charAt(i) );
            
            if (oracion.charAt(i) == 'a' || oracion.charAt(i) == 'A' || oracion.charAt(i) == 'e' || oracion.charAt(i) == 'E' || oracion.charAt(i) == 'i' || oracion.charAt(i) == 'I' || oracion.charAt(i) == 'o' || oracion.charAt(i) == 'O' || oracion.charAt(i) == 'u' || oracion.charAt(i) == 'U'){
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: "+ cont);
    }
}
