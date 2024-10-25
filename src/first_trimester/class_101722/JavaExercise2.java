package class_101722;

public class JavaExercise2 {
    /*
    Exercise 2: write a public and static method called checkNumber with an int parameter number.
    The method should not return any value and print out:
        positive if the parameter number is > 0.
        negative if the parameter number is <0.
        zero if the parameter number is equal to zero.
     */
    public static void checkNumber(int number){
        final int FIXED0 = 0;
        final String POSITIVE = "Positive";
        final String NEGATIVE = "Negative";
        final String ZERO = "Zero";
        if(number>FIXED0){
            System.out.println(POSITIVE);
        } else if(number<0) {
            System.out.println(NEGATIVE);
        } else {
            System.out.println(ZERO);
        }
    }
    public static void main(String[] args){
        final int FIXEDRANDOM = 10;
        int numberInput = (int)(-FIXEDRANDOM*Math.random()+FIXEDRANDOM*Math.random());
        System.out.println(numberInput);
        checkNumber(numberInput);
    }
}
