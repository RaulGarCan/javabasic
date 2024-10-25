package class_110322;

import java.util.Scanner;

public class ForExercise11 {
    /*
       Write a program to display the multiplication table of a given number less than 10.
    */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your number: ");
        int inputNumber = userInput.nextInt();
        if ((inputNumber < 10 && inputNumber > 0)) {
            for (int i = 0; i <= inputNumber; i++) {
                int result = inputNumber * i;
                System.out.println(result);
            }
        } else {
            System.out.println("Error, introduce an integer number within the range (1,9)");
        }
    }
}
