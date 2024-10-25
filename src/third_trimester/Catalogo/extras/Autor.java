package extras;

import tipoEnum.TipoObra;

import java.time.LocalDate;
import java.util.Arrays;

public class Autor extends Persona {
    private int[] numeroObras = new int[TipoObra.values().length];
    public Autor(String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion){
        super(nombre, fechaNacimiento, fechaDefuncion);
    }
    public Autor(String nombre, LocalDate fechaNacimiento){
        super(nombre, fechaNacimiento);
    }
    public Autor(Autor origen){
        super(origen);
    }

    //.....

    public void setNumeroObras(TipoObra tipoObra, int numero) {
        //Este método no hay que tocar su especifiación
        this.numeroObras[tipoObra.ordinal()]=numero;
    }

    public int getNumeroObras(TipoObra tipoObra){
        //Este método no hay que tocar su especifiación
        return this.numeroObras[tipoObra.ordinal()];
    }

    @Override
    public String toString() {
        return super.toString()+",Numero de Obras: "+ Arrays.toString(this.numeroObras);
    }
}
