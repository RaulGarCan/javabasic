package second_trimester.class_020123;

import java.util.Arrays;
import java.util.Scanner;

public class Bombilla {
    /*
        Actividad 7.9: modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente.
        Para ello, hacer una clase Bombilla con una variable privada que indique si está encendida o apagada, así como un método que nos diga el estado de
        una bombilla concreta. Además, queremos poner un interruptor general, de forma que si este apagada, todas las bombillas queden apagada. Cuando el interruptor
        general se activa, las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes.
        Cada bombilla se enciende y se apaga individualmente, pero solo responde que está encendida si su interruptor particular está activado y además hay luz general
     */
    private static boolean interruptorGeneral = true;
    private boolean estaEncendida;
    public Bombilla(boolean estaEncendida){
        this.estaEncendida = estaEncendida;
    }
    public static boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }
    public static void setInterruptorGeneral(boolean interruptorGeneral) {
        Bombilla.interruptorGeneral = interruptorGeneral;
    }
    public boolean isEstaEncendida() {
        return estaEncendida;
    }
    public void setEstaEncendida(boolean estaEncendida) {
        this.estaEncendida = estaEncendida;
    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "estaEncendida=" + estaEncendida +
                '}';
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean ejecucion = true;
        int contador = 0;
        int opcion = 0;
        Bombilla[] arrayBombillas = new Bombilla[]{};
        do {
            System.out.println("\nOpción 1: Crear bombilla");
            System.out.println("Opción 2: Interruptor general");
            System.out.println("Opción 3: Mostrar información");
            System.out.print("Selecciona la opción: ");
            opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Creacion de bombillas
                    String bombillaUsuario;
                    do {
                        boolean estadoBombilla = true;
                        System.out.print("¿Como está la bombilla? ");
                        bombillaUsuario = userInput.next().strip();
                        if (bombillaUsuario.equalsIgnoreCase("salir")){
                            System.out.println("Cerrando el programa...");
                            break;
                        }
                        if (bombillaUsuario.equalsIgnoreCase("apagada")){
                            estadoBombilla = false;
                        }
                        Bombilla bombilla = new Bombilla(estadoBombilla);
                        arrayBombillas = Arrays.copyOf(arrayBombillas, arrayBombillas.length+1);
                        arrayBombillas[contador] = bombilla;
                        contador++;
                    }while (true);
                    break;
                case 2: // Alternar interruptor general
                    interruptorGeneral = !interruptorGeneral;
                    System.out.println("\nApagando interruptor general...");
                    break;
                case 3: // Mostrar informacion
                    if (interruptorGeneral){
                        System.out.println("\nEl interruptor general está encendido.");
                        for (int i=0; i<arrayBombillas.length; i++){
                            System.out.println(arrayBombillas[i].toString());
                        }
                    } else {
                        System.out.println("\nTodas las bombillas están apagadas");
                    }
                    break;
                default:
                    System.out.println("\nCerrando el programa...");
                    ejecucion = false;
                    break;
            }

        }while (ejecucion);
    }
}
