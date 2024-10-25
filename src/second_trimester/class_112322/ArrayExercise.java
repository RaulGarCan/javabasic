package second_trimester.class_112322;

import java.util.Scanner;

public class ArrayExercise {
     /*
        Exercise One: Ask the user to enter ten double numbers.
        Make sure that the numbers entered are double, on the contrary send a
        message to the user telling that the number was not correct.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] arrayOfNumbers = new double[10];
        int counter = 0;
        int limit = 10;
        do {
            System.out.print("Introduce a double number: ");
            while (!userInput.hasNextDouble()){
                System.out.println("Error: The input is not a double, please try again.");
                System.out.print("Introduce a double number: ");
                userInput.nextLine();
            }
            arrayOfNumbers[counter] = userInput.nextDouble();
            counter++;
            userInput.nextLine();
        }while (counter<limit);
        System.out.print("The double numbers are: ");
        for (int j = 0; j < limit; j++){
            System.out.print(arrayOfNumbers[j]+" ");
        }
    }
}
