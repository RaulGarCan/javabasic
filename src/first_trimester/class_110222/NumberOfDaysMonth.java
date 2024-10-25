package class_110222;

import java.util.Scanner;

public class NumberOfDaysMonth {
    /*
        NumberOfDaysMonth.java: write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
            If the parameter is not in that range return false. Otherwise, if it is in the valid range,
            calculate if the year is a leap year and return true if it is, otherwise return false.
            A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
            Write another method getDaysInMonth with two parameters month and year.  Both of type int.
            If parameter month is < 1 or > 12 return -1. If parameter year is < 1 or > 9999 then return -1.
            This method needs to return the number of days in the month. Be careful about leap years
            they have 29 days in month 2 (February).
            You should check if the year is a leap year using the method isLeapYear described above.
            HINT: Use the switch statement.
    */
    public static boolean isLeapYear(int year){
        boolean result;
        if ((year>1)&&(year<9999)){
            switch (year%4){
                case 0:
                    switch (year%100){
                        case 0:
                            switch (year%400){
                                case 0:
                                    result = true;
                                    break;
                                default:
                                    result = false;
                            }
                            break;
                        default:
                            result = true;
                    }
                    break;
                default:
                    result = false;
            }
        } else {
            result = false;
        }
        return result;
    }
    public static int getDaysInMonth(int month, int year){
        int result;
        if ((month>=1)&&(month<=12)){
            if ((year>1)&&(year<9999)) {
                    switch (month){
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                            result = 31;
                            break;
                        case 2:
                            if (isLeapYear(year)){
                                result = 29;
                            } else {
                                result = 28;
                            }
                            break;
                        default:
                            result = 30;
                            break;
                    }
            }
            else {
                result = -1;
            }
        } else {
            result = -1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the year: ");
        int inputYear = userInput.nextInt();
        System.out.print("Introduce the month: ");
        int inputMonth = userInput.nextInt();

        System.out.println(inputYear+" is a leap year: "+isLeapYear(inputYear));

        System.out.println(getDaysInMonth(inputMonth, inputYear));
    }
}
