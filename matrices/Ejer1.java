import java.util.Scanner;
public class Ejer1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int [] [] num;

        System.out.print("Cuantas filas tiene la matriz:");
        int filas=entrada.nextInt();
        System.out.print("Cuantas Columnas tiene la matriz:");
        int columnas=entrada.nextInt();
        num=new int [filas][columnas];

        for(int i=0;i<num.length;i++) {
            for(int j=0;j<num[i].length;j++) {
                System.out.print("Ingrese componente:");
                num[i][j]=entrada.nextInt();
            }
        }

        for(int i=0;i<num.length;i++) {
            for(int j=0;j<num[i].length;j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Ultima fila");
        for(int j=0;j<num[num.length-1].length;j++) {
             System.out.print(num[num.length-1][j]+" ");
        }
    }
}