package third_trimester.class_051123.Vehiculo;

public class Barco extends Vehiculo{
    private TipoBarco tipoBarco;
    public Barco(TipoBarco tipoBarco, int velocidadActual, int velocidadMax, int antiguedad){
        super(0, velocidadActual, velocidadMax, antiguedad);
        this.tipoBarco=tipoBarco;
    }
    public Barco(Barco origen){
        super(origen);
        this.tipoBarco=origen.tipoBarco;
    }
    @Override
    public String toString() {
        return super.toString()+"\nTipo Barco: "+this.tipoBarco;
    }
}
