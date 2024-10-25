package third_trimester.NavieraV2.Barcos;

public class Mercancia extends Barco {
    public Mercancia(int velocidad){
        super(0, velocidad);
    }
    public Mercancia(Mercancia origen){
        super(origen);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
