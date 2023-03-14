import java.util.Scanner;

public class Poo_1{
    public static void main(String[] args) {
        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Principal_1 arreglo [] = new Principal_1 [100];
        int pos_disponible = 0;
        int opcion = 0;
        do{
            System.out.println("|| ------------------------------------------------------------------ ||");
            System.out.println("|| ------------------- SECCION CLIENTES ----------------------------- ||");
            System.out.println("|| ------------------------------------------------------------------ ||");
            System.out.println("||                                           Personas Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+"-||");
            System.out.println("||                                                                    ||");
            System.out.println("|| 1. Registrar Cliente.                                              ||");
            System.out.println("|| 2. Ver Clientes Registrados.                                       ||");
            System.out.println("|| 3. Ordenar lista de personas.                                      ||");
            System.out.println("|| 4. Salir.                                                          ||");
            System.out.println("|| ------------------------------------------------------------------ ||");
            opcion = entrada_numero.nextInt();
            if(opcion == 1){
                System.out.print(" Ingrese una cedula: ");
                int cedula = entrada_numero.nextInt();

                System.out.print(" Ingrese su nombre: ");
                String nombres = entrada_texto.nextLine();

                System.out.print(" Ingrese su apellido: ");
                String apellidos = entrada_texto.nextLine();

                System.out.print(" Ingrese su Correo electronico: ");
                String correo = entrada_texto.nextLine();

                System.out.print(" Ingrese su Telefono: ");
                String telefono = entrada_texto.nextLine();

                Principal_1 temporal = new Principal_1(cedula, nombres, apellidos, direccion, telefono);
                Boolean valido = true;
                for (int i = 0; i<pos_disponible; i++){
                    if (cedula == arreglo[i].getCedula()){
                        valido = false;
                        System.out.println("EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR \n\n");
                        break;
                    }
                }
                if(valido){
                    arreglo[pos_disponible] = temporal;
                    pos_disponible++;
                    System.out.println("||Se registro con exito|| \n\n");
                }
            }else if (opcion == 2){
                for (int i = 0; i<arreglo.length; i++){
                    if (arreglo[i]!=null){
                        arreglo[i].mostrarResumenDatos();
                    }
                }
                System.out.println("\n\n");
            }else if (opcion == 3 ){
                for (int i = 0; i<arreglo.length; i++){
                    for (int j = 0; j<arreglo.length-1; i++){
                        if ( arreglo[j]!=null && arreglo[j+1]!=null){
                            if (arreglo[j].getNombres().compareToIgnoreCase(arreglo[j+1].getNombres()) > 0){
                                Principal_1 aux = arreglo[j];
                                arreglo[j] = arreglo[j+1];
                                arreglo[j+1] = aux;
                            }
                        }
                    }
                }

            }else if (opcion == 4){
                System.out.println("||=== SALIENDO ===||");
            }else{
                System.out.println("||---------------------------||");
                System.out.println("||------OPCION INVALIDA------||");
                System.out.println("||---------------------------||");
            }
        }while(opcion != 4);
        
    }
}