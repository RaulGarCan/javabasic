package third_trimester.Biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private static final int MAXRETRASO = 10;
    private Persona persona;
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    public Prestamo(Persona persona, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion){
        this.persona=persona;
        this.libro=libro;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaDevolucion=fechaDevolucion;
        this.libro.setEstaDisponible(false);
    }
    public Prestamo(Prestamo origen){
        this.persona=origen.persona;
        this.libro=origen.libro;
        this.fechaPrestamo=origen.fechaPrestamo;
        this.fechaDevolucion=origen.fechaDevolucion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        this.libro.setEstaDisponible(true);
    }

    public int diasMulta(){
        int diferenciaDias = (int)(ChronoUnit.DAYS.between(this.fechaPrestamo, this.fechaDevolucion));
        if(this.fechaDevolucion==null){
            return -1;
        }
        if(diferenciaDias<=MAXRETRASO){
            return 0;
        }
        return diferenciaDias-MAXRETRASO;
    }
    public int getMulta(){
        return diasMulta()*this.getPersona().getTipoPersona().getEurosPorDia();
    }

    public Libro getLibro() {
        return libro;
    }
}
