import java.util.Scanner;
public class Exer4{
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Señor usuario ingrese una palabra");
        String word = entrada.nextLine();
        String invertida = "";
        //
        for (int x=word.length()-1;x>=0;x--){
            invertida += word.charAt(x);
        }
        if(invertida == word){
            System.out.println("La palabra "+word+" es Palindroma");
        }else{
            System.out.println("La palabra "+word+" No es palindroma");
        }
        
    }
}