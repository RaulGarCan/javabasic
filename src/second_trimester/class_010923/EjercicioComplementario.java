package second_trimester.class_010923;

import java.util.Arrays;

public class EjercicioComplementario {
     /*
        Ejercicio complementario: dado un array de números aleatorios con posibles números repetidos,
        comprobar primero si no existen números repetidos y en caso contrario indicar cuales son los repetidos y el número de repeticiones.
     */

    public static int[] numerosRepetidos(int[] arrayRepetidos){
        int[] numeroRepetido = new int[]{};
        int posCounter = 0;
        for (int i=0; i<arrayRepetidos.length; i++){
            for (int j=i+1; j<arrayRepetidos.length; j++){
                if (arrayRepetidos[i]==arrayRepetidos[j]){
                    numeroRepetido = Arrays.copyOf(numeroRepetido, numeroRepetido.length+1);
                    numeroRepetido[posCounter] = arrayRepetidos[i];
                    posCounter++;
                    arrayRepetidos[j]=-1;
                }
            }
        }
        return numeroRepetido;
    }
    public static int[] cantidadRepeticiones(int[] numeroRepetido, int[] arrayRepetidos){
        int[] cantidadRepeticiones = new int[numeroRepetido.length];
        for (int i=0; i<arrayRepetidos.length; i++){
            for (int j=i+1; j<arrayRepetidos.length; j++){
                if (numeroRepetido[i]==arrayRepetidos[j]){
                    cantidadRepeticiones[i]++;
                }
            }
        }
        return cantidadRepeticiones;
    }
    public static void main(String[] args) {
        int[] arrayNumeros = new int [10];
        for (int i=0; i<arrayNumeros.length; i++) {
            arrayNumeros[i] = (int) (5 * Math.random());
        }
        System.out.println(Arrays.toString(arrayNumeros));
        System.out.println(Arrays.toString(numerosRepetidos(arrayNumeros)));
        System.out.println(Arrays.toString(cantidadRepeticiones(numerosRepetidos(arrayNumeros), arrayNumeros)));
    }
}
