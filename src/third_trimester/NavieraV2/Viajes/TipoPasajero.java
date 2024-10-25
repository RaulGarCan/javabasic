package third_trimester.NavieraV2.Viajes;
public enum TipoPasajero {
    RESIDENTE(20),
    NORESIDENTE(30);
    private int precioPorDistancia;
    TipoPasajero(int precioPorDistancia){
        this.precioPorDistancia=precioPorDistancia;
    }

    public int getPrecioPorDistancia() {
        return precioPorDistancia;
    }
}
