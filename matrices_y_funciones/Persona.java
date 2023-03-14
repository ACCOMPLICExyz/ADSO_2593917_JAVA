public class Persona{

    // Atributos                            //Metodos Gets = Extraer el valor 
    int cedula;                             //Metodos sets = cambiar o asignarle un nuevo valor                
    String nombres;
    String apellidos;
    String genero;
    int edad;
    int peso;
    int altura;

    //Metodos
    public Persona(){
        this.cedula = 0;
        this.nombres = "";
        this.apellidos = "";
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(int cedula, String nombres, String apellidos){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(int cedula, String nombres, String apellidos, String genero, int edad, int peso, int altura){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

    }

    public int getPeso(){
        return this.peso;
    }

    public void setPeso(int nuevo_peso){
        this.peso = nuevo_peso;
    }


    public void comer(int gramos){
        this.peso += (int) (gramos*0.1);
    }

    public void imprimirCartaPresentacion(){
        System.out.println("-------------------------------");
        System.out.println(" -- DATOS PERSONA       -");
        System.out.println("-------------------------------");
        System.out.println(" |  Cedula: " + this.cedula );
        System.out.println(" |  Nombres: " + this.nombres );
        System.out.println(" |  Apellidos: " + this.apellidos );
        System.out.println(" |  Genero: " + this.genero );
        System.out.println(" |  Edad: " + this.edad );
        System.out.println(" |  Peso: " + this.peso );
        System.out.println(" |  Altura: " + this.altura );
        System.out.println("-------------------------------");

    }
}
