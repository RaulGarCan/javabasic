package class_111422;

import java.util.Scanner;

public class Exercise11 {
    /*
        Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
        Check that number is > 0, if it is not return false.
        If number is odd return true, otherwise return false. Write a second method called sumOdd that has 2 int parameters start and end,
        which represent a range of numbers.
        The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
            It should call the method isOdd to check if each number is odd.
            The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
            If those conditions are not satisfied return -1 from the method to indicate invalid input.
     */
    public static boolean isOdd (int number){
        if ((number>0) && (!(number % 2 == 0))) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumOdd (int start, int end){
        int result = 0;
        if ((end>=start)&&(end>0)&&(start>0)) {
            int counter = start;
            while ((counter >= start) && (counter <= end)) {
                if (isOdd(counter)) {
                    result += counter;
                }
                counter++;
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
