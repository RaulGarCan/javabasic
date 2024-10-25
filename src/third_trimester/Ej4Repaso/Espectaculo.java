package third_trimester.Ej4Repaso;

import java.util.Objects;

public class Espectaculo {
    /*
    Complementa el ejercicio anterior escribiendo una clase Espectáculo. Todo espectáculo
    tiene un nombre, un equipo, es de un tipo concreto, y puede incluir maestro de
    ceremonias o no.

        ● La clase Espectáculo debe ir en un paquete distinto a la clase anterior.
        ● El nombre del espectáculo va todo en mayúsculas.
        ● El equipo es el número de personas que participan en el espectáculo, y debe
        tener como mínimo a 1 persona, y como máximo a 30.
        ● Los espectáculos pueden ser musicales o dramáticos.
        ● Añade un constructor por defecto, uno con parámetros que obligue a que se
        cumplan todos los requisitos, y uno de copia.
        ● Añade getters y setters. Los setter también deberán obligar a que se cumplan las
        condiciones.
        ● Reescribe los métodos clone(), equals() y toString() para esta clase.
        ● Añade un objeto Espectáculo a la clase anterior, y modifica el método toString()
        para que incluya los datos del espectáculo asociado.

     */
    private String nombre;
    private int equipo;
    private TipoEspectaculo tipo;
    private boolean maestroCeremonias;
    public Espectaculo(){
        this.nombre = "";
        this.equipo = 0;
        this.tipo = null;
        this.maestroCeremonias = false;
    }
    public Espectaculo(String nombre, int equipo, TipoEspectaculo tipo, boolean maestroCeremonias){
        this.setNombre(nombre);
        this.setEquipo(equipo);
        this.setTipo(tipo);
        this.setMaestroCeremonias(maestroCeremonias);
    }
    public Espectaculo(Espectaculo origen){
        this.nombre = origen.nombre;
        this.equipo = origen.equipo;
        this.tipo = origen.tipo;
        this.maestroCeremonias = origen.maestroCeremonias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        if(equipo>=1 && equipo<=30){
            this.equipo = equipo;
        }
    }

    public TipoEspectaculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoEspectaculo tipo) {
        this.tipo = tipo;
    }

    public boolean isMaestroCeremonias() {
        return maestroCeremonias;
    }

    public void setMaestroCeremonias(boolean maestroCeremonias) {
        this.maestroCeremonias = maestroCeremonias;
    }

    @Override
    protected Object clone(){
        return new Espectaculo(this);
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\nEquipo: "+this.equipo+"\nTipo de Espectáculo: "+tipo+"\nMaestro de Ceremonias: "+maestroCeremonias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Espectaculo)) return false;
        Espectaculo that = (Espectaculo) o;
        return equipo == that.equipo && maestroCeremonias == that.maestroCeremonias && Objects.equals(nombre, that.nombre) && tipo == that.tipo;
    }
}
