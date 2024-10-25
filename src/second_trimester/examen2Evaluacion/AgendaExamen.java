package second_trimester.examen2Evaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class AgendaExamen {
    static String[][] agenda = new String[2][0]; // String bidimensional que representa la agenda
    static int nColumnas = 0; // Contador de columnas de la agenda
    public static boolean estaNombreEnAgenda(String nombreBuscar){
        for (int i=0; i<agenda[0].length; i++){
            if (agenda[0][i].equalsIgnoreCase(nombreBuscar)){
                return true;
            }
        }
        return false;
    }
    public static int eliminarUsuarioTelefono(String usuarioEliminar){
        if (estaNombreEnAgenda(usuarioEliminar)){
            for (int j=0; j<agenda[0].length; j++){
                if (agenda[0][j].equalsIgnoreCase(usuarioEliminar)){ // Busca y borra el usuario solicitado
                    agenda[0][j] = null;
                    agenda[1][j] = null;
                    for (int l=j; l<agenda[0].length-1; l++){ // Mueve automáticamente los miembros de la agenda hacia la izquierda
                        agenda[0][l] = agenda[0][l+1]; // Mueve nombres
                        agenda[1][l] = agenda[1][l+1]; // Mueve telefonos
                    }
                    // Deja vacío el final de la agenda
                    agenda[0][agenda[0].length-1] = null;
                    agenda[1][agenda[1].length-1] = null;
                    // Reduce el tamaño de la agenda tras eliminar y mover los valores
                    agenda[0] = Arrays.copyOf(agenda[0], agenda[0].length-1);
                    agenda[1] = Arrays.copyOf(agenda[1],agenda[1].length-1);
                    return 1;
                }
            }
        } else {
            System.out.println("El usuario no se encuentra en la agenda");
        }
        return 0;
    }
    public static boolean insertarUsuarioTelefono(String nuevoUsuario, String telefono){
        nColumnas = agenda[0].length;
        if (!(estaNombreEnAgenda(nuevoUsuario))) { // Si no está en la agenda lo añade
            agenda[0] = Arrays.copyOf(agenda[0], agenda[0].length + 1);
            agenda[1] = Arrays.copyOf(agenda[1], agenda[1].length + 1);
            agenda[0][nColumnas] = nuevoUsuario;
            agenda[1][nColumnas] = telefono;
            nColumnas++;
            return true; // El usuario ha sido añadido a la agenda
        }
        return false; // El usuario ya se encuentra en la agenda = false
    }
    public static int imprimirOpcionesAgenda(Scanner introUsuario){
        int numeroIntroducido;
        do {
            //                  Menu
            System.out.println("Opciones de la agenda:");
            System.out.println("1. Insertar usuario y teléfono.");
            System.out.println("2. Eliminar usuario y teléfono.");
            System.out.println("3. Mostrar usuarios de la agenda.");
            System.out.println("4. Salir.");
            System.out.print("Qué opción quieres realizar: ");
            //
            while (!(introUsuario.hasNextInt())){ // Evita la entrada de valores no enteros
                System.out.print("Introduce un número del 1 al 4: ");
                introUsuario.nextLine();
            }
            numeroIntroducido = introUsuario.nextInt();
            return numeroIntroducido; // Devolverá un número del 1 al 4
        }while (numeroIntroducido<0 || numeroIntroducido>4);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        String keyword = "salir";
        boolean ejecucion = true;
        String nombreInsertar = "";
        String telefonoInsertar = "";
        do {
            switch (imprimirOpcionesAgenda(userInput)){
                case 1:     // Insertar usuario y teléfono
                    boolean continuar = true;
                    int loops = 0; // Esta variable se utiliza para arreglar un fallo visual de los mensajes en la terminal que solo sucede en el primer bucle
                    do {
                        do {
                            System.out.print("Introduce el nombre sin apellidos a insertar: ");
                            if (loops==0){
                                loops++;
                                userInput.nextLine();
                            }
                            while (userInput.hasNextDouble()){
                                System.out.print("Introduce el nombre sin apellidos: ");
                                userInput.nextLine();
                            }
                            nombreInsertar = userInput.nextLine().strip();
                        }while (nombreInsertar.split(" ").length!=1); // Comprueba que se ha introducido únicamente el nombre
                        if (nombreInsertar.equalsIgnoreCase(keyword)){
                            continuar = false;
                            break;
                        }
                        System.out.print("Introduce el telefono a insertar: ");
                        telefonoInsertar = userInput.nextLine().strip();
                        if (telefonoInsertar.equalsIgnoreCase(keyword)){
                            continuar = false;
                            break;
                        }
                        if (!(nombreInsertar.equalsIgnoreCase("") || telefonoInsertar.equalsIgnoreCase(""))){
                            if (insertarUsuarioTelefono(nombreInsertar, telefonoInsertar)){
                                System.out.println("Usuario añadido a la agenda");
                            } else {
                                System.out.println("El usuario ya está en la agenda");
                            }
                        }
                    } while (continuar);
                    break;
                case 2:     // Eliminar usuario y teléfono
                    String nombreBorrar = "";
                    do {
                        System.out.print("Introduce el nombre sin apellidos a eliminar: ");
                        userInput.nextLine();
                        while (userInput.hasNextDouble()){
                            System.out.print("Introduce el nombre sin apellidos: ");
                            userInput.nextLine();
                        }
                        nombreBorrar = userInput.nextLine().strip();
                    }while (nombreBorrar.split(" ").length>1); // Comprueba que se ha introducido únicamente el nombre
                    if (nColumnas==0) { // Comprueba si la agenda está vacía
                        System.out.println("La agenda está vacía");
                    } else {
                        if(eliminarUsuarioTelefono(nombreBorrar)==1){
                            System.out.println("Usuario eliminado correctamente"); // El metodo devuelve 1 = usuario eliminado
                        }
                    }
                    break;
                case 3:     // Mostrar usuarios de la agenda
                    if (nColumnas==0){ // Comprueba si la agenda está vacía
                        System.out.println("La agenda está vacía");
                    } else { // Imprime las 2 filas de la agenda
                        System.out.println(Arrays.toString(agenda[0]));
                        System.out.println(Arrays.toString(agenda[1]));
                    }
                    break;
                case 4:     // Salir
                    System.out.println("Hasta la próxima");
                    ejecucion = false;
                    break;
                default:    // Nunca debería suceder pero previene de posibles errores
                    System.out.println("Error inesperado, vuelve a intentarlo");
                    break;
            }
        }while (ejecucion);
    }
}
