package class_102622;

import java.util.Scanner;

public class ForGuessNumber {
    /*
    Exercise 4: given a random number greater than 0 and less than 10, ask the user for 10 tries to guess the number.
    */
    static int guess = (int)(10*Math.random());
    public static void forGuessNumber(int guess,Scanner userInput){
            for (int i=0; i<10; i++){
                System.out.print("Try to guess the random number: ");
                int userNumber = userInput.nextInt();
                if(userNumber!=guess){
                    System.out.println("Wrong, try again");
                }else {
                    System.out.println("You are right! The random number was "+guess);
                    i=10;
                }
            }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        forGuessNumber(guess, userInput);
    }
}
