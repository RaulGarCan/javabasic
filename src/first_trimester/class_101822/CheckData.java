package class_101822;

import java.util.Scanner;
public class CheckData {
    /*
    Create a Java class named clase_181022.CheckData that asks the user for a number between the range (0,1000000)
    and using the method checkParameter from Exercise 1,
    send the message “Out of the range” if the number is out of the range or
    “Within the range” if the number is within the range.
     */
    public static void main(String[] args){
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Introduce your number");
        double number = userNumber.nextInt();
        if (class_101722.JavaExercise1.checkParameter(number)){
            System.out.println("Within the range");
        }else {
            System.out.println("Out of the range");
        }
    }
}