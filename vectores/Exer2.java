import java.util.Scanner;
public class Exer2{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Señor usuario inserte una oración: ");
        String oracion = entrada.nextLine();
        System.out.print("Oración invertida:");
        for (int i=0; i<oracion.length(); i++){
            // extraer letra
            char lit= oracion.charAt(i);
            int codigo = (int) lit;

            //preguntar si la letra es mayuscula
            if(codigo >= 65 && codigo <=90){
                //convertir la letra a minuscula
                char nuevo = (char) (codigo+32);
                //imprimir sin saltar linea
                System.out.print(" "+nuevo); 
            }else if (codigo >=97 && codigo <=122){
                //convertir la letra a mayuscula
                char nuevo = (char) (codigo-32);
                //imprimir sin saltar linea
                System.out.print(""+nuevo);
            }
        }
    }
}