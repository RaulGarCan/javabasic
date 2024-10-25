package class_093022;
import java.util.Scanner;
public class ExerciseOne_300922 {
    /*
      Exercise 1: given the radius calculate the area of the circle.
      (Area=pi*radius^2)
    */

    public static double circleArea(double radius){
        final double PI = 3.14159d;
        double area = PI*radius*radius;

        return area;
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the radius of the circle: ");
        double radius = userInput.nextDouble();

        System.out.println("The area of the circle is "+circleArea(radius));
    }
}
