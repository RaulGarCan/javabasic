package class_110322;

public class ForExercise7 {
     /*
                Create a for statement using a range of numbers from 1 to 1000 inclusive. 
            Sum all the numbers that can be divided with both 3 and also with 5.
            For those numbers that met the above conditions, print out the number. 
        Break out the loop once you find 5 numbers that met the above conditions. 
        After breaking out of the loop print the sum of the numbers that met the above conditions. 
     */
     public static void main(String[] args) {
         int min = 1;
         int max = 1000;
         int numbers = 0;
         int result = 0;
         for (int i = 1;((i>=min)&&(i<=max));i++){
             if (numbers>=3) {
                 if ((i % 3 == 0) && (i % 5 == 0)) {
                     result += i;
                     System.out.println(i);
                 }
             }
             numbers++;
         }
         System.out.println("The total sum of all the numbers is: "+result);
     }
}
