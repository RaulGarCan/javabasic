package second_trimester.class_121922;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoArrays3 {
     /*
        Definir una función que tome como parámetros dos tablas, la primera con los 6 números de una apuesta de la primitiva (estos 6 números serán generados aleatoriamente
        dentro del rango de los números de la primitiva),
        y la segunda ordenada con los 6 números de la combinación ganadora (también generados los números como en el caso anterior).
        La función devolverá el número de aciertos.
     */
     public static int numeroAciertos(int[] ganador, int[] intentoGanador){
        int aciertos = 0;
        for (int j=0; j<ganador.length; j++){
            if (ganador[j] == intentoGanador[j]){
                aciertos++;
            }
        }
        return aciertos;
     }
     public static void main(String[] args) {
         Scanner userInput = new Scanner(System.in);
         System.out.print("Introduce el rango de valores: ");
         int rango = userInput.nextInt();
         int longitud = 6;
         int[] boletoGanador = new int[longitud];
         int[] boleto = new int[longitud];
         for (int i=0; i<longitud;i++){
             boletoGanador[i] = (int)(rango*Math.random());
             boleto[i] = (int)(rango*Math.random());
         }

         System.out.println(Arrays.toString(boleto));
         System.out.println(Arrays.toString(boletoGanador));
         System.out.println("El numero de aciertos totales es: "+numeroAciertos(boletoGanador, boleto)+"/"+longitud);
     }
}
