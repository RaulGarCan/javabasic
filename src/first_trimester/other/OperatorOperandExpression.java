package other;

public class OperatorOperandExpression {
    public static void main(String[] args){
        /*
        int firstNumber =1, secondNumber = 2;
        int twoNumberSum = firstNumber + secondNumber; // 1 + 2 = 3
        System.out.println("The sum of the numbers "+firstNumber+ " and "+secondNumber +" is: "+twoNumberSum);

        int previousValueSum = twoNumberSum; // previousValueSum = 3
        System.out.println("The value of the variable previousValueSum is: "+previousValueSum);
        twoNumberSum = twoNumberSum +1; // 3 + 1 = 4
        System.out.println("3 + 1 = "+twoNumberSum);
        System.out.println("The value of this variable previousValueSum is: "+previousValueSum);
        */
        // Auto increment and decrement
        int number1 = 1;
        /*
        System.out.println("The value of the variable number1 is: "+number1);
        number1++;
        System.out.println("The value of the autoincrement variable number1 is: "+number1);
        number1++;
        System.out.println("The value of the autoincrement variable number1 is: "+number1);
        number1--;
        System.out.println("The value of the autodecrement variable number1 is: "+number1);
        number1--;
        System.out.println("The value of the autodecrement variable number1 is: "+number1);
        number1--;
        System.out.println("The value of the autodecrement variable number1 is: "+number1);
        number1--;
        */
        System.out.println("The value of the variable number1 is: "+number1);
        // Pre-increment: increases the value of the variable first and then print the value.
        // System.out.println("++number1 is: "+ ++number1);
        // System.out.println("number1 is: "+number1);

        // Post-increment print the value and then increment the value of the variable.
        System.out.println("number1++ is: "+number1++);
        System.out.println("number1 is: "+number1);
    }
}
