package class_093022;
import java.util.Scanner;
public class ExerciseTwo_300922 {

    /*
    Exercise 2: given the radius, calculate the length of the circle.
    (Length=2*pi*radius)
    */

    public static double lengthCircle(double radius){
        final double PI = 3.14d;
        final int FIXED2 = 2;
        double length = FIXED2*PI*radius;

        return length;
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the radius of the circle: ");
        double radius = userInput.nextDouble();

        System.out.println("The length of the circle is: "+lengthCircle(radius));
    }
}
