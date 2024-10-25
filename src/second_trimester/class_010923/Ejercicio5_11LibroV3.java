package second_trimester.class_010923;

import java.util.Arrays;

public class Ejercicio5_11LibroV3 {
    /*
        Ejercicio 5.11: realiza la función int[] buscarTodos(int t[], int clave), que crea y
        devuelva una tabla con todos los índices de los elemenos donde se encuentra la clave
        de búsqueda. En el caso de que clave no se encuentre en la tabla 6, la función
        devolverá una tabla vacía.
    */
    public static int[] generarNumeros(int nElementos, int rango){
        int[] tabla = new int[nElementos];
        for (int i=0; i<tabla.length; i++){
            tabla[i] = (int)(rango*Math.random());
        }
        System.out.println(Arrays.toString(tabla));
        return tabla;
    }
    public static int[] buscarTodos(int[] t, int clave){
        int[] resultadoBusqueda = new int[0];
        int posicion = 0;
        for (int k=0; k<t.length; k++){
            if (t[k]==clave){
                resultadoBusqueda = Arrays.copyOf(resultadoBusqueda, resultadoBusqueda.length + 1);
                resultadoBusqueda[posicion] = k;
                posicion++;
            }
        }
        return resultadoBusqueda;
    }
    public static void main(String[] args) {
        int[] salida = buscarTodos(generarNumeros(10, 10), 5);
        System.out.println(Arrays.toString(salida));
    }
}
