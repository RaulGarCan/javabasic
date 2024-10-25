package third_trimester.NavieraV2.Barcos;
public class BarcoNormal extends Barco {
    private int limiteCoches;
    public BarcoNormal(int capacidad, int velocidad,int limiteCoches){
        super(capacidad, velocidad);
        this.limiteCoches=limiteCoches;
    }
    public BarcoNormal(BarcoNormal origen){
        super(origen);
        this.limiteCoches=origen.limiteCoches;
    }

    @Override
    public int getCapacidad() {
        return super.getCapacidad();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BarcoNormal)) return false;
        if (!super.equals(o)) return false;
        BarcoNormal that = (BarcoNormal) o;
        return limiteCoches == that.limiteCoches;
    }
}
