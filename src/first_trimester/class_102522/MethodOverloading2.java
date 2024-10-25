package class_102522;

import java.util.Scanner;

public class MethodOverloading2 {
    /*
    Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
        You should validate that the first parameter minutes is >= 0.
        You should validate that the 2nd parameter seconds is >= 0 and <= 59.
        The method should return Invalid value in the method if either of the above are not true.
        If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed
        to this method and return that value as string in format  XXh YYm ZZs where XX represents a number of hours, YY the minutes and ZZ the seconds.

    Create a 2nd method of the same name but with only one parameter seconds. Validate that it is >= 0, and return Invalid value if it is not true.
        If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing
        the correct minutes and seconds calculated so that it can calculate correctly.
        Call both methods to print values to the console.minutes and seconds calculated so

        Tips: use int or long for your number data types is probably a good idea.
	    1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	    Methods should be static as we have used previously.
        Bonus: for the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	    Create a new console project and call it SecondsAndMinutesChallenge

     */
    public static void getDurationString(int minutes, int seconds){
        int hours;
        if ((minutes>=0)&&((seconds>=0)&&(seconds<=59))){
            final int FIXED60 = 60;
            hours = minutes/FIXED60;
            minutes = minutes%FIXED60;
            String zero = "0";

            if(hours>9){
                System.out.print(hours+"h ");
            } else {
                System.out.print(zero+hours+"h ");
            }
            if(minutes>9){
                System.out.print(minutes+"m ");
            } else {
                System.out.print(zero+minutes+"m ");
            }
            if(seconds>9){
                System.out.print(seconds+"s ");
            } else {
                System.out.print(zero+seconds+"s ");
            }
        }else {
            System.out.println("Invalid value");
        }
    }
    public static void getDurationString(int seconds){
        int hours;
        int minutes;
        if (seconds>=0){
            final int FIXED60 = 60;
            minutes = seconds/FIXED60;
            seconds = seconds%FIXED60;
            hours = minutes/FIXED60;
            minutes = minutes%FIXED60;
            String zero = "0";

            if(hours>9){
                System.out.print(hours+"h ");
            } else {
                System.out.print(zero+hours+"h ");
            }
            if(minutes>9){
                System.out.print(minutes+"m ");
            } else {
                System.out.print(zero+minutes+"m ");
            }
            if(seconds>9){
                System.out.print(seconds+"s ");
            } else {
                System.out.print(zero+seconds+"s ");
            }
        }else {
            System.out.println("Invalid value");
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the amount of minutes: ");
        int minutes = userInput.nextInt();
        System.out.print("Introduce the amount of seconds: ");
        int seconds = userInput.nextInt();

        getDurationString(minutes, seconds);
        getDurationString(seconds);
    }
}
