package class_102522;

import java.util.Scanner;

public class MethodOverloading5 {
    /*
        Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
            If one of the parameters is less than 0, print text "Invalid Value".
            If all numbers are equal print text "All numbers are equal".
            If all numbers are different print text "All numbers are different".
            Otherwise, print "Neither all are equal or different".
            TIP: Be extremely careful about spaces in the printed message.
            NOTES
            The solution will not be accepted if there are extra spaces.
            The method printEqual needs to be defined as public static.
     */
    public static void printEqual(int parameter1, int parameter2, int parameter3){
        if ((parameter1<0)||(parameter2<0)||(parameter3<0)){
            System.out.println("Invalid Value");
        } else if ((parameter1==parameter2)&&(parameter1==parameter3)) {
            System.out.println("All numbers are equal");
        } else if ((parameter1!=parameter2)&&(parameter1!=parameter3)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your first parameter: ");
        int parameter1 = userInput.nextInt();
        System.out.print("Introduce your second parameter: ");
        int parameter2 = userInput.nextInt();
        System.out.print("Introduce your third parameter: ");
        int parameter3 = userInput.nextInt();

        printEqual(parameter1, parameter2, parameter3);
    }
}
