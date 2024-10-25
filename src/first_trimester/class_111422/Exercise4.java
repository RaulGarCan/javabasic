package class_111422;

import java.util.Scanner;

public class Exercise4 {
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

        while(number<=5 || number>=50){
            System.out.println("Number out of the range");
            System.out.print("Introduce your number: ");
            number = userInput.nextInt();
        }

        System.out.print(number0+" ");
        System.out.print(number1+" ");
        int counter = 1;
        while (counter<=number) {
            result=number0+number1;
            number0 = number1;
            number1 = result;
            System.out.print(result+" ");
            counter++;
        }
    }
}
