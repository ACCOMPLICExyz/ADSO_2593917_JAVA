import java.util.Scanner;
import java.util.Random;
public class Ejemplo5 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ultimos_int = 13; // Constante con el limite de fallos
        int intentos = 0;
        int aciertos = 0;
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        char respu;
        // Random
        Random word = new Random();
        // Creamos
        String arrayteclas[] = new String[4];
        arrayteclas[0] = "diomedez";
        arrayteclas[1] = "software";
        arrayteclas[2] = "fucks news";
        arrayteclas[3] = "mouse";
 
        do {
 
        // Desguazamos la palabra y la guardamos en un array de caracteres
        int alea = word.nextInt(3);
        char[] partes1 = partes2(arrayteclas[alea]);
        char[] copia = partes2(arrayteclas[alea]); // Algo auxiliar para mas tarde
        // Array
        char[] respuestas = new char[partes1.length];
 
        // Rellenamos palabras con guiones
        for(int i = 0; i < respuestas.length; i++){
            respuestas[i] = '_';
        }
 
        //
        System.out.println("Adivina la palabra");
 
        // Mientras que no nos pasemos con los intentos y no la acertemos...
        while(intentos < ultimos_int && aciertos != respuestas.length){
            imprimeOculta(respuestas);
            // 
            System.out.println("\nIntroduce una letra: ");
            respu = entrada.next().toLowerCase().charAt(0);
            // Recorremos el array y comprobamos si se ha producido un acierto
            for(int i = 0; i < partes1.length; i++){
                if(partes1[i]==respu){
                    respuestas[i] = partes1[i];
                    partes1[i] = ' ';
                    aciertos++;
                }
            }
            intentos++;
        }
        // Si hemos acertado todas imprimimos un mensahe
        if(aciertos == respuestas.length){
            System.out.print("\nLograste adivinar la palabra: ");
            imprimeOculta(respuestas);
        }
        // Si no otro
        else{
            System.out.print("\nFallaste, la palabra era: ");
            for(int i = 0; i < copia.length; i++){
                System.out.print(copia[i] + " ");
            }
        }
        // Reseteamos contadores
        intentos = 0;
        aciertos = 0;
        // Volvemos a preguntarle al usuario si quiere volver a perder el tiempo
        respu = pregunta("\n\nQuieres volver a jugar?",entrada);
        }while(respu != 'n');
 
    }
 
     /**
     * Parte cada carecter
     * @return array de letras.
     */
    private static char[] partes2(String azar){
        char[] letras;
        letras = new char[azar.length()];
        for(int i = 0; i < azar.length(); i++){
            letras[i] = azar.charAt(i);
        }
        return letras;
    }
 
    /**
     * Esto imprime la palabra con espacios
     * @param respuestas el array de caracteres
     */
    private static void imprimeOculta(char[] respuestas){
 
        for(int i = 0; i < respuestas.length; i++){
            System.out.print(respuestas[i] + " ");
        }
    }
 
    /**
     * Esto nos pregunta si queremos volver a jugar y comprueba los caracteres
     * introducidos
     * @param men texto para mostrar al usuario
     * @return caracter de respuesta (s/n)
     */
    public static char pregunta(String men, Scanner entrada) {
        char respu;
        System.out.println(men + " (s/n)");
        respu = entrada.next().toLowerCase().charAt(0);
        while (respu != 's' && respu != 'n') {
            System.out.println("Error! solo se admite S o N");
            respu = entrada.next().toLowerCase().charAt(0);
        }
        return respu;
    }
 
}