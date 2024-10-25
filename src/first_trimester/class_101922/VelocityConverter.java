package class_101922;
import java.util.Scanner;
public class VelocityConverter {

    /*
    VelocityConverter.java :
    Write a method called convertMilesPerHour that has 1 parameter of type double with the name kmPerHourParam.
    This method needs to return the rounded value of the calculation of type long.
    If the parameter kmPerHourParamis less than 0, the method convertMilesPerHour needs to return -1 to indicate an invalid value.
    Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
        NOTE: 1 mile per hour is 1.609 kilometers per hour.
        NOTE: for conversion and rounding use the method Math.round().

        Write another method called printOutcome with 1 parameter of type double with the name kmPerHourParam.
        This method should not return anything (void) and it needs to calculate milesPerHour from the kmPerHourParam parameter.
		    It needs to print a message in the format “XX km/h = YY mi/h”.
		    XX represents the original value kmPerHourParam.
            YY represents the rounded milesPerHour from the kmPerHourParam parameter.
            If the parameter kmPerHourParam is < 0 then print the text “Invalid value”.

     */

    public static long convertMilesPerHour(double kmPerHourParam){
        long result;
        final double CONVERTERCONST = 1.609d;
        if(kmPerHourParam<0){
            result=-1L;
        } else {
            result = Math.round(kmPerHourParam/CONVERTERCONST);
        }
        return result;
    }
    public static void printOutcome(double kmPerHourParam){
        final double CONVERTERCONST = 1.609d;
        if(kmPerHourParam<0){
            System.out.println("Invalid value");
        }else {
            System.out.println(kmPerHourParam+" km/h = "+Math.round(kmPerHourParam/CONVERTERCONST)+" mi/h ");
        }
    }
    public static void main(String[] args) {
        Scanner userParameter = new Scanner(System.in);
        System.out.print("Introduce your velocity in km/h: ");
        double velocityParameter = userParameter.nextDouble();
        System.out.println(velocityParameter+" km/h = "+convertMilesPerHour(velocityParameter)+" mi/h ");
        printOutcome(velocityParameter);
    }
}
