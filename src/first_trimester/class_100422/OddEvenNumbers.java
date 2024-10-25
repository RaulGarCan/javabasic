package class_100422;
import java.util.Scanner;
public class OddEvenNumbers {
        /*
            Generate a random number and tell if it is odd or even
        */
    public static String oddEven(int numberIn){
        String result = "";
        if(numberIn%2==0){
            result = numberIn+" is even";
        }else {
            result = numberIn+" is odd";
        }
        return result;
    }
    public static void main(String[] args){
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Introduce your number: ");
        int number = numberInput.nextInt();
        System.out.println(oddEven(number));
    }
}
