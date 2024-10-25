package exam_112122;

import java.util.Scanner;

/******************************************************************************************
    (2 points) Ask the user to insert positive numbers within the range of the int numbers
    (a number less than 2147483647) until the user types in "exit" when the program should
    exit.
    For every number insertion the program should print the addition of all the numbers
    digits (for example for the number 123456 the program should print 21).
    On every insertion the program should check if the number is out of the range or the
    value entered is a String different than "exit", on these cases the program should ask
    recursively for a valid user input until the user types in a valid number:
        - If the user enters a number out of the range the program should print: "Number is
        not within the range, please try again."
        - If the user enters a String different of "exit" the program should print: "You
        have typed in an String, please try again."
    If the user types in "exit" without entering any number, the program should print the
    following text: "See you next time."
    NOTE: the program should have the following methods:
    1.- calculateAddition(): it is a void and an int parameters method that should calculate
    the addition of all the digits of the number.

 NOTE: static global variables should only be accessed within the methods but main().
 NOTE: the exercise should be done with while or do-while statements for recursion.
 *****************************************************************************************/
public class SumDigits {
    public static boolean checkInput(int input){
        int max = 2147483647;
        int min = 0;
        if (input < max && input > min){
            return true;
        } else {
            System.out.println("Number is not withing the range, please try again");
            return false;
        }
    }
    public static int sumDigits(int number){
        int result = 0;
        int divisor = 10;
            while (number % divisor > 0) {
                result += number % divisor;
                number /= 10;
            }
    return result;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = -1;
        String keyword = "exit";
        System.out.println("Program Loaded, press return to start or type 'exit' to finish the execution");
        while(!userInput.nextLine().equals(keyword)) {
            do {
                System.out.print("Introduce a number: ");
                while (!userInput.hasNextInt()) {
                    if (userInput.hasNextFloat()) {
                        System.out.println("Error, the input is a float number");
                        System.out.print("Introduce a number: ");
                        userInput.nextLine();
                    } else {
                        System.out.println("Error, the input is a String");
                        System.out.print("Introduce a number: ");
                        userInput.nextLine();
                    }
                }
                input = userInput.nextInt();
            } while (!checkInput(input));
            System.out.println("The sum of the digits is: "+sumDigits(input));
        }
    }
}
