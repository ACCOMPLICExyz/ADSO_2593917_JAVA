public class Principal_1{
    //Atributos
    private int cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String password;

    //Metodos
    public Principal_1 (int cedula, String nombres, String apellidos, String correo, String telefono){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.password = String.valueOf(cedula);
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
    public String getCorreo(){
        return this.correo;
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
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public boolean setPassword(String old_pass, String new_pass){
        if (old_pass.equals(this.password)){
            this.password = new_pass;
            return true;
        }else{
            System.out.println("--> Contraseña incorrecta");
            return false;
        }
    }
    public void mostrarDatos(){
        System.out.println("|| -----------------------------------||");
        System.out.print("documento : "+this.apellidos);
        System.out.print("nombre: "+this.nombres);
        System.out.print("apellidos: "+this.apellidos);
        System.out.print("correo: "+this.correo);
        System.out.print("telefono: "+this.telefono);
        System.out.println("|| -----------------------------------||");
        
    }
    public void mostrarResumenDatos(){
		System.out.println("     "+this.cedula+" - "+this.nombres+" "+this.apellidos);
	}
    

    
}
