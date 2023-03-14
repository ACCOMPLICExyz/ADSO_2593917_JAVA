import java.util.Scanner;
public class Ejercicio4{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese area inicial de la bacteria en cm2-->");
        double area=entrada.nextInt();
        System.out.print("Ingrese area total del metal a consumir-->");
        double area2=entrada.nextInt();
        double acum=0;
        double proceso1=0;
        double proceso2=0;
        double proceso3=0;
        //double proceso1= (area*300)/100;
        //double proceso2= proceso1*0.30;
        //double proceso3= proceso1-proceso2;
        boolean crecimiento= true;
        for (int i=0;crecimiento;i++ ) {
            proceso1= (area*300)/100;
            proceso2= proceso1*0.30;
            proceso3= proceso1-proceso2;
            area=proceso3;
            System.out.println("dia: "+ i);
            System.out.println("creciendo: "+ proceso1);
            acum++;
            if (proceso1>area2) {
                crecimiento= false;
            }else{
               System.out.println("decreciendo: "+ proceso3); 
            }
        }
        System.out.println("Total de dias para consumir el metal fue: "+ (acum-0.5) );
    }
}