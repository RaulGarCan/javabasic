package class_102622;

import java.util.Scanner;

public class ForFactorial {
    /*
        Exercise 2: using the for statement, calculate the factorial of any number greater than 2 and less than 20.
     */
    public static void forFactorial(int factorial){
            int facMulti = 1;
            for (int i = 1; i <= factorial; i++) {
                facMulti *= i;
            }
            System.out.println("The factorial of " + factorial + " is: " + facMulti);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the number you want the factorial: ");
        int factorialNumber = userInput.nextInt();

        if ((factorialNumber>2)&&(factorialNumber<20)) {
            forFactorial(factorialNumber);
        } else {
            System.out.println("Your number is out of range!");
        }
    }
}
