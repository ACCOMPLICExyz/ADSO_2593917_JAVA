import java.util.Scanner;
public class Apli{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Señor usuario ingrese porfavor un numero N");
        int cantidad=entrada.nextInt();
        Long number [] = new Long[cantidad];

        for (int i=0; i<number.length; i++){
            System.out.print("--> Ingrese cedula "+i+":");
            Long cedula = entrada.nextLong();

            //validar cedula
            boolean valido = true;
            for(int j=0; j<number.length; j++){
                if(cedula == number[j]){
                    valido = false;
                }
            }

            if(valido){
                // si --> almacenar cedula
                number[i] = cedula;
            }else{
                //No --> mensaje de error
                System.out.println("-- La cedula se encuentra repetida --");
                i--;
            }

        }

        //imprimir arreglo completo
        for(int i=0; i<number.length; i++){
            System.out.println(" - Cedula "+i+": "+number[i]);
        }

    }
}