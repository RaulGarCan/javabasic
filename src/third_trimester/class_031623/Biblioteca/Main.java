package third_trimester.Biblioteca;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("libro1","autor1");
        Libro libro2 = new Libro("libro2", "autor2");
        Persona persona1 = new Persona("nombre1","12345678A","123456789",TipoPersona.NOESTUDIANTE);
        Persona persona2 = new Persona("nombre2","12345678A","123456789",TipoPersona.ESTUDIANTE);

        biblioteca.addCatalogo(libro1);
        biblioteca.prestar(persona1, libro1, LocalDate.of(2023, Month.MAY, 7));
        biblioteca.devolver(libro1, LocalDate.now());

        biblioteca.addCatalogo(libro2);
        biblioteca.prestar(persona1, libro2, LocalDate.of(2023, Month.MAY,1));
        biblioteca.devolver(libro2, LocalDate.now());

        System.out.println(biblioteca.pago(persona1));
        System.out.println(biblioteca.pago(persona2));
    }
}
