package class_110322;

import java.util.Scanner;

public class ForExercise8 {
    /*
        Write a method called isOdd with an int parameter and call it number.
        The method needs to return a boolean. Check that number is > 0, if it is not return false.
        If number is odd return true, otherwise return false. Write a second method called sumOdd that has 2
        int parameters start and end, which represent a range of numbers. The method should use a for loop to sum
        all odd numbers in that range including the end and return the sum.
            It should call the method isOdd to check if each number is odd. The parameter end needs to be greater than or equal
            to start and both start and end parameters have to be greater than 0. If those conditions are not satisfied return -1
            from the method to indicate invalid input.
    */
    static int result = 0;
    public static boolean isOdd(int number){
        boolean result = false;
        if (number>0){
            if (number%2!=0){
                result = true;
            }
        }
        return result;
    }
    public static int sumOdd(int start, int end){
        if ((end>=start)&&(end>0)&&(start>0)) {
            for (int i = 1; (i >= start) && (i <= end); i++) {
                if (isOdd(i)) {
                    System.out.println(i);
                    result += i;
                }
            }
        } else {
            result = -1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int startInput = userInput.nextInt();
        System.out.print("Enter the end of the range: ");
        int endInput = userInput.nextInt();

        System.out.println(sumOdd(startInput, endInput));
    }
}
