package class_110322;

import java.util.Scanner;

public class ForExercise10 {
    /*
        Write a program to find Fibonacci series of a given number greater than 5 and less than 50.
    */
    static int result = 0;
    static int number0 = 0;
    static int number1 = 1;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your number: ");
        int number = userInput.nextInt();
        if (number>=5 && number<=50) {
            System.out.println(number0);
            System.out.println(number1);
            for (int i = 2; i <= number; i++) {
                result=+number0+number1;
                number0 = number1;
                number1 = result;
                System.out.println(result);
            }
        }
    }
}
