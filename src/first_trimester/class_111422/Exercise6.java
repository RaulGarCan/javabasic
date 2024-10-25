package class_111422;

import java.util.Scanner;

public class Exercise6 {
    /*
        Prompt the user to guess a random number between 1 and 20 for ten times.
        If the user finds the random number before the loops get to ten, break the iterations.
     */
    public static void main(String[] args) {
        int number = (int)(20*Math.random());
        Scanner userInput = new Scanner(System.in);
        int counter = 0;
        while (counter<=10) {
            if (counter < 10) {
                System.out.print("Introduce your number: ");
                int guessNumber = userInput.nextInt();
                if (guessNumber == number) {
                    counter = 10;
                    System.out.println("Correct! The random number was: " + number);
                }
            } else {
                System.out.println("Sorry, you run out of tries");
            }
            counter++;
        }
    }
}
