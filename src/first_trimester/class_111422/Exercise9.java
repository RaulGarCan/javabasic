package class_111422;

import java.util.Scanner;

public class Exercise9 {
    /*
        Write a program that prompts the user to input a positive integer within the range (1,20).
        It should then print the multiplication table of that number.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your positive number: ");
        int inputNumber = userInput.nextInt();
        if ((inputNumber>=1)&&(inputNumber<=20)){
            int counter = 0;
            while (counter<=inputNumber){
                int result = inputNumber * counter;
                System.out.println(result);
                counter++;
            }
        } else {
            System.out.println("Error, introduce an integer number within the range (1,20)");
        }
    }
}
