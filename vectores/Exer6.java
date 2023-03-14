import java.util.Scanner;
public class Exer6{
    public static double valor, fin;
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Señor usuario ingrese el nombre del jugador 1");
        String name = entrada.nextLine();
        System.out.println("Señor usuario ingrese el nombre del jugador 2");
        String name2 = entrada.nextLine();

        int [][] triqui = new int[3][3];
        int valor = 0;
        int intentosA = 0;
        int a, b, s, d, fin = 0;
        for (int i = 0; i<triqui.length;i++){
            for (int j = 0; j < triqui.length; j++){
                if(i<3){
                    triqui[i][j] = 0;
                    System.out.print(triqui[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Jugador 1--> "+name);
        System.out.println("Jugador 2--> "+name2);
        System.out.println("Nota: Las coordenadas van de 0 a 2 de izquierda a derecha y de arriba hacia abajo");
        for(int y=0; y<5; y++){
            if (valor == 3){

            }else{
                if(fin == 5 || intentosA == 5){
                    System.out.println();
                    System.out.println("Tablero lleno");
                }else{
                    intentosA = intentosA+1;
                    System.out.println();
                    System.out.println("Jugador A--> "+name);
                    System.out.println();
                    do{
                        System.out.println("Ingrese la coordenada A:");
                        a = entrada.nextInt();
                    }while (a >= 3);
                    do{
                        System.out.println("Ingrese la coordenada B: ");
                        b = entrada.nextInt();
                    }while (b >= 3);
                    System.out.println();
                    for (int i = 0; i<triqui.length; i++){
                        for (int j = 0; j<triqui.length; j++){
                            if (i == a && j == b){
                                triqui[i][j] = 1;
                            }
                        }
                    }
                    for (int i = 0; i<triqui.length; i++){
                        for (int j = 0; j < triqui.length; j++){
                            if (i<3){
                                System.out.print(triqui[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    for (int w = 0; w<1; w++){
                        s = 0;
                        if (triqui[s][w] == 'X'){
                            s++;
                            if(triqui[s][w] == 'X'){
                                s++;
                                if (triqui[s][w] == 'X'){
                                    gana();
                                }
                            }
                        }
                    }
                    for (int w = 0; w<1; w++){
                        s = 0;
                        if(triqui[w][s] == 'X'){
                            s++;
                            if(triqui[w][s] == 'X'){
                                s++;
                                if (triqui[w][s] == 'X'){
                                    gana();
                                }
                            }
                        }
                    }
                    for (int w = 0; w<3; w++){
                        s = 0;
                        if(triqui[s][s] == 'X'){
                            s++;
                            if(triqui[s][s] == 'X'){
                                s++;
                                if (triqui[s][s] == 'X'){
                                    gana();
                                }
                            }
                        }
                    }
                    for (int w = 0; w<3; w++){
                        s = 0;
                        d = 2;
                        if(triqui[s][d] == 'X'){
                            s++;
                            d--;
                            if(triqui[s][d] == 'X'){
                                s++;
                                d--;
                                if (triqui[s][d] == 'X'){
                                    gana();
                                }
                            }
                        }
                    }

                }
                if (fin == 5 || intentosA == 5){
                    System.out.println();
                    System.out.println("Tablero lleno");

                }else{
                    System.out.println();
                    System.out.println("Jugador B--> "+ name2);
                    System.out.println();
                    do{
                        impri();
                        a = entrada.nextInt();
                    }while (a >= 3);
                    do{
                        System.out.print("Ingrese la coordenada B: ");
                        b = entrada.nextInt();
                    }while (b >= 3);
                    System.out.println();
                    for (int i = 0; i<triqui.length; i++){
                        for (int j = 0; j<triqui.length; j++){
                            if (i == a && j == b){
                                triqui[i][j] = 2;
                            }
                        }
                    }
                    for (int i = 0; i<triqui.length; i++){
                        for (int j = 0; j < triqui.length; j++){
                            if (i<3){
                                System.out.print(triqui[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    for (int w = 0; w<3; w++){
                        s = 0;
                        if (triqui[s][w] == 'O'){
                            s++;
                            if(triqui[s][w] == 'O'){
                                s++;
                                if (triqui[s][w] == 'O'){
                                    ganab();
                                }
                            }
                        }
                    }
                    for (int w = 0; w<3; w++){
                        s = 0;
                        if (triqui[w][s] == 'O'){
                            s++;
                            if(triqui[w][s] == 'O'){
                                s++;
                                if (triqui[w][s] == 'O'){
                                    ganab();
                                }
                            }
                        }
                    }
                    for (int w = 0; w<3; w++){
                        s = 0;
                        if (triqui[s][s] == 'O'){
                            s++;
                            if(triqui[s][s] == 'O'){
                                s++;
                                if (triqui[s][s] == 'O'){
                                    ganab();
                                }
                            }
                        }
                    }
                    for (int w = 0; w<3; w++){
                        s = 0;
                        d = 2;
                        if (triqui[s][d] == 'O'){
                            s++;
                            d--;
                            if(triqui[s][d] == 'O'){
                                s++;
                                d--;
                                if (triqui[s][d] == 'O'){
                                    ganab();
                                }
                            }
                        }
                    }

                }
            }
        }
        System.out.println();
        System.out.println("Gracias por jugar");
        System.out.println();


    }
    private static void impri(){
        System.out.println("Ingrese la coordenada B: ");
    }
    private static void gana(){
        valor = 3;
        System.out.println();
        System.out.println("El ganador es el jugador A--> ");
        fin = 5;
    }
    private static void ganab(){
        valor = 3;
        System.out.println();
        System.out.println("El ganador es el jugador B--> ");
        fin = 5;
    }
}