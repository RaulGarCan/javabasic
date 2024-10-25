package class_110322;

public class ForExercise9 {
     /*
        Write a program to find the sum of all integers greater than 100 and less than 200 that are divisible by 7.
     */
    static int result = 0;
     public static void main(String[] args) {
         for (int i = 100; i<=200; i++){
             if (i%7==0){
                 result += i;
                 System.out.println(i);
             }
         }
         System.out.println("The sum of the numbers is: "+result);
     }
}
