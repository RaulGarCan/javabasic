package class_111422;

import java.util.Scanner;

public class Exercise7 {
    /*
        Ask the user to enter for ten times any given number within this range (1,100).
        If  any number entered is not within the range, exit the for statement and print the largest and smallest of all the numbers.
        When the for statement finishes print the largest and smallest numbers of all.
     */
    public static boolean checkUserInput(int number){
        int min = 1;
        int max = 100;
        if (number>=min && number<=max){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner userInput   = new Scanner(System.in);
        int number          = 1;
        int smallestNumber  = 0;
        int greatestNumber  = 0;

        int counter = 1;
        while (counter<=10){
            System.out.print("Please, guess a number greater than 1 and less an equal than 100: ");
            number = userInput.nextInt();
            if (checkUserInput(number)){
                if (counter==1){
                    smallestNumber = number;
                }
                if (number < smallestNumber){
                    smallestNumber  = number;
                }
                if (number > greatestNumber) {
                    greatestNumber  = number;
                }
            }else {
                break;
            }
            counter++;
        }
        System.out.println("The smallest number is: "+smallestNumber);
        System.out.println("The greatest number is: "+greatestNumber);
    }
}
