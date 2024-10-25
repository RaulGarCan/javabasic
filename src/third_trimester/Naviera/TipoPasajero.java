package third_trimester.Naviera;

import third_trimester.Biblioteca.TipoPersona;

public enum TipoPasajero {
    RESIDENTE(20),
    NORESIDENTE(30);
    int precioPorDistancia;
    TipoPasajero(int precioPorDistancia){
        this.precioPorDistancia=precioPorDistancia;
    }

    public int getPrecioPorDistancia() {
        return precioPorDistancia;
    }
}
