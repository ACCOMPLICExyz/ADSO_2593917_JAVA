import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" => Ingrese un numero que representa una fecha (ddmmaaaa): ");
        int numero = entrada.nextInt();

        int fecha = (numero % 10);
        int fecha2 = (numero/10)%10;
        int fecha3 = (numero/10/10)%10;
        int fecha4 = (numero/10/10/10)%10;
        int fecha5 = (numero/10/10/10/10)%10;
        int fecha6 = (numero/10/10/10/10/10)%10;
        int fecha7 = (numero/10/10/10/10/10/10)%10;
        int fecha8 = (numero/10/10/10/10/10/10/10);

        if (fecha8 == 9) {
            if (fecha7 == 0) {
                System.out.print(" Noventa ");
            }else {
                System.out.print(" Noventa y ");
            }
        }else if (fecha8 == 8) {
            if (fecha7 == 0) {
                System.out.print(" Ochenta ");
            }else {
                System.out.print(" Ochenta y ");
            }
        }else if (fecha8 == 7) {
            if (fecha7 == 0) {
                System.out.print(" Setenta ");
            }else {
                System.out.print(" Setenta y ");
            }
        }else if (fecha8 == 6) {
            if (fecha7 == 0) {
                System.out.print(" Sesenta ");
            }else {
                System.out.print(" Sesenta y ");
            }
        }else if (fecha8 == 5) {
            if (fecha7 == 0) {
                System.out.print(" Cincuenta ");
            }else {
                System.out.print(" Cincuenta y ");
            }
        }else if (fecha8 == 4) {
            if (fecha7 == 0) {
                System.out.print(" Cuarenta ");
            }else {
                System.out.print(" Cuarenta y ");
            }
        }else if (fecha8 == 3) {
            if (fecha7 == 0) {
                System.out.print(" Treinta ");
            }else { 
                System.out.print(" Treinta y ");
            }
        }else if (fecha8 == 2) {
            if (fecha7 == 0) {
                System.out.print(" Veinte ");
            }else {
                System.out.print(" Veinti y ");
            }
        }else if (fecha8 == 1) {
            if (fecha7 == 9) {
                System.out.print(" Dieci nueve");
            }if (fecha7 == 8 ) {
                System.out.print(" Dieci ocho");
            }if (fecha7 == 7) {
                System.out.print(" Dieci siete ");
            }if (fecha7 == 6) {
                System.out.print(" Dieci Seis ");
            }if (fecha7 == 5) {
                System.out.print(" Quince ");
            }if (fecha7 == 4) {
                System.out.print(" Catorce ");
            }if (fecha7 == 3) {
                System.out.print(" Trece ");
            }if (fecha7 == 2) {
                System.out.print(" Doce ");
            }if (fecha7 == 1) {
                System.out.print(" Once ");
            }if (fecha7 == 0) {
                System.out.print(" Diez ");
            }
        }if (fecha7 == 9) {
            if (fecha8 >= 2) {
                System.out.print(" Nueve ");
            }
        }if (fecha7 == 8) {
            if (fecha8 >= 2) {
                System.out.print(" Ocho ");
            }
        }if (fecha7 == 7) {
            if (fecha8 >= 2) {
                System.out.print(" Siete ");
            }
        }if (fecha7 == 6) {
            if (fecha8 >= 2) {
                System.out.print(" Seis ");
            }
        }if (fecha7 == 5) {
            if (fecha8 >= 2) {
                System.out.print(" Cinco ");
            }
        }if (fecha7 == 4) {
            if (fecha8 >= 2) {
                System.out.print(" Cuatro ");
            }
        }if (fecha7 == 3) {
            if (fecha8 >= 2) {
                System.out.print(" Tres ");
            }
        }if (fecha7 == 2) {
            if (fecha8 >= 2) {
                System.out.print(" Dos ");
            }
        }if (fecha7 == 1) {
            if (fecha8 >= 2) {
                System.out.print(" Uno ");
            }

        }if (fecha6 == 1) {
            if (fecha5 == 2) {
                System.out.print(" De Diciembre del ");
            }if (fecha5 == 1) {
                System.out.print(" De Noviembre del ");
            }if (fecha5 == 0) {
                System.out.print(" De octubre del ");
            }
        }else if (fecha6 == 0) {
            if (fecha5 == 9) {
                System.out.print(" De Septiembre del ");
            }if (fecha5 == 8) {
                System.out.print(" De Agosto del ");
            }if (fecha5 == 7) {
                System.out.print(" De Julio del ");
            }if (fecha5 == 6) {
                System.out.print(" De Junio del ");
            }if (fecha5 == 5) {
                System.out.print(" De Mayo del ");
            }if (fecha5 == 4) {
                System.out.print(" De Abril del ");
            }if (fecha5 == 3) {
                System.out.print(" De Marzo del ");
            }if (fecha5 == 2) {
                System.out.print(" De Febrero del ");
            }if (fecha5 == 1) {
                System.out.print(" De Enero del ");
            }
        }if (fecha4 == 9) {
            System.out.print(" Nueve mil ");
        }else if (fecha4 == 8) {
            System.out.print(" Ocho mil ");
        }else if (fecha4 == 7) {
            System.out.print(" Siete mil ");
        }else if (fecha4 == 6) {
            System.out.print(" Seis mil ");
        }else if (fecha4 == 5) {
            System.out.print(" Cinco mil ");
        }else if (fecha4 == 4) {
            System.out.print(" Cuatro mil");
        }else if (fecha4 == 3) {
            System.out.print(" Tres mil ");
        }else if (fecha4 == 2) {
            System.out.print(" Dos mil");
        }else if (fecha4 == 1) {
            System.out.print(" Mil");
        }else if (fecha4 == 0) {
            System.out.print(" ");

        }if (fecha3 == 9) {
            System.out.print(" Novecientos");
        }else if (fecha3 == 8) {
            System.out.print(" Ochocientos ");
        }else if (fecha3 == 7) {
            System.out.print(" Setecientos ");
        }else if (fecha3 == 6) {
            System.out.print(" Seiscientos ");
        }else if (fecha3 == 5) {
            System.out.print(" Quinientos ");
        }else if (fecha3 == 4) {
            System.out.print(" Cuatrocientos");
        }else if (fecha3 == 3) {
            System.out.print(" Trecientos ");
        }else if (fecha3 == 2) {
            System.out.print(" Doscientos ");
        }else if (fecha3 == 1) {
            if (fecha2 == 0 && fecha ==0) {
                System.out.print(" Cien ");
            }else{
                System.out.print(" Ciento ");
            }
        }else if (fecha3 == 0) {
            System.out.print(" ");

        }if (fecha2 == 9) {
           if (fecha == 0) {
               System.out.print(" Noventa "); 
           }else{
                System.out.print(" Noventa y "); 
           }
        }else if (fecha2 == 8) {
            if (fecha == 0) {
                System.out.print(" Ochenta "); 
            }else{
                System.out.print(" Ochenta y "); 
            }
        }else if (fecha2 == 7) {
            if (fecha == 0) {
                System.out.print(" Setenta "); 
            }else{
                System.out.print(" Setenta y "); 
            }
        }else if (fecha2 == 6) {
            if (fecha == 0) {
                System.out.print(" Sesenta "); 
            }else{
                System.out.print(" Sesenta y "); 
            }
        }else if (fecha2 == 5) {
            if (fecha == 0) {
                System.out.print(" Cincuenta "); 
            }else{
                System.out.print(" Cincuenta y "); 
            }
        }else if (fecha2 == 4) {
            if (fecha == 0) {
                System.out.print(" Cuarenta "); 
            }else{
                System.out.print(" Cuarenta y "); 
            }
        }else if (fecha2 == 3) {
            if (fecha == 0) {
                System.out.print(" Treinta "); 
            }else{
                System.out.print(" treinta y "); 
            }
        }else if (fecha2 == 2) {
            if (fecha == 0) {
                System.out.print(" Veinte "); 
            }else{
                System.out.print(" Veinti y "); 
            }
        }else if (fecha2 == 1) {
            if (fecha == 0) {
                System.out.print(" Diez "); 
            }if (fecha == 1) {
                System.out.print(" Once ");   
            }if (fecha == 2) {
                System.out.print(" Doce ");
            }if (fecha == 3) {
                System.out.print(" Trece ");
            }if (fecha == 4) {
                System.out.print(" Catorce ");
            }if (fecha == 5) {
                System.out.print(" Quince ");
            }if (fecha == 6) {
                System.out.print(" Dieciseis ");
            }if (fecha == 7) {
                System.out.print(" Diecisiete ");
            }if (fecha == 8) {
                System.out.print(" Dieciocho ");
            }if (fecha == 9) {
                System.out.print(" Diecinueve ");
            }
        }if (fecha == 9) {
            if (fecha2 >= 2) {
                System.out.print(" Nueve ");
            }
        }if (fecha == 8) {
            if (fecha2 >= 2) {
                System.out.print(" Ocho ");
            }
        }if (fecha == 7) {
            if (fecha2 >= 2) {
                System.out.print(" Siete ");
            }
        }if (fecha == 6) {
            if (fecha2 >= 2) {
                System.out.print(" Seis ");
            }
        }if (fecha == 5) {
            if (fecha2 >= 2) {
                System.out.print(" Cinco ");
            }
        }if (fecha == 4) {
            if (fecha2 >= 2) {
                System.out.print(" Cuatro ");
            }
        }if (fecha == 3) {
            if (fecha2 >= 2) {
                System.out.print(" Tres ");
            }
        }if (fecha == 2) {
            if (fecha2 >= 2) {
                System.out.print(" Dos ");
            }
        }if (fecha == 1) {
            if (fecha2 >= 2) {
                System.out.print(" Uno ");
            }
        }                                                                                                                                                                                                                                                
    }
}