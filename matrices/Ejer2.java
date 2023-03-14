import java.util.Scanner;
import java.io.IOException;
public class Ejer2{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        // definiendo mapa del laberinto
        int matriz [] [] = {
            {1,1,1,1,1,1,1},
            {1,0,0,0,1,0,3},
            {1,0,1,0,1,0,1},
            {1,0,1,0,1,0,1},
            {2,0,1,0,0,0,1},
            {1,1,1,1,1,1,1}
        };

        // Ciclo de juego
        boolean jugando = true;
        int pos_f = 4;
        int pos_c = 0;
        while(jugando){
            // Algoritmo para imprimir el laberinto
            try { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();} catch (Exception e){}
            for (int i=0;i<matriz.length ;i++ ) {
                for (int j=0;j<matriz[i].length ;j++ ) {
                    System.out.print( matriz[i][j]);
                }
                System.out.println();
            }

            //Imprimir el menú
            System.out.print("1. Arriba.   2. Abajo.   3. Derecha.   4. Izquierda");
            System.out.println(" ");
            int opcion = entrada.nextInt();

            // Condiciones segun la seleccion del usuario
            //Codigo para mover arriba
            if (opcion==1) {
                //preguntar si el movimiento es valido
                if (matriz[pos_f-1][pos_c]==0) {
                    matriz[pos_f-1][pos_c]=2;
                    matriz[pos_f][pos_c]=0;
                    pos_f = pos_f-1;
                    pos_c = pos_c;
                }else if (matriz[pos_f-1][pos_c]==3) {
                    jugando = false;
                }
            }
            //Codigo para mover Abajo
            if (opcion==2) {
                //preguntar si el movimiento es valido
                if (matriz[pos_f+1][pos_c]==0) {
                    matriz[pos_f+1][pos_c]=2;
                    matriz[pos_f][pos_c]=0;
                    pos_f = pos_f+1;
                    pos_c = pos_c;
                }else if (matriz[pos_f+1][pos_c]==3) {
                    jugando = false;
                }
            }
            //Codigo para mover a la derecha
            if (opcion==3) {
                //preguntar si el movimiento es valido
                if (matriz[pos_f][pos_c+1]==0) {
                    matriz[pos_f][pos_c+1]=2;
                    matriz[pos_f][pos_c]=0;
                    pos_f = pos_f;
                    pos_c = pos_c+1;
                }else if (matriz[pos_f][pos_c+1]==3) {
                    jugando = false;
                }
            }
            //Codigo para mover a la izquierda
            if (opcion==4) {
                //preguntar si el movimiento es valido
                if (matriz[pos_f][pos_c-1]==0) {
                    matriz[pos_f][pos_c-1]=2;
                    matriz[pos_f][pos_c]=0;
                    pos_f = pos_f;
                    pos_c = pos_c-1;
                }else if (matriz[pos_f][pos_c-1]==3) {
                    jugando = false;
                }
            }
            //Condicion de movimiento incorrecto
            if (opcion<1 || opcion>4) {
                if (matriz[pos_f-1][pos_c]==0) {
                    matriz[pos_f-1][pos_c]=2;
                    matriz[pos_f][pos_c]=0;
                    pos_f=pos_f-1;
                    pos_c=pos_c;
                }else if (matriz[pos_f-1][pos_c]==3) {
                    jugando = false;
                }
                System.out.println("MOVIMIENTO INVALIDO");
            }
        }
        System.out.print("|---------|");
        System.out.print("|GAME OVER|");
        System.out.print("|---------|");
    }
}