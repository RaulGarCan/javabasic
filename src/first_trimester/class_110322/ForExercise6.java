package class_110322;

import java.util.Scanner;

public class ForExercise6 {
     /*
        Write a program that prompts the user to input a positive integer within the range (1,20).
        It should then print the multiplication table of that number.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your positive number: ");
        int inputNumber = userInput.nextInt();
        if ((inputNumber>=1)&&(inputNumber<=20)){
             for (int i=0; i<=inputNumber; i++){
                 int result = inputNumber * i;
                 System.out.println(result);
             }
        } else {
             System.out.println("Error, introduce an integer number within the range (1,20)");
        }
    }
}
