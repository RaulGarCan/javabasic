package third_trimester.Ej3al10.Personal;

import third_trimester.Ej3al10.Diario.Alarma;
import third_trimester.Ej3al10.Diario.DiaSemana;

public class Evento_Semanal {
    static int contador;
    String descripcion;
    Alarma alarma;
    public Evento_Semanal(String descripcion, Alarma alarma){
        if(descripcion!=null && alarma!=null){
            this.alarma = alarma;
            this.descripcion = descripcion;
            contador++;
        }
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        if(alarma!=null) {
            this.alarma = alarma;
        }
    }
    void revisaEventos(DiaSemana dia){
        if(this.alarma.getDia()==dia){
            System.out.println("Hora del evento: "+this.alarma.getHora());
            System.out.println("Descripción: "+this.descripcion);
        } else {
            System.out.println("Ese día no hay ningún evento");
        }
    }
    void cambiaHora(String hora){
        if(hora!=null){
            this.alarma.setHora(hora);
        }
    }
    @Override
    public String toString(){
        return this.alarma.getDia()+" "+this.alarma.getHora()+" "+this.getDescripcion();
    }
    @Override
    public Evento_Semanal clone(){
        return new Evento_Semanal(this.descripcion, this.alarma);
    }
    public boolean equals(Evento_Semanal evento){
        if(this.descripcion.equals(evento.descripcion) && this.alarma.getHora().equals(evento.alarma.getHora()) && this.alarma.getDia().equals(evento.alarma.getDia())){
            return true;
        }
        return false;
    }
    public static int getContador(){
        return contador;
    }
}
