package class_100522;

import java.util.Scanner;

public class ExerciseEight {
    /*
    Write a java program that compute the sum
    of the digits of an int random number less
    than 100.
    For example: 99 the output should be 18.
    */
    public static int digitSum(int number1){
        int digit1 = number1/10;
        int digit2 = number1%10;
        int digitSum = digit1+digit2;
        return digitSum;
    }
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your number: ");
        int number1 = userInput.nextInt();

        System.out.println(number1);

        System.out.println(digitSum(number1));

    }
}
