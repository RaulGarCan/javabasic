package class_111422;

public class Exercise3 {
     /*
        Write a program to find the sum of all integers greater than 100 and less than 200 that are divisible by 7.
     */

    public static void main(String[] args) {
        int result = 0;
        int counter = 100;
        int divisor = 7;
        int limit = 200;
        while (counter<=limit){
            if (counter%divisor==0){
                result += counter;
                System.out.println(counter);
            }
            counter++;
        }
        System.out.println("The sum of the numbers is: "+result);
    }
}