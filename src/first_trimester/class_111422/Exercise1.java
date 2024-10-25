package class_111422;

public class Exercise1 {
    /*
        Write a program that calculates the sum of the 1,2,3, ..,100.
     */
    public static void main(String[] args) {
        int limit = 100;
        int result = 0;
        int counter = 1;
        while (counter<=limit){
            result += counter;
            counter++;
        }
        System.out.println(result);
    }
}