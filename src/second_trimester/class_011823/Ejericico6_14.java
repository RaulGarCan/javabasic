package second_trimester.class_011823;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejericico6_14 {
    /*
        6.14 Diseña una aplicación que se comporte como una pequeña agenda. Mediante un menú el usuario poder elegir entre:

                1.- Añadir un nuevo contacto (nombre y teléfono)
                2.- Buscar el teléfono de un contacto a partir del nombre.
                3.- Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre.
     */
    static String[][] agenda = new String[2][0];
    static int nColumnas = 0;
    public static void nuevoContacto(String nombre, String telefono){
        agenda[0] = Arrays.copyOf(agenda[0], agenda[0].length+1);
        agenda[1] = Arrays.copyOf(agenda[1], agenda[1].length+1);
        agenda[0][nColumnas] = nombre;
        agenda[1][nColumnas] = telefono;
        nColumnas++;
    }
    public static String buscarTelefono(String nombre){
        String telefonoEncontrado = "";
        for (int i=0; i<agenda[1].length; i++){
            if (agenda[0][i].equals(nombre)){
                telefonoEncontrado=agenda[1][i];
            }
        }
        return telefonoEncontrado;
    }
    public static void ordenarAgenda(){
        Arrays.sort(agenda[0]);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String nombre = "";
        String telefono = "";
        boolean ejecucion = true;
        do {
            System.out.println(
                    "1.- Añadir un nuevo contacto\n" +
                    "2.- Buscar el teléfono de un contacto a partir del nombre\n" +
                    "3.- Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre\n"+
                            "4.- Mostrar la agenda completa."
            );
            System.out.print("Introduce la opción deseada: ");
            char opcion = userInput.nextLine().strip().charAt(0);
            switch (opcion){
                case '1':
                    System.out.println("Opción 1 seleccionada");
                    System.out.print("Introduce el nombre del contacto: ");
                    nombre = userInput.nextLine().strip();
                    System.out.print("Introduce el teléfono del contacto: ");
                    telefono = userInput.nextLine().strip();
                    nuevoContacto(nombre, telefono);
                    break;
                case '2':
                    System.out.println("Opción 2 seleccionada");
                    System.out.print("Introduce el nombre del contacto: ");
                    nombre = userInput.nextLine().strip();
                    System.out.println(buscarTelefono(nombre));
                    break;
                case '3':
                    System.out.println("Opción 3 seleccionada");
                    break;
                case '4':
                    for (int i=0; i<2; i++){
                        System.out.println(Arrays.toString(agenda[i]));
                    }
                    break;
                default:
                    ejecucion = false;
                    break;
            }
        }while (ejecucion);
    }
}
