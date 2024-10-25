package class_102122;
import java.util.*;
public class GuessNumber {
    /*
    Use a method that calls itself and asks for the user to guess a number that it is
    generated randomly. That random number should be greater than 0 and less than 10.
	The program should ask the user to guess that number until they find
	it and show the hidden random number.
    */
    static int guess = (int)(10*Math.random());
    public static void guessNumber(int guess,Scanner inputNumber){
        System.out.print("Try to guess the random number: ");
        int userNumber = inputNumber.nextInt();
        if(userNumber!=guess){
            System.out.println("Wrong, try again");
            guessNumber(guess,inputNumber);
        }else {
            System.out.println("You are right! The random number was "+guess);
        }
    }
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        guessNumber(guess,inputNumber);
    }
}