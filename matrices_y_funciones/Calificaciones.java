public class Persona{

    // Atributos
    int cedula;
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

    public Persona(int cedula, String nombres, String apellidos, String genero, int edad, int peso, int altura){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;

    }
}

