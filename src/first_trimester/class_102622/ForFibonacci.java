package class_102622;

import java.util.Scanner;

public class ForFibonacci {
    /*
        Exercise 3: using the for statement, calculate the 10 first Fibonacci number.
    */
    public static void forFibonacci(int amountNumbers, int number1, int number2){
        System.out.println(number1);
        System.out.println(number2);
            for (int i = 0;i<=amountNumbers;i++){
                int result=number1+number2;
                number2=number1;
                number1=result;
                System.out.println(result);
            }
    }
    public static void main(String[] args) {
        forFibonacci(10, 0, 1);
    }
}