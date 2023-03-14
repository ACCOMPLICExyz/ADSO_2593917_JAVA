import java.util.Scanner;
import java.util.Random;
public class Exer5{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Señor usuario ingrese su nombre ");
        String name = entrada.nextLine();
        //
        int ultimos_int = 7;
        int aciertos = 0;
        int intentos = 0;
        char respu;
        String [] partes1;
        //
        Random word = new Random();
        String arraypalabras[] = new String[5];
        arraypalabras[0] = "memoria";
        arraypalabras[1] = "software";
        arraypalabras[2] = "mouse";
        arraypalabras[3] = "teclado";
        arraypalabras[4] = "cine";

        System.out.println("|------------------------------------|");
        System.out.println("|Digite 1- si desea comenzar el juego|");
        System.out.println("|Digite 2- si desea salir del juego  |");
        System.out.println("|------------------------------------|");
        int opcion = entrada.nextInt();
        //
        if(opcion == 1){
            System.out.println("Bienvenido a ahorcado");
            //
            int aleatorio = word.nextInt(5);
            char[] primera = partes1(arraypalabras[aleatorio]);
            char[] copia = partes1(arraypalabras[aleatorio]); // Algo auxiliar para mas tarde
            //
            char[] respuestas = new char[primera.length];
            //
            for(int i = 0; i < respuestas.length; i++){
                respuestas[i] = '_';
            }
            //
            System.out.println("Adivina la palabra");
            //
            while(intentos < ultimos_int && aciertos != respuestas.length){
                // 
                System.out.println("----->Introduce una letra: ");
                respu = entrada.next().toLowerCase().charAt(0);
                // 
                for(int i = 0; i < primera.length; i++){
                    if(primera[i]==respu){
                        respuestas[i] = primera[i];
                        primera[i] = ' ';
                        aciertos++;
                    }
                }
                intentos++;
            }
            // Si acerto
            if(aciertos == respuestas.length){
                System.out.print("--->Lograste acertar la palabra: ");
            }
            // Si no otro
            else{
                System.out.print("---> Fallaste, la palabra era: ");
                for(int i = 0; i < copia.length; i++){
                    System.out.print(copia[i] + " ");
                }
            }
            // Reseteamos contadores
            intentos = 0;
            aciertos = 0;
        }else if(opcion == 2){
            System.out.print("Bye");
        }
        
        //
        
    }
}