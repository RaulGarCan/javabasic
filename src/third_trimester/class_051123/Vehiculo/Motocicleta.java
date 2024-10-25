package third_trimester.class_051123.Vehiculo;

public class Motocicleta extends Vehiculo{
    private TipoMoto tipoMoto;
    public Motocicleta(TipoMoto tipoMoto, int nRuedas, int velocidadActual, int velocidadMax, int antiguedad){
        super(nRuedas, velocidadActual, velocidadMax, antiguedad);
        this.tipoMoto=tipoMoto;
    }
    public Motocicleta(Motocicleta origen){
        super(origen);
        this.tipoMoto=origen.tipoMoto;
    }
    @Override
    public String toString() {
        return super.toString()+"\nTipo Moto: "+this.tipoMoto;
    }
}
