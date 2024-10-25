package class_102522;

import java.util.Scanner;

public class MethodOverloading1 {
    /*
    Create a method called calcFeetAndInchesToCentimeters. It needs to have two parameters;
    feet is the first parameter, inches is the 2nd parameter.
            You should validate that the first parameter feet is >= 0.
            You should validate that the 2nd parameter inches is >=0 and <=12.
  	        You should return -1 from the method if either of the above is not true.
            If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method and return that value.
            Create a 2nd method of the same name but with only one parameter, inches is the parameter.
            Validate that its >=0; return -1 if it is not true. But if it's valid, then calculate how many feet are in the inches,
            and then call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.
            hints: use double for your number data types is probably a good idea
            1 inch = 2.54cm  and one foot = 12 inches
            NOTE: calling another overloaded method just requires you to use the right number of parameters.
     */
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet>=0)&&((inches>=0)&&(inches<=12))){
            double centimeters = (inches*2.54)+(feet*12*2.54);
            return centimeters;
        }
            return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches>=0){
            double centimeters = (inches*2.54);
            return centimeters;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the amount of feet: ");
        double feet = userInput.nextDouble();
        System.out.print("Introduce the amount of inches: ");
        double inches = userInput.nextDouble();

        System.out.println(+calcFeetAndInchesToCentimeters(feet, inches)+" centimeters");
        System.out.println(calcFeetAndInchesToCentimeters(inches)+" centimeters");
    }
}
