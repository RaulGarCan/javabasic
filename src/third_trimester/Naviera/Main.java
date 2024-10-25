package third_trimester.Naviera;

public class Main {
    public static void main(String[] args) {
        Naviera naviera = new Naviera();

        Barco barco1 = new BarcoNormal(10, 20, 50);
        Barco barco2 = new FastFerry(15, 30);
        Barco barco3 = new Mercancia(60);

        Pasajero residente = new Pasajero("residente",TipoPasajero.RESIDENTE);
        Pasajero noresidente = new Pasajero("noresidente",TipoPasajero.NORESIDENTE);
        Pasajero[] pasajeros = new Pasajero[]{residente, noresidente, residente, noresidente};

        Viaje viaje1 = new Viaje(40, barco1);
        Viaje viaje2 = new Viaje(50, barco2);
        Viaje viaje3 = new Viaje(60, barco3, pasajeros);

        viaje1.addArrayPasajeros(pasajeros);
        viaje1.addPasajero(residente);
        viaje2.addArrayPasajeros(pasajeros);
        viaje2.addPasajero(noresidente);
        viaje3.addPasajero(residente);

        System.out.println(viaje1.getGanancia());
        System.out.println(viaje2.getGanancia());
        System.out.println(viaje3.getGanancia());

        naviera.crearViaje(viaje1);
        naviera.crearViaje(viaje2);
        naviera.crearViaje(viaje3);

        naviera.crearBarco(barco1);
        naviera.crearBarco(barco2);
        naviera.crearBarco(barco3);

        naviera.gananciaTotal();
    }
}
