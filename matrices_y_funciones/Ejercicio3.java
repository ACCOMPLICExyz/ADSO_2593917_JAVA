import java.util.Scanner;

public class Ejercicio3{
    public static void main (String [] args){

        Scanner entrada_numero = new Scanner(System.in);
        Scanner entrada_texto = new Scanner(System.in);

        Principal_1 arreglo [] = new Principal_1 [100];
        int pos_disponible = 0;
        int opcion = 0;
        int otraOpcion = 0;
        do{
            System.out.println("|| ------------------------------------------------------------------ ||");
            System.out.println("|| ------------------- SECCION CLIENTES ----------------------------- ||");
            System.out.println("|| ------------------------------------------------------------------ ||");
            System.out.println("||                                           Personas Registradas: "+((pos_disponible<10)? "0":"")+pos_disponible+"-||");
            System.out.println("||                                                                    ||");
            System.out.println("|| 1. Registrar Cliente.                                              ||");
            System.out.println("|| 2. Ver Clientes Registrados.                                       ||");
            System.out.println("|| 3. Modificar informacion cliente.                                  ||");
            System.out.println("|| 4. Ver informacion cliente.                                        ||");
            System.out.println("|| 5. Eliminar cliente.                                               ||");
            System.out.println("|| 6. Salir.                                                          ||");
            System.out.println("|| ------------------------------------------------------------------ ||");
            opcion = entrada_numero.nextInt();

            if(opcion == 1){
                System.out.print(" Ingrese una cedula: ");
                int cedula = entrada_numero.nextInt();

                System.out.print(" Ingrese su nombre: ");
                String nombres = entrada_texto.nextLine();

                System.out.print(" Ingrese su apellido: ");
                String apellidos = entrada_texto.nextLine();

                System.out.print(" Ingrese su Dirección: ");
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
            }else if(opcion == 2){
                for (int i = 0; i<arreglo.length; i++){
                    if(arreglo[i]!=null){
                        arreglo[i].ResumenD();
                    }
                }
                System.out.println("\n\n");

            }else if(opcion == 3){
                do{
                    System.out.println("Que dato desea modificar:");
                    System.out.println("1. Cedula");
                    System.out.println("2. Nombre");
                    System.out.println("3. Apellido");
                    System.out.println("4. Dirección");
                    System.out.println("5. Telefono");
                    System.out.println("6. Salir");
                    int otraOpcion = entrada_numero.nextInt();
                    if (otraOpcion == 1){
                        for (int i = 0; i<arreglo.length; i++){
                            if (arreglo[i]!=null){
                                arreglo[i].ResumenD();
                            }
                        }
                        System.out.println("Señor usuario ingrese la cedula ");
                        int vericedula = entrada_numero.nextInt();
                        if(vericedula == arreglo[i].getCedula());


                    }

                }while(otraOpcion != 6);
            }

        }while(opcion != 6);
    }

}