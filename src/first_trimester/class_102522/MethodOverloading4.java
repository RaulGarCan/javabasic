package class_102522;

import java.util.Scanner;

public class MethodOverloading4 {
    /*
        Write a method printYearsAndDays with parameter of type long named minutes. The method should not return anything (void)
        and it needs to calculate the years and days from the minutes parameter. If the parameter is less than 0, print text "Invalid Value".
            Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
            XX represents the original value minutes.
            YY represents the calculated years.
            ZZ represents the calculated days.
            TIPS:
            Be extra careful about spaces in the printed message.
            Use the remainder operator
            1 hour = 60 minutes
            1 day = 24 hours
            1 year = 365 days
            NOTES
             The printYearsAndDays method needs to be defined as public static.
             The solution will not be accepted if there are extra spaces
     */
    public static void printYearsAndDays(long minutes){
        if (minutes>=0){
            final long FIXED60 = 60;
            final long FIXED24 = 24;
            final long FIXED365 = 365;
            long hours = minutes/FIXED60;
            long days = hours/FIXED24;
            long years = days/FIXED365;
            days = days%FIXED365;
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        } else {
            System.out.println("Invalid Value");
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your minutes: ");
        long minutes = userInput.nextLong();

        printYearsAndDays(minutes);
    }
}
