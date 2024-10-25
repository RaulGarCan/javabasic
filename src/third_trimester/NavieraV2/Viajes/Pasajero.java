package third_trimester.NavieraV2.Viajes;

import java.util.Objects;

public class Pasajero {
    private String nombre;
    private TipoPasajero tipoPasajero;
    public Pasajero(String nombre, TipoPasajero tipoPasajero){
        this.nombre=nombre;
        this.tipoPasajero=tipoPasajero;
    }
    public Pasajero(Pasajero origen){
        this.nombre=origen.nombre;
        this.tipoPasajero=origen.tipoPasajero;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pasajero)) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(nombre, pasajero.nombre) && tipoPasajero == pasajero.tipoPasajero;
    }
}
