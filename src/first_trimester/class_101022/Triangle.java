package class_101022;

import java.util.Scanner;
public class Triangle {
        /*
    1. Given the random base and height of a triangle (less than 100 and greater than 0).
    Calculate the area of the triangle.

         */
    public static double triangleArea(int base, int height){
        final int FIXED2 = 2;
        int area = base*height/FIXED2;
        return area;
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the base of the triangle: ");
        int base = userInput.nextInt();
        System.out.print("Introduce the height of the triangle: ");
        int height = userInput.nextInt();

        System.out.println("The base of the triangle is: "+base);
        System.out.println("The height of the triangle is: "+height);
        System.out.println("The area of the triangle is: "+triangleArea(base, height));
    }
}