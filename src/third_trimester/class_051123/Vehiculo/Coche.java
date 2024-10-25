package third_trimester.class_051123.Vehiculo;

public class Coche extends Vehiculo{
    private TipoCoche tipoCoche;
    public Coche(TipoCoche tipoCoche, int nRuedas,int velocidadActual, int velocidadMax, int antiguedad){
        super(nRuedas, velocidadActual, velocidadMax, antiguedad);
        this.tipoCoche=tipoCoche;
    }
    public Coche(Coche origen){
        super(origen);
        this.tipoCoche=origen.tipoCoche;
    }
    @Override
    public String toString() {
        return super.toString()+"\nTipo Coche: "+this.tipoCoche;
    }
}
