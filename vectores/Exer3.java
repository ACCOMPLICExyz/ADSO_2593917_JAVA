import java.util.Scanner;
public class Exer3{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);


        System.out.print("Señor usuario ingrese su nombre: ");
        String name = entrada.nextLine();
        String invertida = "";

        for (int x=name.length()-1;x>=0;x--){
            invertida += name.charAt(x);
        }
        
        System.out.println("Nombre invertido: "+invertida);
    }
}