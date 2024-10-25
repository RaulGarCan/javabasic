package second_trimester.class_121922;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoArrays1 {
     /*
        Escribir una función int[] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud especificada,
        que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta fin(inclusive).
     */
    public static int[] rellenaPares(int longitud, int fin){
        int[] paresAleatorios = new int[longitud];

        int counter = 0;
        while (counter<paresAleatorios.length){
            int random = (int)(fin*Math.random());
            if (random%2==0 && random>=2){
                paresAleatorios[counter] = random;
                counter++;
            }
        }
        Arrays.sort(paresAleatorios);
        return paresAleatorios;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce la longitud del Array: ");
        int size = userInput.nextInt();
        System.out.print("Introduce el final del rango: ");
        int finRango = userInput.nextInt();

        for (int i=0; i<rellenaPares(size, finRango).length; i++){
            System.out.println(rellenaPares(size, finRango)[i]);
        }
    }
}
