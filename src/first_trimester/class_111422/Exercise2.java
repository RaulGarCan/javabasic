package class_111422;

public class Exercise2 {
    /*
        Write a program that calculates the factorial of any given random number smaller than 20 and greater than 1.
     */
    public static void main(String[] args) {
        int limit = (int)(20*Math.random());
        long result = 1;
        int counter = 1;
        if (limit>=1) {
            while (counter <= limit) {
                result *= counter;
                counter++;
            }
            System.out.println(limit);
            System.out.println(result);
        } else {
            System.out.println("This number has no factorial");
        }
    }
}
