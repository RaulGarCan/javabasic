package third_trimester.Naviera;

import java.util.ArrayList;

public class Naviera {
    /*
        naviera tiene barcos

            los barcos hay de 2 tipos: barcos normales (tiene un limite de coches) y fastferries

            los barcos tienen:
                - numero pasajeros
                - velocidad

            los pasajeros tienen:
                - nombre
            y hay 2 tipos: residentes (20*distanciaKM) y no residentes (30*distanciaKM)

            los viajes tienen:
                - distancia
                - pasajeros

        capacidadViajeros en clase barco protegida y mercancia con capacidad 0
     */
    private ArrayList<Barco> barcos;
    private ArrayList<Viaje> viajes;
    public Naviera(){
        barcos=new ArrayList<>();
        viajes=new ArrayList<>();
    }
    public int gananciaTotal(){
        int gananciaTotal=0;
        for(int i=0; i<this.viajes.size(); i++){
            gananciaTotal += this.viajes.get(i).getGanancia();
        }
        return gananciaTotal;
    }
    public void crearViaje(Viaje viaje){
        viajes.add(viaje);
    }
    public void crearBarco(Barco barco){
        barcos.add(barco);
    }
}
