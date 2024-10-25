package class_102022;

import java.util.Scanner;

public class TeenNumberChecker {
    /*
    TeenNumberChecker.java: we'll say that a number is "teen" if it is in the range 13 -19
    (inclusive). Write a method named hasTeen with 3 parameters of type int.
    The method should return boolean and it needs to return true if one of the parameters
    is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
     */
    public static boolean hasTeen(int number1, int number2, int number3){
        boolean result;
        if((((number1>=13)&&(number1<=19)||(number2>=13)&&(number2<=19))||(number3>=13)&&(number3<=19))){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your first number: ");
        int number1 = userInput.nextInt();
        System.out.print("Introduce your second number: ");
        int number2 = userInput.nextInt();
        System.out.print("Introduce your third number: ");
        int number3 = userInput.nextInt();
        System.out.println(hasTeen(number1, number2, number3));
    }
}
