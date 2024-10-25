package second_trimester.class_020123;

import java.util.Scanner;

public class SintonizadorFM {
    /*
        Actividad 7.8: definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente, se desea dotar al controlador de una interfaz que
        permita subir (up) o bajar (down) la frecuencia (en saltos de 0,5MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
        Supondremos que el rango de frecuencias para manejar oscila entre los 80MHz y los 108MHz y que, al inicio, el controlador sintonice
        la frecuencia indicada en el constructor o 80MHz por defecto. Si durante una operación de subida o
        bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario. Escribir un
        pequeño programa principal para probar su funcionamiento.
     */
    static double maxFrecuencia = 108d;
    static double minFrecuencia = 80d;
    static double saltoFrecuencia = 0.5d;
    private double frecuencia;
    SintonizadorFM(double frecuencia){
        this.frecuencia = frecuencia;
    }
    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }
    public void aumentarFrecuencia(){
        if (this.frecuencia + saltoFrecuencia > maxFrecuencia) {
            setFrecuencia(minFrecuencia);
        } else {
            this.frecuencia += saltoFrecuencia;
        }
    }
    public void disminuirFrecuencia(){
        if (this.frecuencia - saltoFrecuencia < minFrecuencia) {
            setFrecuencia(maxFrecuencia);
        } else {
            this.frecuencia -= saltoFrecuencia;
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int opcion;
        boolean ejecucion = true;
        SintonizadorFM sintonizador = new SintonizadorFM((minFrecuencia+maxFrecuencia)/2);
        do {
            System.out.println("1.- Aumentar la frecuencia");
            System.out.println("2.- Reducir la frecuencia");
            System.out.println("3.- Mostrar frecuencia actual");
            System.out.print("Introduce la opción deseada: ");
            opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Aumentar frecuencia
                    sintonizador.aumentarFrecuencia();
                    break;
                case 2: // Reducir frecuencia
                    sintonizador.disminuirFrecuencia();
                    break;
                case 3: // Mostrar frecuencia
                    System.out.println("La frecuencia actual del sintonizador es: "+sintonizador.getFrecuencia());
                    break;
                default:
                    ejecucion = false;
                    System.out.println("Cerrando el programa...");
                    break;
            }
        }while (ejecucion);
    }
}
