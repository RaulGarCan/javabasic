package class_110322;

public class ForExercise3 {
    /*
        (Use for) Write a program that calculates the factorial of any given random number smaller than 20 and greater than 1.
     */
    public static void main(String[] args) {
        int limit = (int)(20*Math.random());
        int result = 1;
        for (int i=1; i<=limit; i++){
            result *= i;
        }
        System.out.println(limit);
        System.out.println(result);
    }
}
