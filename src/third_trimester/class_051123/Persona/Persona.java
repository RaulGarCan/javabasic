package third_trimester.class_051123.Persona;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
    /*
        2. Implementa una clase Persona que tenga como atributos el nombre y la edad. Añádele
        constructor por defecto, con parámetros y de copia, además de getters y setters para los
        atributos, y el método toString(). Toda Persona puede demostrar si es mayor de edad o
        no. Implementa las siguientes clases que hereden de Persona:

            ● Estudiante: los Estudiantes están matriculados en un tipo de enseñanza
            (Primaria, Secundaria, Formación Profesional, Universitaria) y pueden mostrar
            por pantalla que van a realizar un determinado examen.
            ● Juez: un Juez puede certificar la edad de otra Persona, confirmado si es mayor
            de edad.
            ● Profesor: un Profesor tiene a su cargo un grupo de Estudiantes que pertenecen
            al mismo tipo de enseñanza.
            ● Modifica el método toString() para cada subclase.
     */
    private String nombre;
    private LocalDate edad;
    public Persona(){
        this.nombre = "";
        this.edad = null;
    }
    public Persona(String nombre, LocalDate edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }
    public Persona(Persona origen){
        this.edad = origen.edad;
        this.nombre = origen.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return (int)ChronoUnit.YEARS.between(this.edad, LocalDate.now());
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }
    public boolean esMayorEdad(LocalDate edad){
        return getEdad()>=18;
    }
}
