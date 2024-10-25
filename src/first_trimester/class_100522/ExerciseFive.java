package class_100522;
import java.util.Scanner;
public class ExerciseFive {

    /*
    Write a java program that given two random
    double numbers less than 10 that represent
    the height and width of a rectangle, print
    the perimeter.
    */
    public static double rectanglePerimeter(double base, double height){
        final int FIXED2 = 2;
        double perimeter = FIXED2*base+FIXED2*height;
        return perimeter;
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the base of the rectangle: ");
        double base = userInput.nextDouble();
        System.out.print("Introduce the height of the rectangle: ");
        double height = userInput.nextDouble();
        System.out.println("The perimeter of the rectangle is: "+rectanglePerimeter(base, height));
    }
}