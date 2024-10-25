package second_trimester.class_011723;

import java.util.Scanner;

public class Ejercicio6_4 {
     /*
        Actividad 6.4: diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios tiene en blanco.
     */
     public static void main(String[] args) {
         int espacios = 0;
         Scanner userInput = new Scanner(System.in);
         System.out.print("Introduce una frase: ");
         String frase = userInput.nextLine().strip();
         for (int i=0; i<frase.length(); i++){
             if (Character.isSpaceChar(frase.charAt(i))){
                 espacios++;
             }
         }
         System.out.println("La frase tiene un total de: "+espacios);
     }
}
