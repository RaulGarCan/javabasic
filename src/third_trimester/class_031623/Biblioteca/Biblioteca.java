package third_trimester.Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList <Libro> libros;
    private ArrayList <Prestamo> prestamos;
    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }
    public void prestar(Persona persona, Libro libro, LocalDate fechaPrestamo){
        for(int i=0; i<this.libros.size(); i++){
            if(this.libros.get(i).isEstaDisponible() && this.libros.get(i)==libro){
                this.prestamos.add(new Prestamo(persona, libro,fechaPrestamo, null));
            }
        }
    }
    public void devolver(Libro libro, LocalDate fechaDevolucion){
        for(int i=0; i<this.prestamos.size(); i++) {
            if (this.prestamos.get(i).getLibro() == libro) {
                this.prestamos.get(i).setFechaDevolucion(fechaDevolucion);
            }
        }
    }
    public void addCatalogo(Libro libro){
        libros.add(libro);
    }
    public int pago(Persona persona){
        int pagoTotal = 0;
        for(int i=0; i<this.prestamos.size(); i++){
            if(this.prestamos.get(i).getPersona()==persona && this.prestamos.get(i).getFechaDevolucion()!=null){
                pagoTotal+=this.prestamos.get(i).getMulta();
            }
        }
        return pagoTotal;
    }
}
