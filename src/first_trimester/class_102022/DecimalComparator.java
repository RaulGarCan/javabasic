package class_102022;

import java.util.Scanner;

public class DecimalComparator {
    /*
    DecimalComparator.java: write a method areEqualByThreeDecimalPlaces
    with two parameters of type double.
        The method should return boolean and it needs to return true if two double
        numbers are the same up to three decimal places. Otherwise, return false.
        TIP: Use casting.
    */
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int int1;
        int1=(int)(1000*(number1-(int)number1));
        int int2;
        int2=(int)(1000*(number2-(int)number2));
        System.out.println(int1);
        System.out.println(int2);

        boolean result;
        if(int1==int2){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Introduce your first double number: ");
        double number1 = numberInput.nextDouble();
        System.out.print("Introduce your second double number: ");
        double number2 = numberInput.nextDouble();
        System.out.println(areEqualByThreeDecimalPlaces(number1, number2));
    }
}
