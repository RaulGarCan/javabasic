package class_110322;

public class ForExercise2 {
    /*
        Modify the above program and instead of using a count up in the for statement, use a countdown.
     */
    public static void main(String[] args) {
        int limit = 1;
        int result = 0;
        for (int i = 100; i>=1; i--){
            result += i;
        }
        System.out.println(result);
    }
}
