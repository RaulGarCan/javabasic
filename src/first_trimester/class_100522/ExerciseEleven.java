package class_100522;

import java.util.Scanner;

public class ExerciseEleven {
    /*
    Write the java program to calculate the
    sum of two random ints less than 10, and
    print true if the sum is equal to a third
    given random number less than 10.
    */
    public static boolean sumOf2EqualToNumber3(int number1, int number2, int number3){
        boolean result;
        int sum = number1+number2;
        if (sum==number3){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your first number: ");
        int number1 = userInput.nextInt();
        System.out.print("Introduce your second number: ");
        int number2 = userInput.nextInt();
        System.out.print("Introduce your third number: ");
        int number3 = userInput.nextInt();

        System.out.println("The sum of "+number1+" and "+number2+ " is equal to "+number3+" : "+sumOf2EqualToNumber3(number1, number2, number3));
    }
}
