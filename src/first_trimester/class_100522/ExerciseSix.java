package class_100522;

import java.util.Scanner;

public class ExerciseSix {
    /*
    Write a java program that swap two variables.
    First print the variables first values and
    then print the swapped values.
    */
    public static void swapVar(int var1, int var2){
        int var1Again;
        var1Again = var1;
        var1 = var2;
        var2 = var1Again;
        System.out.println("The swapped value for the first variable is "+var1);
        System.out.println("The swapped value for the second variable is "+var2);
    }
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your first variable: ");
        int var1 = userInput.nextInt();
        System.out.print("Introduce your second variable: ");
        int var2 = userInput.nextInt();

        System.out.println("The initial value for the first variable is "+var1);
        System.out.println("The initial value for the second variable is "+var2);

        swapVar(var1, var2);
    }
}
