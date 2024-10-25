package exam_112122;

import java.util.Scanner;

/******************************************************************************************
    (3 points) Ask the user to insert positive binary numbers (a number less than
    1111111111, the number should be treated as an int when the insertion) until
    the user types in "exit" when the program should exit.
    For every binary number insertion the program should print the convertion of the
    binary number into a decimal number. For example: 111 should print: 1*4+1*2+1*1
    On every insertion the program should check if the number is out of the range or
    the value entered is a String different than "exit", on these cases the program
    should ask recursively for a valid user input until the user types in a valid
    number:
    - If the user enters a number out of the range the program should print: "Number is
    not within the range, please try again."
    - If the user enters a String different of "exit" the program should print: "You
    have typed in an String, please try again."
    If the user types in "exit" without entering any number, the program should print the
    following text: "See you next time."

    NOTE: static global variables should only be accessed within the methods but main().
 *****************************************************************************************/
public class BinarioDecimal {
    public static boolean checkInput(int input){
        int max = 1111111111;
        int min = 0;
        if (input < max && input > min){
            return true;
        } else {
            System.out.println("Number is not withing the range, please try again");
            return false;
        }
    }
    public static int binaryToDecimal(int binary){
        int decimal = 1;
        int digits = 0;
        while(binary>=1){
            binary /= 10;
            digits++;
        }
        System.out.println(digits);
        int valuedigit = 1;
        int total = 0;
        while (digits>1){
            for (int i = digits;i>0;i--){
                valuedigit *= 2*2*2;
            }
            System.out.println(valuedigit);
            digits--;
        }
        decimal += total;
        return decimal;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = -1;
        String keyword = "exit";
        System.out.println("Program Loaded, press return to start or type 'exit' to finish the execution");
        while(!userInput.nextLine().equals(keyword)) {
            do {
                System.out.print("Introduce a binary number: ");
                    while (!userInput.hasNextInt()) {
                        System.out.println("Error, the input is not an int");
                        System.out.print("Introduce a binary number: ");
                        userInput.nextLine();
                    }
                input = userInput.nextInt();
            } while (!checkInput(input));
            System.out.println(binaryToDecimal(input));
        }
    }
}
