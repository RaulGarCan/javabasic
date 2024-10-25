package third_trimester.Naviera;

import java.util.ArrayList;

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
    public int getGanancia(){
        int ganancia = 0;
        for(int i=0; i<this.pasajeros.size(); i++){
            ganancia+=this.pasajeros.get(i).getTipoPasajero().getPrecioPorDistancia()*this.distancia;
        }
        return ganancia;
    }
    public void addPasajero(Pasajero pasajero){
        pasajeros.add(pasajero);
    }
    public void addArrayPasajeros(Pasajero[] pasajeros){
        for(int i=0; i<pasajeros.length; i++){
            this.pasajeros.add(pasajeros[i]);
        }
    }
}
