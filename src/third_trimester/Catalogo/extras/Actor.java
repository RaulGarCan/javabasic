package extras;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Actor extends Persona {
    private int nParticipaciones;
    public Actor(String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion, int nParticipaciones){
        super(nombre, fechaNacimiento, fechaDefuncion);
        this.setnParticipaciones(nParticipaciones);
    }
    public Actor(String nombre, LocalDate fechaNacimiento, int nParticipaciones){
        super(nombre, fechaNacimiento);
        this.setnParticipaciones(nParticipaciones);
    }
    public Actor(Actor origen){
        super(origen);
        this.nParticipaciones=origen.nParticipaciones;
    }

    public int getnParticipaciones() {
        return nParticipaciones;
    }

    public void setnParticipaciones(int nParticipaciones) {
        this.nParticipaciones = nParticipaciones;
    }

    @Override
    public int getEdad() {
        int edad = super.getEdad();
        if(this.getFechaDefuncion()==null){
            if(edad>35){
                return edad-5;
            }
            return edad;
        }
        return edad;
    }

    @Override
    public String toString() {
        return super.toString()+",Numero Participaciones: "+this.getnParticipaciones();
    }
}
