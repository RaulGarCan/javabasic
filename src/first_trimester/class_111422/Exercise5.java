package class_111422;

import java.util.Scanner;

public class Exercise5 {
    /*
        Write a program to display the multiplication table of a given number less than 10.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your number: ");
        int inputNumber = userInput.nextInt();
        if ((inputNumber < 10 && inputNumber > 0)) {
            int counter = 0;
            while (counter<=inputNumber) {
                int result = inputNumber * counter;
                System.out.println(inputNumber+" x "+counter+" = "+result);
                counter++;
            }
        } else {
            System.out.println("Error, introduce an integer number within the range (1,9)");
        }
    }
}
