package class_100422;
import java.util.Scanner;
public class GreaterNumber {

    /*
    Generate two random number, print them and then print the greater one.
    */

    public static String whichGreatest(int number1, int number2){
        String result="";
        if(number1>number2){
            result = "The greatest number is "+number1;
        }else {
            result = "The greatest number is "+number2;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Introduce your first number: ");
        int number1 = numberInput.nextInt();
        System.out.print("Introduce your second number: ");
        int number2 = numberInput.nextInt();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(whichGreatest(number1, number2));
    }
}
