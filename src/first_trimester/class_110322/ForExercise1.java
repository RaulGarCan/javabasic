package class_110322;

public class ForExercise1 {
    /*
        (Use for) Write a program that calculates the sum of the 1,2,3, ..,100.
     */
    public static void main(String[] args) {
        int limit = 100;
        int result = 0;
        for (int i = 1; i<=limit; i++){
            result += i;
        }
        System.out.println(result);
    }
}
