package class_110222;

import java.util.Scanner;

public class NumberInWord {
    /*
       NumberInWord.java: write a method called printNumberInWord. The method has one parameter number
       which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the
       int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
       You can use if-else statement or switch statement whatever is easier for you.
        NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
    */
    public static void printNumberInWord(int number){
        String  zero = "ZERO",
                one = "ONE",
                two = "TWO",
                three = "THREE",
                four = "FOUR",
                five = "FIVE",
                six = "SIX",
                seven = "SEVEN",
                eight = "EIGHT",
                nine = "NINE",
                other = "OTHER";
        switch(number){
            case 0:
                System.out.println(zero);
                break;
            case 1:
                System.out.println(one);
                break;
            case 2:
                System.out.println(two);
                break;
            case 3:
                System.out.println(three);
                break;
            case 4:
                System.out.println(four);
                break;
            case 5:
                System.out.println(five);
                break;
            case 6:
                System.out.println(six);
                break;
            case 7:
                System.out.println(seven);
                break;
            case 8:
                System.out.println(eight);
                break;
            case 9:
                System.out.println(nine);
                break;
            default:
                System.out.println(other);
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the number: ");
        int inputNumber = userInput.nextInt();

        printNumberInWord(inputNumber);
    }
}
