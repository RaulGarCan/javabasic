package class_110322;

import java.util.Scanner;

public class ForExercise12 {
     /*
        Prompt the user to guess a random number between 1 and 20 for ten times.
        If the user finds the random number before the loops get to ten, break the iterations.
     */
     public static void main(String[] args) {
         int number = (int)(20*Math.random());
         Scanner userInput = new Scanner(System.in);
         for (int i = 1; i<=10; i++) {
             if (i < 10) {
                 System.out.print("Introduce your number: ");
                 int guessNumber = userInput.nextInt();
                 if (guessNumber == number) {
                     i = 10;
                     System.out.println("Correct! The random number was: " + number);
                 }
             } else {
                 System.out.println("Sorry, you run out of tries");
             }
         }
     }
}
