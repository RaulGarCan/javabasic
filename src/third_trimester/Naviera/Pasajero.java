package third_trimester.Naviera;

public class Pasajero {
    private String nombre;
    private TipoPasajero tipoPasajero;
    public Pasajero(String nombre, TipoPasajero tipoPasajero){
        this.nombre=nombre;
        this.tipoPasajero=tipoPasajero;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }
}
