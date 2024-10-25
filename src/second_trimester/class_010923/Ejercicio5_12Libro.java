package second_trimester.class_010923;

import java.util.Arrays;

public class Ejercicio5_12Libro {
     /*
        Ejercicio 5.12: escribe la función void desordenar(int[] t), que cambia de forma aleatoria los elementos
        contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.
     */
    public static void desordenar(int[] t){
        for (int i=0; i<10; i++){
            int random2 = (int)(10*Math.random());
            int temp = t[i];
            t[i] = t[random2];
            t[random2] = temp;
        }
        System.out.println(Arrays.toString(t));
    }
    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(tabla));
        desordenar(tabla);
    }
}
