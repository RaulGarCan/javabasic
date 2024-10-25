package class_092722;
import java.util.Scanner;
public class Converter {
    public static double tempConverter(double fahrenheit){
        double celsius;
        final int CONSTTEMPERATURE = -32;
        final int FIXED5 = 5;
        final int FIXED9 = 9;
        celsius = (fahrenheit+CONSTTEMPERATURE)*FIXED5/FIXED9;

        return celsius;
    }
    public static double distConverter(double inches){
        double meters;
        final double CONSTDISTANCE = 39.37d;
        meters = inches/CONSTDISTANCE;

        return meters;
    }
    public static double weightConverter(double pounds){
        double kilograms;
        final double CONSTWEIGHT = 2.205d;
        kilograms = pounds/CONSTWEIGHT;

        return kilograms;
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the temperature in fahrenheit: ");
        double farenheit = userInput.nextDouble();
        System.out.print("Introduce the distance in inches: ");
        double inches = userInput.nextDouble();
        System.out.print("Introduce the weight in pounds: ");
        double pounds = userInput.nextDouble();

        System.out.println(+farenheit+" fahrenheit are "+tempConverter(farenheit)+" celsius");
        System.out.println(+inches+" inches are "+distConverter(inches)+ " metres");
        System.out.println(+pounds+" are "+weightConverter(pounds)+ " kilograms");
    }
}
