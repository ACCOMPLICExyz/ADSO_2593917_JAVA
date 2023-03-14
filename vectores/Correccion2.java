import java.util.Scanner;
public class Correccion2{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Señor usuario inserte una oración: ");
        String oracion = entrada.nextLine();



        for (int i=0; i<oracion.length(); i++){
            System.out.println("Letra en Posicion "+i+" :"+oracion.charAt(i) );
            if(oracion.charAt(i) == 'a'){
                System.out.println("Se encuentra");
            }
        }
    }
}