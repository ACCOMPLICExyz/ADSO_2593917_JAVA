import java.util.Scanner;
public class Exer16{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        System.out.print ("Indique el tamaño del vector ");
        int arrayLength = entrada.nextInt();

        String arrayStrings [] = new String [arrayLength];

        for (int i = 0; i<arrayLength; i++){
            System.out.print("Ingrese la palabra ");
            arrayStrings[i] = teclado.nextLine();
        }

        System.out.print("Ingrese una palabra a buscar: ");
        String playword = teclado.nextLine();

        for (int j = 0; j<arrayLength; j++){
            int posicion = arrayStrings[j].indexOf(playword);
            if(posicion != -1){
                System.out.println("--> Posicion "+j+":"+arrayStrings[j]);
            }
        }
    }
}