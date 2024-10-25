package class_100522;

import java.util.Scanner;

public class ExerciseSeven {
    /*
    Write a java program that compare two random
    int numbers. For the number 25 and 39 the
    expected output should be:
    25 != 39
    25 <  39
    25 <= 39
    */
    public static void compareTwoInt(int number1, int number2){
        if(number1 < number2){
            System.out.println(number1+" is less than "+number2);
        }else if(number1<=number2){
            System.out.println(number1+" is less than or equal to "+number2);
        }else if(number1!=number2){
            System.out.println(number1+" is different to "+number2);
        } else {
            System.out.println(number1+" is not different to, less than or equal to"+number2);
        }
    }
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your first int: ");
        int number1 = userInput.nextInt();
        System.out.print("Introduce your second int: ");
        int number2 = userInput.nextInt();

        compareTwoInt(number1, number2);
    }
}
