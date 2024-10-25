package exam_100622;

import java.util.Scanner;

public class Exercise3 {
    /*
        Exercise 3: generate three random int numbers less than 100 and greater than 0
                            and find the greatest one and the smallest one.
    */
    public static void findGreatest (int number1, int number2, int number3){
        if((number1>number2)&&(number1>number3)){
            System.out.println(number1+" is the greatest");
        }else if((number2>number1)&&(number2>number3)){
            System.out.println(number2+" is the greatest");
        }else{
            System.out.println(number3+" is the greatest");
        }

        if((number1<number2)&&(number1<number3)){
            System.out.println(number1+" is the smallest");
        }else if((number2<number1)&&(number2<number3)){
            System.out.println(number2+" is the smallest");
        }else{
            System.out.println(number3+" is the smallest");
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your first number: ");
        int number1 = userInput.nextInt();
        System.out.print("Introduce your second number: ");
        int number2 = userInput.nextInt();
        System.out.print("Introduce your third number: ");
        int number3 = userInput.nextInt();

        findGreatest(number1, number2, number3);
    }
}
