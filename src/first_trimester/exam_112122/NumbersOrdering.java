package exam_112122;

import java.util.Scanner;

/******************************************************************************************
    (3 points) Ask the user to insert positive numbers within the range of the int numbers
    (a number less than 2147483647) one by one until the user types in "exit".
    After every insertion of a number, the program should print the maximun and minimum
    number until that insertion. (On the first insertion the maximun and minimun should
    be the same).
    On every insertion the program should check if the number is out of the range, the
    number is not a floating-point number or the value entered is a String different than
    "exit", on these cases the program should ask recursively for a valid user input until
    the user types in a valid number:
        - If the user enters a number out of the range the program should print: "Number is
            not within the range, please try again."
        - If the user enters a floating-point number the program should print: "Number
            should be a int not a floating-point number, please try again."
        - If the user enters a String different of "exit" the program should print: "You
            have typed in an String, please try again."
    If the user types in "exit" without entering any number, the program should print the
    initial values of the variables that hold the smallest and greatest number.
    NOTE: the program should have the following methods:
    1.- printNumbers(): it is a void and non parameters method that should print the
        smallest and greatest number on a line each.
    2.- checkInput(): it is a boolean and an int parameter method that check if the number
        is within range.
    3.- calculateMaximumAndMinimum(): a void and an int paramater method that calculates
        the smallest and greatest of the numbers that the user is typing in.
    NOTE: static global variables should only be accessed within the methods but main().
    NOTE: the exercise should be done with while or do-while statements for recursion.
 *****************************************************************************************/
public class NumbersOrdering {
    static int counter = 1;
    static int min = 0;
    static int max = 0;
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
    public static void printNumbers(){
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);
    }
    public static void calculateMaximumAndMinimum(int input){
            if (counter==1){
                min = input;
                max = input;
            }
            if (counter>1){
                if (input>max){
                    max = input;
                }
                if (input<min){
                    min = input;
                }
            }
        counter++;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = 0;
        System.out.println("Program Loaded, press return to start or type 'exit' to finish the execution");
        String keyword = "exit";
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
            calculateMaximumAndMinimum(input);
            printNumbers();
        }
    }
}
