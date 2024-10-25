package class_111422;

public class Exercise8 {
    /*
        Calculate the prime numbers greater than 1 and less than 100.
     */
    public static void main(String[] args) {
        int divisorsCounter = 0;
        int numbers = 2;
        while (numbers<=100) {
            int counter2 = 2;
            while (counter2<numbers) {
                if (numbers % counter2 == 0) {
                    divisorsCounter++;
                }
                counter2++;
            }
            if (divisorsCounter == 0) {
                    System.out.println("The number " + numbers + " is prime.");
            }
            divisorsCounter = 0;
            numbers++;
        }
    }
}
