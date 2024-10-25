package class_111122;

import java.util.Scanner;

public class NumberPalindrome {
    /*
        NumberPalindrome.java: write a method called isPalindrome with one int parameter called number. The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
Tip: Logic to check a palindrome number
Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
If both are the the same then the number is a palindrome otherwise it is not.
Tip: Logic to reverse a number: Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero.
A while loop would be good for this coding exercise.
Tip: Be careful with negative numbers. They can also be palindrome numbers.
     */
    public static boolean isPalindrome(int number){
        int divisorFirstNumber = 1000000000;
        int divisorLastNumber  = 1000000000;
        int newFirstNumber     = 0;
        int newSecondNumber    = 0;
        boolean isPalindrome   = false;
        // Any number less than ten should be a Palindrome
        if (number<10){
            isPalindrome = true;
        }else {
            // We need to find the greatest value of the number. We do so by dividing recursively by 10.
            while (number/divisorFirstNumber==0){
                divisorFirstNumber/=10;
            }
            /******************************************************************************************************
             We need to find the lowest value of the number. We do so by calculating the reminder of the number
             recursively.
             ******************************************************************************************************/
            while (number%divisorLastNumber>=10){
                divisorLastNumber/=10;
            }

            // The greatest and the lowest value of the number are calculated.
            newFirstNumber  = number/divisorFirstNumber;
            newSecondNumber = number%divisorLastNumber;

            // If those two values are different, then the number is not a Palindrome.
            if (newFirstNumber == newSecondNumber){
                // Once check the greatest and the lowest values, those values should be removed from the number.
                number  = (number-((number/divisorFirstNumber)*divisorFirstNumber))/divisorLastNumber;
                // The method is called again.
                isPalindrome(number);
            }else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        int userNumber      = 0;
        Scanner userInput   = new Scanner(System.in);
        System.out.print("Please, insert an int number: ");
        userNumber   = userInput.nextInt();
        userInput.nextLine();
        System.out.println();
        if (isPalindrome(userNumber)){
            System.out.println("The number is a Palindrome.");
        }else {
            System.out.println("The number is not a Palindrome.");
        }
    }
}