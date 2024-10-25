package class_110222;

import java.util.Scanner;

public class SwitchExercise1 {
    /*
        Exercise 1: write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
            The method should not return any value.
            Using a switch statement print “Sunday”, “Monday”, …, “Saturday” if the int parameter
            “day” is 0,1,2,3,...,6 respectively, otherwise it should print “invalid day”.
     */
    public static void printDayOfTheWeek(int day){
        String  monday = "Monday",
                tuesday = "Tuesday",
                wednesday = "Wednesday",
                thursday = "Thursday",
                friday = "Friday",
                saturday = "Saturday",
                sunday = "Sunday";

        switch(day){
            case 0:
                System.out.println(monday);
                break;
            case 1:
                System.out.println(tuesday);
                break;
            case 2:
                System.out.println(wednesday);
                break;
            case 3:
                System.out.println(thursday);
                break;
            case 4:
                System.out.println(friday);
                break;
            case 5:
                System.out.println(saturday);
                break;
            case 6:
                System.out.println(sunday);
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the number of the week: ");
        int inputDay = userInput.nextInt();

        printDayOfTheWeek(inputDay);
    }
}
