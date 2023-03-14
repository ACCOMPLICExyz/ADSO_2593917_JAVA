import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        //Creando variable de entrada
        Scanner entrada = new Scanner(System.in);

        //solicitar ingresar un numero
        System.out.println(" => Ingrese un numero de maximo 9 digitos: ");
        int numero = entrada.nextInt();

        //obtener todos los digitos por separado
        int dig_1 = numero%10;
        int dig_2 = (numero/10)%10;
        int dig_3 = (numero/100)&10;
        int dig_4 = (numero/1000)%10;
        int dig_5 = (numero/10000)%10;
        int dig_6 = (numero/100000);         
        
        //algoritmo para obtener el 6to digito
        
        if (dig_6 == 9) {
            System.out.print("Novecientos ");
        }else if (dig_6 == 8){
            System.out.print(" Ochocientos  ");           
        }else if (dig_6 == 7){
             System.out.print(" Setecientos ");
        }else if (dig_6 == 6 ){
             System.out.print(" Seiscientos ");
        }else if (dig_6 == 5){
            System.out.print(" Quinientos ");
        }else if (dig_6 == 4){
            System.out.print(" Cuatrocientos ");
        }else if (dig_6 == 3){
            System.out.print(" Trecientos ");
        }else if (dig_6 == 2){
            System.out.print(" Docientos ");
        }else if (dig_6 == 1){
            if (dig_5==0 && dig_4==0){
                System.out.print(" Cien mil");
            }else{
                System.out.print(" Ciento ");
            }
        }else if (dig_6 == 0) {
            System.out.print("");
        }

        //Algoritmo para imprimir el texto del 5to digito.
        if(dig_5 == 9) {
            if (dig_4==0) {
                System.out.print(" Noventa mil ");
            }else{
                System.out.print(" Noventa y ");
            }
        }else if (dig_5 == 8){
            if (dig_4==0){
                System.out.print(" Ochenta mil ");
            }else{
                System.out.print(" Ochenta y ");
            }
        }else if (dig_5 == 7){
            if (dig_4==0){
                System.out.print(" Setenta mil ");
            }else{
                System.out.print(" Setenta y ");
            }
        }else if (dig_5 == 6){
            if (dig_4==0){
                System.out.print(" Sesenta mil ");
            }else{
                System.out.print(" Sesenta y ");
            }
        }else if (dig_5 == 5){
            if (dig_4==0){
                System.out.print(" Cincuenta mil ");
            }else{
                System.out.print(" Cincuenta y ");
            }
        }else if (dig_5 == 4){
            if (dig_4==0){
                System.out.print(" Cuarenta mil ");
            }else{
                System.out.print(" Cuarenta y ");
            }
        }else if (dig_5 == 3){
            if (dig_4==0){
                System.out.print(" Treinta mil ");
            }else{
                System.out.print(" Treinta y ");
            }
        }else if (dig_5 == 2){
            if (dig_4==0){
                System.out.print(" Veinte mil ");
            }else{
                System.out.print(" Veinti y ");
            }
        }else if(dig_5 == 1){

            if (dig_4 == 0) {
                System.out.print(" Diez ");
            }else if (dig_4 == 1){
                System.out.print(" Once ");
            }else if (dig_4 == 2){
                System.out.print(" Doce ");
            }else if (dig_4 == 3){
                System.out.print(" Trece ");
            }else if (dig_4 == 4){
                System.out.print(" Catorce ");
            }else if (dig_4 == 5){
                System.out.print(" Quince ");
            }else{
                System.out.print(" Dieci ");
            }
        }else if (dig_5 == 0){
            System.out.print("");
        }
        //Algoritmo para imprimir el texto del 4to digito.
        if (dig_4 == 9 ) {
            if (dig_3 >= 0) {
                System.out.print(" nueve mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 8 ) {
            if (dig_3 >= 0) {
                System.out.print(" ocho mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 7 ) {
            if (dig_3 >= 0) {
                System.out.print(" siete mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 6 ) {
            if (dig_3 >= 0) {
                System.out.print(" seis mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 5 ) {
            if (dig_3 >= 0) {
                System.out.print(" cinco mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 4 ) {
            if (dig_3 >= 0) {
                System.out.print(" cuatro mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 3 ) {
            if (dig_3 >= 0) {
                System.out.print(" tres mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 2 ) {
            if (dig_3 >= 0) {
                System.out.print(" dos mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 1 ) {
            if (dig_3 >= 0) {
                System.out.print(" mil ");
            }else{
                System.out.print("");
            }
        }else if (dig_4 == 0) {
            System.out.print("");
        }
        //Algoritmo para imprimir el texto del 3er digito.

        
        if (dig_3 == 9) {
            System.out.print(" Novecientos ");
        }else if (dig_3 == 8) {
            System.out.print(" Ochocientos ");
        }else if (dig_3 == 7) {
            System.out.print(" Setecientos ");
        }else if (dig_3 == 6) {
            System.out.print(" Seiscientos ");
        }else if (dig_3 == 5) {
            System.out.print(" Quinientos ");
        }else if (dig_3 == 4) {
            System.out.print(" Cuatrocientos ");
        }else if (dig_3 == 3 ) {
            System.out.print(" Trecientos ");
        }else if (dig_3 == 2) {
            System.out.print(" Doscientos ");
        }else if (dig_3 == 1) {
            if (dig_2 == 0 && dig_1 == 0) {
                System.out.print(" cien ");
            }else{
                System.out.print(" ciento ");
            }
        }else if (dig_3 == 0) {
            System.out.print("");
        }
        //Algoritmo para imprimir el texto del 2do digito.

        if (dig_2 == 9) {
            if (dig_2 == 0) {
                System.out.print(" Noventa ");
            }else{
                System.out.print(" Noventa y ");
            }
        }else if (dig_2 == 8) {
            if (dig_1 == 0) {
                System.out.print(" Ochenta ");
            }else{
                System.out.print(" Ochenta y ");
            }
        }else if (dig_2 == 7) {
            if (dig_1 == 0) {
                System.out.print(" Setenta ");
            }else{
                System.out.print(" Setenta y ");
            }
        }else if (dig_2 == 6) {
            if (dig_1 == 0) {
                System.out.print(" Sesenta ");
            }else{
                System.out.print(" Sesenta y ");
            }
        }else if (dig_2 == 5) {
            if (dig_1 == 0) {
                System.out.print(" Cincuenta ");
            }else{
                System.out.print(" Cincuenta y ");
            }
        }else if (dig_2 == 4) {
            if (dig_1 == 0) {
                System.out.print(" Cuarenta ");
            }else{
                System.out.print(" Cuarenta y ");
            }
        }else if (dig_2 == 3) {
            if (dig_1 == 0) {
                System.out.print(" Treinta ");
            }else{
                System.out.print(" Treinta y ");
            }
        }else if (dig_2 == 2) {
            if (dig_1 == 0) {
                System.out.print(" Veinte ");
            }else{
                System.out.print(" Veinti y ");
            }
        }else if (dig_2 == 1) {
            if (dig_1 == 9) {
                System.out.print(" Dieci nueve");
            }if (dig_1 == 8 ) {
                System.out.print(" Dieci ocho");
            }if (dig_1 == 7) {
                System.out.print(" Dieci siete ");
            }if (dig_1 == 6) {
                System.out.print(" Dieci Seis ");
            }if (dig_1 == 5) {
                System.out.print(" Quince ");
            }if (dig_1 == 4) {
                System.out.print(" Catorce ");
            }if (dig_1 == 3) {
                System.out.print(" Trece ");
            }if (dig_1 == 2) {
                System.out.print(" Doce ");
            }if (dig_1 == 1) {
                System.out.print(" Once ");
            }
        }

        //Algoritmo para imprimir el texto del 1er digito.
        if (dig_1 == 9) {
            if (dig_2 == 0) {
                System.out.print(" Nueve ");
            }
        }else if (dig_1 == 8) {
            if (dig_2 == 0) {
                System.out.print(" Ocho ");
            }
        }else if (dig_1 == 7) {
            if (dig_2 == 0) {
                System.out.print(" Siete ");
            }
        }else if (dig_1 == 6) {
            if (dig_2 == 0) {
                System.out.print(" Seis ");
            }
        }else if (dig_1 == 5) {
            if (dig_2 == 0) {
                System.out.print(" Cinco ");
            }
        }else if (dig_1 == 4) {
            if (dig_2 == 0) {
                System.out.print(" Cuatro ");
            }
        }else if (dig_1 == 3) {
            if (dig_2 == 0) {
                System.out.print(" Tres ");
            }
        }else if (dig_1 == 2) {
            if (dig_2 == 0) {
                System.out.print(" Dos ");
            }
        }else if (dig_1 == 1) {
            if (dig_2 == 0) {
                System.out.print(" Uno ");
            }
        }else if (dig_1 == 0) {
            System.out.print("");
        }
    }
}