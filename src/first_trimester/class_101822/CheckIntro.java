package class_101822;

import java.util.Scanner;
public class CheckIntro {
    /*
    Create a Java class named clase_181022.CheckIntro that asks the user for any
    number and using the method checkNumber from Exercise 2,
    send the method’s messages back to the console.
     */
    public static void main(String[] args){
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Introduce your number: ");
        int number = userNumber.nextInt();
        class_101722.JavaExercise2.checkNumber(number);
    }
}