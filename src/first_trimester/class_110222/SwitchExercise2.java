package class_110222;

import java.util.Scanner;

public class SwitchExercise2 {
    /*
        Exercise 2: write the Exercise 1 using the solution if else statement, instead of using switch.
     */
    public static void printDayOfTheWeek(int day){
        String  monday = "Monday",
                tuesday = "Tuesday",
                wednesday = "Wednesday",
                thursday = "Thursday",
                friday = "Friday",
                saturday = "Saturday",
                sunday = "Sunday";

        if (day==0){
            System.out.println(monday);
        } else if(day==1){
            System.out.println(tuesday);
        } else if(day==2){
            System.out.println(wednesday);
        } else if(day==3){
            System.out.println(thursday);
        } else if(day==4){
            System.out.println(friday);
        } else if(day==5){
            System.out.println(saturday);
        } else if(day==6) {
            System.out.println(sunday);
        } else {
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
