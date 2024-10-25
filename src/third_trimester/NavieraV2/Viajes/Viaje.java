package third_trimester.NavieraV2.Viajes;

import third_trimester.NavieraV2.Barcos.Barco;

import java.util.ArrayList;
import java.util.Objects;

public class Viaje {
    private int distancia;
    private ArrayList<Pasajero> pasajeros;
    private Barco barco;
    public Viaje(int distancia, Barco barco){
        this.distancia=distancia;
        this.barco=barco;
        pasajeros=new ArrayList<>();
    }
    public Viaje(int distancia, Barco barco, Pasajero[] pasajeros){
        this.distancia=distancia;
        this.barco=barco;
        this.pasajeros=new ArrayList<>();
        this.addArrayPasajeros(pasajeros);
    }
    public Viaje(Viaje origen){
        this.distancia=origen.distancia;
        this.pasajeros=origen.copiaPasajeros();
        this.barco=new Barco(origen.barco);
    }
    public ArrayList<Pasajero> copiaPasajeros(){
        ArrayList<Pasajero> copiaPasajeros = new ArrayList<>();
        for(Pasajero p : this.pasajeros){
            copiaPasajeros.add(new Pasajero(p));
        }
        return copiaPasajeros;
    }
    /*
    public int getGanancia(){
        int ganancia = 0;
        for(Pasajero p : this.pasajeros){
            ganancia+=p.getTipoPasajero().getPrecioPorDistancia()*this.distancia;
        }
        return ganancia;
    }
     */
    public int getGanancia(){
        return getGananciaPorTipoPasajero(TipoPasajero.RESIDENTE)+getGananciaPorTipoPasajero(TipoPasajero.NORESIDENTE);
    }
    public int getGananciaPorTipoPasajero(TipoPasajero tipoPasajero){
        int gananciaTipoPasajero = 0;
        for(Pasajero p : this.pasajeros){
            if(p.getTipoPasajero()==tipoPasajero){
                gananciaTipoPasajero+=p.getTipoPasajero().getPrecioPorDistancia()*this.distancia;
            }
        }
        return gananciaTipoPasajero;
    }
    public void addPasajero(Pasajero pasajero){
        pasajeros.add(pasajero);
    }
    public void addArrayPasajeros(Pasajero[] pasajeros){
        for(int i=0; i<pasajeros.length; i++){
            this.pasajeros.add(new Pasajero(pasajeros[i]));
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Viaje)) return false;
        Viaje viaje = (Viaje) o;
        /*          No hace falta, era una prueba
        int cont = 0;
        for(Pasajero p : this.pasajeros){
            if(!(viaje.pasajeros.get(cont).equals(p))){
                return false;
            }
            cont++;
        }
         */
        return distancia == viaje.distancia && Objects.equals(pasajeros, viaje.pasajeros) && Objects.equals(barco, viaje.barco);
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }
}
