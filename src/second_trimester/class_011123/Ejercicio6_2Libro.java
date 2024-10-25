package second_trimester.class_011123;

import java.util.Scanner;

public class Ejercicio6_2Libro {
     /*
        Actividad 6.2: introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que contiene menos caracteres.
     */
     public static void main(String[] args) {
         Scanner userInput = new Scanner(System.in);
         System.out.print("Introduzca la primera frase: ");
         String frase1 = userInput.nextLine().strip();
         System.out.print("Introduzca la segunda frase: ");
         String frase2 = userInput.nextLine().strip();
         if (frase1.length()<frase2.length()){
             System.out.println("La primera frase es la más corta");
         } else if (frase2.length()<frase1.length()){
             System.out.println("La segunda frase es la más corta");
         } else {
             System.out.println("Las dos frases tienen la misma longitud");
         }
     }
}
