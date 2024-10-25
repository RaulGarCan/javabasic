package class_111122;

import java.util.Scanner;

public class FirstAndLastDigitSum {
    /*
        FirstAndLastDigitSum.java: write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and
        return the sum of the first and the last digit of that number. If the number is negative then the method needs to return
        -1 to indicate an invalid value.
     */
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int result = 0;
        int divisorFirstNumber = 1000000000;
        int divisorLastNumber  = 1000000000;
        int newFirstNumber     = 0;
        int newSecondNumber    = 0;

        while (number/divisorFirstNumber==0){
            divisorFirstNumber/=10;
        }
        while (number%divisorLastNumber>=10){
            divisorLastNumber/=10;
        }

        newFirstNumber  = number/divisorFirstNumber;
        newSecondNumber = number%divisorLastNumber;

        result = newFirstNumber+newSecondNumber;

        return result;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your number: ");
        int input = userInput.nextInt();
        if (sumFirstAndLastDigit(input)==-1){
            System.out.println("Invalid value");
        } else {
            System.out.println(sumFirstAndLastDigit(input));
        }
    }
}
