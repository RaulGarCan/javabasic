package class_102022;

import java.util.Scanner;

public class Factorial {
    /*
    Factorial.java: the factorial of a number n is: n*(n-1)*(n-1)*.....*1.
    For example, given the number 5 its factorial is 5*4*3*2*1 equals to 120.
    Calculate the factorial of a number greater than 1 and less
    than 20 using a method that calls itself recursively.
     */
    //static int result=1;
    public static void factorial(int number, int result) {
        if (number != 1) {
            result = result * number;
            System.out.println(result);
            factorial(number - 1, result);
        }
    }
        public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = inputNumber.nextInt();

        factorial(number, 1);
    }
}