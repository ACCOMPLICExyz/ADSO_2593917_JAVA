import java.util.Scanner;
public class Ejer3{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        // definiendo mapa del buscaminas
        int matriz [] [] = {
            {1,1,1,1,1,1,1},
            {1,0,0,0,1,0,3},
            {1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1},
            {2,0,1,0,0,0,1},
            {1,1,1,1,1,1,1}
        };