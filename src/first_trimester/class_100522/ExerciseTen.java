package class_100522;

import java.util.Scanner;

public class ExerciseTen {
    /*
    Write a java program that given a random int
    number n less than 10, compute the value of
    n+nn+nnn
    */
    public static void valueCompute(int number1){
        if((number1<10)&&(number1>0)) {
            System.out.println("n number is "+number1);
            final int NN = 11;
            final int NNN = 111;
            int result = number1 + number1 * NN + number1 * NNN;

            System.out.println(result);
        }else {
            System.out.println("Fatal error, your number is greater than 9 or less than 1");
        }
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your int number: ");
        int number1 = userInput.nextInt();

        valueCompute(number1);
    }
}
