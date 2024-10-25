package class_102022;

import java.util.Scanner;

public class EqualSumChecker {
    /*
    EqualSumCheker.java: write a method hasEqualSum with 3 parameters of type int.
    The method should return boolean and it needs to return true if the sum
     of the first and second parameter is equal to the third parameter. Otherwise, return false.
     */
    public static boolean hasEqualSum(int number1, int number2, int number3) {
        boolean result;
        if (number1 + number2 == number3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Introduce your first number: ");
        int number1 = numberInput.nextInt();
        System.out.print("Introduce your second number: ");
        int number2 = numberInput.nextInt();
        System.out.print("Introduce your third number: ");
        int number3 = numberInput.nextInt();
        System.out.println(hasEqualSum(number1,number2,number3));
    }
}
