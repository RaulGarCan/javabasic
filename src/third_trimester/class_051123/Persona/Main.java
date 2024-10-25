package third_trimester.class_051123.Persona;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate edad = LocalDate.of(2003, Month.JANUARY, 27);
        Persona persona = new Persona("nombre", edad);
        System.out.println(persona.getEdad());
    }
}
