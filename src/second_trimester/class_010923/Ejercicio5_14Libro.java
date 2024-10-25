package second_trimester.class_010923;

import second_trimester.class_121622.ArrayAlumnos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5_14Libro {
     /*
        Ejercicio 5.14: el ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas
        estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás que preguntar
        el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.
        Una vez terminada la entrada de datos, muestra la siguiente información:
            - Todos los sueldos introducidos ordenados de forma decreciente.
            - El sueldo máximo y mínimo.
            - La media de los sueldos.
     */
     public static void ordenar(int[] sueldos){
          Arrays.sort(sueldos);
          System.out.println(Arrays.toString(sueldos));
     }
     public static int sueldoMaximo(int[] sueldos){
          int max = 0;
          for (int j=0; j<sueldos.length; j++){
               if (j==0){
                    max=sueldos[0];
               }
               if (max<sueldos[j]){
                    max=sueldos[j];
               }
          }
          return max;
     }
     public static int sueldoMinimo(int[] sueldos){
          int min = 0;
          for (int j=0; j<sueldos.length; j++){
               if (j==0){
                    min=sueldos[0];
               }
               if (min>sueldos[j]){
                    min=sueldos[j];
               }
          }
          return min;
     }
     public static int media(int[] sueldos){
          int media = 0;
          for (int i=0; i<sueldos.length; i++){
               media+=sueldos[i];
          }
          media/=sueldos.length;
          return media;
     }
     public static void main(String[] args) {
          Scanner userInput = new Scanner(System.in);
          int[] listaSueldos = new int[]{};
          int sueldo;
          int contadorPosiciones = 0;
          int exitKey = -1;
          do {
               System.out.print("Introduce un sueldo: ");
               while (!userInput.hasNextInt()){
                    System.out.println("Introduce un sueldo válido no decimal");
                    System.out.print("Introduce un sueldo: ");
                    userInput.nextLine();
               }
               sueldo = userInput.nextInt();
               if (sueldo==exitKey){
                    break;
               }
               listaSueldos = Arrays.copyOf(listaSueldos, listaSueldos.length+1);
               listaSueldos[contadorPosiciones] = sueldo;
               contadorPosiciones++;
          }while (true);
          if (contadorPosiciones!=0){
               System.out.print("La siguiente tabla muestra el orden de los sueldos de menor a mayor: ");
               ordenar(listaSueldos);
               System.out.println("El sueldo máximo es: "+sueldoMaximo(listaSueldos));
               System.out.println("El suelod mínimo es: "+sueldoMinimo(listaSueldos));
               System.out.println("La media de los sueldos es: "+media(listaSueldos));
          }
     }
}
