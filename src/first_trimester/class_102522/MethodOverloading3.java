package class_102522;

import java.util.Scanner;

public class MethodOverloading3 {
    /*
        Write a method named area with one double parameter named radius. The method needs to return a double value that represents the area of a circle.
            If the parameter radius is negative then return -1.0 to represent an invalid value.
            Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
            The method needs to return an area of a rectangle. If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
            TIP: The formula for calculating the area of a rectangle is x * y.
            TIP: The formula for calculating a circle area is radius * radius * PI.
            TIP: For PI use a constant from Math class e.g. Math.PI
     */
    public static double area(double radius){
        double resultArea = -1;
        if (radius>=0) {
            resultArea = Math.PI * radius * radius;
        }
        return resultArea;
    }
    public static double area(double x, double y){
        double resultArea = -1;
        if ((x>=0)||(y>=0)){
            resultArea = x*y;
        }
        return resultArea;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the radius of the circle: ");
        double radius = userInput.nextDouble();
        System.out.print("Introduce the base of the rectangle: ");
        double base = userInput.nextDouble();
        System.out.print("Introduce the height of the rectangle: ");
        double height = userInput.nextDouble();

        System.out.println("The area of the circle is: "+area(radius));
        System.out.println("The area of the rectangle is: "+area(base, height));
    }
}
