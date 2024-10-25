package class_111422;

public class Exercise10 {
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
        int counter = 1;
        while (((counter>=min)&&(counter<=max))){
            if (numbers>=3) {
                if ((counter % 3 == 0) && (counter % 5 == 0)) {
                    result += counter;
                    System.out.println(counter);
                }
            }
            numbers++;
            counter++;
        }
        System.out.println("The total sum of all the numbers is: "+result);
    }
}
