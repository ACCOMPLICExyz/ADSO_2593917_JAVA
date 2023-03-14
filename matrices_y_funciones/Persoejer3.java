public class Persoejer3{

    private int cedula;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;

    public Persoejer3 (int cedula, String nombres, String apellidos, String direccion, String telefono){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public int getCedula(){
        return this.cedula;
    }
    public String getNombres(){
        return this.nombres;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setCedula(int cedula ){
        this.cedula = cedula;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void mostrarDatos(){
        System.out.println("|| -----------------------------------||");
        System.out.print("documento : "+this.cedula);
        System.out.print("nombre: "+this.nombres);
        System.out.print("apellidos: "+this.apellidos);
        System.out.print("correo: "+this.correo);
        System.out.print("telefono: "+this.telefono);
        System.out.println("|| -----------------------------------||");
        
    }

    public void ResumenD (){
        System.out.println("  "+ this.cedula + " - "+ this.nombres+" "+this.apellidos);
    }
}