package second_trimester.class_020123;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;
import java.util.Scanner;

public class Texto {
    /*
        Actividad 7.7: diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
            - La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
            - Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud máxima, es decir, exista espacio disponible.
            - Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando no se rebase el tamaño máximo establecido.
            - Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
            - Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha y hora de la última modificación efectuada.
            - Deberá existir un método que muestre la información que gestiona cada texto.
     */
    static int longitudMax = (int)(20+(20*Math.random())); // Genera un número entre el 20 y el 40
    private String cadena;
    private final Date fechaCreacion;
    private Date fechaModificacion;
    public Texto(Date fechaCreacion, String cadena){
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaCreacion;
        this.cadena = cadena;
    }
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public Date getFechaModificacion() {
        return fechaModificacion;
    }
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public void addPrincipio(String texto){
        cadena = texto+cadena;
        Date fechaModificacion = new Date();
        setFechaModificacion(fechaModificacion); // Actualiza la fecha de modificación
    }
    public void addFin(String texto){
        cadena += texto;
        Date fechaModificacion = new Date();
        setFechaModificacion(fechaModificacion); // Actualiza la fecha de modificación
    }
    public int cantidadVocales(){
        String vocales = "aeiouáéíóú";
        int nVocales = 0;
        for (int i=0; i<cadena.length(); i++){
            for (int j=0; j<vocales.length(); j++){
                if (cadena.charAt(i)==vocales.charAt(j)){
                    nVocales++;
                }
            }
        }
        return nVocales;
    }
    public void mostrarInformacion(){
        System.out.println("\nEl texto actual es: "+getCadena());
        System.out.println("La longitud del texto es de: "+getCadena().length()+"/"+longitudMax);
        System.out.println("La fecha de creación del texto es: "+getFechaCreacion());
        System.out.println("La última modificación se produjo el: "+getFechaModificacion()+"\n");
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce la cadena de texto: ");
        String cadenaUsuario = userInput.nextLine().strip();
        Date fechaCreacion = new Date();
        Texto texto1 = new Texto(fechaCreacion, cadenaUsuario);
        boolean ejecucion = true;
        int opcion;
        do {
            System.out.println("1.- Añadir una cadena o caracter al principio o al final");
            System.out.println("2.- Solicitar el número de vocales");
            System.out.println("3.- Mostrar información del objeto");
            System.out.print("Introduce la opción deseada: ");
            opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Añadir cadena o caracter al principio o fin
                    System.out.print("Introduce los caracteres que quieres añadir: ");
                    userInput.nextLine();
                    String caracteresNuevos = userInput.nextLine().strip();
                    System.out.print("Define dónde quieres añadirlos (Principio o Final): ");
                    String posicion = userInput.nextLine().strip().toLowerCase();
                    if (((cadenaUsuario.length())+(caracteresNuevos.length()))<=longitudMax){
                        if (posicion.equalsIgnoreCase("principio")){
                            texto1.addPrincipio(caracteresNuevos);
                        } else if (posicion.equalsIgnoreCase("final")){
                            texto1.addFin(caracteresNuevos);
                        }
                    } else {
                        System.out.println("No puedes superar la longitud máxima: "+longitudMax);
                    }
                    break;
                case 2: // Conocer numero vocales
                    System.out.println("El texto tiene "+texto1.cantidadVocales()+" vocales");
                    break;
                case 3: // Mostrar informacion del objeto
                    texto1.mostrarInformacion();
                    break;
                default:
                    ejecucion = false;
                    System.out.println("Cerrando el programa...");
                    break;
            }
        }while (ejecucion);
    }
}
