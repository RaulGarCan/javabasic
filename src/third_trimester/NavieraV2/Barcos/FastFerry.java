package third_trimester.NavieraV2.Barcos;

public class FastFerry extends Barco{
    public FastFerry(int capacidad, int velocidad){
        super(capacidad, velocidad);
    }
    public FastFerry(FastFerry origen){
        super(origen);
    }

    @Override
    public int getCapacidad() {
        return super.getCapacidad();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
