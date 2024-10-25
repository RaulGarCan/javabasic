package extras;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaDefuncion;
    public Persona(String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion){
        this.setNombre(nombre);
        this.setFechaNacimiento(fechaNacimiento);
        this.setFechaDefuncion(fechaDefuncion);
    }
    public Persona(String nombre, LocalDate fechaNacimiento){
        this.setNombre(nombre);
        this.setFechaNacimiento(fechaNacimiento);
    }
    public Persona(Persona origen){
        this.nombre=origen.nombre;
        this.fechaDefuncion=origen.fechaDefuncion;
        this.fechaNacimiento=origen.fechaNacimiento;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if(ChronoUnit.DAYS.between(fechaNacimiento, LocalDate.now())<0){
            this.fechaNacimiento=null;
        } else {
            this.fechaNacimiento=fechaNacimiento;
        }
    }

    public LocalDate getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(LocalDate fechaDefuncion) {
        if(ChronoUnit.DAYS.between(fechaDefuncion, LocalDate.now())<0){
            this.fechaDefuncion=null;
        }else {
            this.fechaDefuncion=fechaDefuncion;
        }
    }
    public int getEdad(){
        if(this.fechaDefuncion!=null){
            return (int) ChronoUnit.YEARS.between(this.fechaNacimiento, this.fechaDefuncion);
        }
        return (int)ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+",Fecha de Nacimiento: "+this.getFechaNacimiento()+",Fecha de Defuncion: "+this.getFechaDefuncion();
    }
}
