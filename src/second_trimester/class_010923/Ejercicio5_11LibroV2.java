package second_trimester.class_010923;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio5_11LibroV2 {
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
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));
        return tabla;
    }
    public static int[] buscarTodos(int[] t, int clave){
        int sizeResult = 0;
        for (int j=0 ; j<t.length; j++){
            if (t[j]==clave){
                sizeResult++;
            }
        }
        int[] resultadoBusqueda = new int[sizeResult];
        int posicion = 0;
        int inicioRango = 0;
        while (sizeResult>0){
            resultadoBusqueda[posicion] = Arrays.binarySearch(t , inicioRango, t.length-1, clave);
            System.out.println(Arrays.binarySearch(t , inicioRango, t.length-1, clave));
            inicioRango = resultadoBusqueda[posicion]+1;
            posicion++;
            if (resultadoBusqueda.length==posicion+1){
                break;
            }
        }
        System.out.println(Arrays.toString(resultadoBusqueda));
        return resultadoBusqueda;
    }
    public static void main(String[] args) {
        int[] salida = buscarTodos(generarNumeros(10, 10), 5);
        System.out.println(Arrays.toString(salida));
    }
}
