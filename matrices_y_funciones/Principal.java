
public class Principal{
    public static void main(String[] args){

        // Instancia de la clase Persona

        Persona lista [] = new Persona[10];


        Persona mauricio = new Persona();
        Persona alberth = new Persona(108800, "Jhon Alberth", "Aricapa Pinto", "Masculino", 17, 50000, 160);
        Persona monsalve = new Persona(108801, "Juan David", "Monsalve");

        lista[0].imprimirCartaPresentacion();
        lista[1].imprimirCartaPresentacion();
        lista[2].imprimirCartaPresentacion();

        System.out.println("Cedula de Mauricio: " + mauricio.cedula);
        System.out.println("Cedula de Monsalve: " + monsalve.cedula);

        alberth.comer(850);
        alberth.imprimirCartaPresentacion();
    }
}