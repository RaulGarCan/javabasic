package second_trimester.class_010923;

import java.util.Arrays;

public class Ejercicio5_13Libro {
     /*
        Ejercicio 5.13: modifica la actividad 5.12 para que la función no modifique la
        tabla que se pasa como parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han desordenado los valores de los elementos.
     */

    public static void desordenar(int[] t){
        int[] resultado = Arrays.copyOf(t, t.length);
        for (int i=0; i<10; i++){
            int random2 = (int)(10*Math.random());
            int temp = resultado[i];
            resultado[i] = resultado[random2];
            resultado[random2] = temp;
        }
        System.out.println(Arrays.toString(resultado));
    }
    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(tabla));
        desordenar(tabla);
    }
}
