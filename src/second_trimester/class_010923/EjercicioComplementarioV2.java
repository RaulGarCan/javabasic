package second_trimester.class_010923;

import java.util.Arrays;

public class EjercicioComplementarioV2 {
     /*
        Modificación del ejercicio complementario: dado un array de
        números aleatorios con posibles números repetidos, crear un método que devuelva el mismos array pero sin los números que se repiten.
     */
    public static boolean[] recopilarRepeticiones(int[] arrayRepetidos){
        boolean[] listaRepeticiones = new boolean [arrayRepetidos.length];
        for (int j=0; j<arrayRepetidos.length; j++){
            for (int k=j+1; k<arrayRepetidos.length; k++){
                if ((arrayRepetidos[j]==arrayRepetidos[k]) && (!listaRepeticiones[k])){
                    listaRepeticiones[k] = true;
                }
            }
        }
        return listaRepeticiones;
    }
    public static int[] quitarRepeticiones(int[] arrayRepetidos, boolean[] listaRepetidos){
        int[] arraySinRepetidos = new int[]{};
        int posCounter = 0;
        for (int i=0; i<arrayRepetidos.length; i++){
            if (!listaRepetidos[i]){
                arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, arraySinRepetidos.length+1);
                arraySinRepetidos[posCounter] = arrayRepetidos[i];
                posCounter++;
            }
        }
        return arraySinRepetidos;
    }
    public static void main(String[] args) {
        int[] arrayNumeros = new int [10];
        for (int i=0; i<arrayNumeros.length; i++) {
            arrayNumeros[i] = (int) (5 * Math.random());
        }
        System.out.println(Arrays.toString(arrayNumeros));
        System.out.println(Arrays.toString(recopilarRepeticiones(arrayNumeros)));
        System.out.println(Arrays.toString(quitarRepeticiones(arrayNumeros, recopilarRepeticiones(arrayNumeros))));
    }
}
