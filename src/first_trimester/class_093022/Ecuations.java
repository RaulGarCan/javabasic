package class_093022;
import java.util.Scanner;
public class Ecuations {
    /*
        Calculate the following equations.

        //  5x+3y^2-(x-y)^4(5/x)^3
        //  -10-x+y/3*x^2-4+x^4
        //  (5x-7)^2/9+4*y^2-(-3x-4y)*3-7
        //  x/y^3-4x+3y/9-10x^4*4
    */
    public static double ecuation1(double x, int y){
        double result = 5*x+3*y*y-(x-y)*(x-y)*(x-y)*(x-y)*(5/4)*(5/4)*(5/4);

        return result;
    }
    public static double ecuation2(double x, int y){
        double result = -10-x+y/3*x*x-4+x*x*x*x;

        return result;
    }
    public static double ecuation3(double x, int y){
        double result = (5*x-7)*(5*x-7)/9+4*y*y-(-3*x-4*y)*3-7;

        return result;
    }
    public static double ecuation4(double x, int y){
        double result = x/y*y*y-4*x+3*y/9-10*x*x*x*x*4;

        return result;
    }
    public static void main(String[] args){
        Scanner userNumber = new Scanner(System.in);
        System.out.print("Introduce the variable 'x' value: ");
        double x = userNumber.nextDouble();
        System.out.print("Introduce the variable 'y' value: ");
        int y = userNumber.nextInt();

        System.out.println("The result of the first ecuation is: "+ecuation1(x, y));
        System.out.println("The result of the second ecuation is: "+ecuation2(x, y));
        System.out.println("The result of the third ecuation is: "+ecuation3(x, y));
        System.out.println("The result of the fourth ecuation is: "+ecuation4(x, y));
    }
}
