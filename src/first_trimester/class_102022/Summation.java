package class_102022;

import java.util.Scanner;

public class Summation {
    /*
    calculate the summation or a random number greater than 1 and less than 100 using
    a method that calls itself. For example the summation of the number
    10 is 10+9+8+7+6+5+4+3+2+1 equals to 55. Calculate the summation
    of the number using a method that calls itself recursively.
     */
    //static int result=0;
    public static void factorial(int number, int result) {
        if (number != 0) {
            result = result + number;
            System.out.println(result);
            factorial(number - 1, result);
        }
    }
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = inputNumber.nextInt();

        factorial(number, 0);
    }
}