package class_100522;
import java.util.Scanner;
public class ExerciseFour {
    /*
        Write a java program that takes three random
        int numbers and print the average of the three.
    */

    public static int average(int number1, int number2, int number3){
        final int FIXED3 = 3;
        int result = (number1+number2+number3)/FIXED3;
        return result;
    }
    public static void main(String[] args){
        Scanner userNumber = new Scanner(System.in);
        System.out.print("Introduce your first number: ");
        int number1 = userNumber.nextInt();
        System.out.print("Introduce your second number: ");
        int number2 = userNumber.nextInt();
        System.out.print("Introduce your third number: ");
        int number3 = userNumber.nextInt();
        System.out.println("The average of "+number1+", "+number2+" and "+number3+" is "+average(number1, number2, number3));
    }
}