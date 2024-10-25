package class_111122;

import java.util.Scanner;

public class Exercise1 {
    /*
        Create a method that takes a parameter of type int. The purpose of this method is to determine if
        the number passed as a parameter is an even number or not. The program should ask the user to enter a
        range of numbers to check if they are even numbers or not.
The program should check in a recursive way if the range is correct, knowing that the minimum value of the range is 0 and the maximum value is 100.
The program should check if the values entered by the user are int and not String in a recursive fashion.
So if in the first value the user does not enter an int the program should ask recursively to enter an int until the user does so.
The same with the second value entered by the user. Once the values are valid the program should continue to determine the even numbers within the range.
Once everything is correct the program should print only the first 10 even numbers within the range.
     */

    public static boolean checkInput(int min, int max){
        int minimum = 0;
        int maximum = 100;
        if ((min<minimum || max<minimum) || (min>maximum || max>maximum) || (min > max)){
            System.out.println("Something went wrong. Try again!");
            return false;
        }
        return true;
    }
    public static boolean isEven(int input){
        if (input%2==0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int minimum = 0;
        int maximum = 0;
        do {
            System.out.print("Introduce the min value of the range: ");
            while (!userInput.hasNextInt()){
                System.out.println("The introduced value is not an int. Try again!");
                System.out.print("Introduce the min value of the range: ");
                userInput.nextLine();
            }
            minimum = userInput.nextInt();
            userInput.nextLine();
            System.out.print("Introduce the max value of the range: ");
            while (!userInput.hasNextInt()){
                System.out.println("The introduced value is not an int. Try again!");
                System.out.print("Introduce the max value of the range: ");
                userInput.nextLine();
            }
            maximum = userInput.nextInt();
        }while(!checkInput(minimum, maximum));
        System.out.println("The first ten even numbers are: ");
        int counter = minimum;
        while(counter<=maximum){
                if (counter<10){
                    if (isEven(counter)){
                        System.out.print(counter+" ");
                        counter++;
                    }
                }
            counter++;
        }
    }
}
