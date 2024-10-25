package class_110322;

public class ForExercise5 {
     /*
        Calculate the prime numbers greater than 1 and less than 100.
     */
     public static void main(String[] args) {
         int divisorsCounter   = 0;
         for(int numbers=1;numbers<=100;numbers++){
             for (int j=1;j<numbers;j++){
                 if (numbers%j==0){
                     divisorsCounter++;
                 }
             }
             if (divisorsCounter<2){
                 if (numbers!=1){
                     System.out.println("The number "+numbers+" is prime.");
                 }
             }
             divisorsCounter = 0;
         }
     }
}
