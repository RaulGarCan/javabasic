package class_102122;

public class Fibonacci {
    /*
        In the Fibonacci numbers, each number is the sum of the two preceding ones.
        The sequence commonly starts from 0 and 1, although some authors omit the
        initial terms and start the sequence from 1 and 1 or from 1 and 2.
        Starting from 0 and 1, the first few values in the sequence are:
     	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
     	Use a method that call itself to generate the 20 first Fibonacci
        numbers.
     */
    //static int number1 = 0;
    //static int number2 = 1;
    //static int result = 0;
    //static int counter = 2;
    public static void fibonacci(int number1, int number2, int counter){

        if(counter!=0) {
            int result;
            result = number1 + number2;
            counter--;
            number2=number1;
            number1=result;
            System.out.println(result);
            fibonacci(number1, number2, counter);
        }
    }
    public static void main(String[] args) {
        fibonacci(0,1,20);
    }
}