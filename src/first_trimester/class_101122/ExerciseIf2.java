package class_101122;

import java.util.Scanner;
public class ExerciseIf2 {
    /*
    The government is issuing the following taxation system. If the family income is:
Greater than 0 and less 10000€ the taxation is the 5% of the income.
Greater and equal than 10000 and less than 20000 the taxation is the 10% of the income.
Greater and equal than 20000 and less than 50000 the taxation is the 20% of the income.
Greater and equal than 50000 and less than 70000 the taxation is the 30% of the income.
Greater and equal than 70000 the taxation is the 50% of the income.
	For this exercise generate an int random number greater than 0 and less than 100000 for the family income.
For each income print the final taxation = income*% taxation.
     */
    public double taxCalculate(int income){
        double taxation;
        final int FIXED0 = 0;
        final int FIXED10000 = 10000;
        final int FIXED20000 = 20000;
        final int FIXED50000 = 50000;
        final int FIXED70000 = 70000;
        final int FIXED100 = 100;

        if((income>FIXED0)&&(income<FIXED10000)){
            taxation = 5d;
        }else if((income>=FIXED10000)&&(income<FIXED20000)){
            taxation = 10d;
        }else if((income>=FIXED20000)&&(income<FIXED50000)){
            taxation = 20d;
        }else if((income>=FIXED50000)&&(income<FIXED70000)){
            taxation = 30d;
        }else{
            taxation = 50d;
        }
        double taxResult = income*(taxation/FIXED100);
        return taxResult;
    }
    public static void main(String[] args){

        Scanner incomeInput = new Scanner(System.in);
        System.out.println("Introduce your family income: ");
        int familyIncome = incomeInput.nextInt();
        System.out.println("The family income is: "+familyIncome+"€");

        ExerciseIf2 taxCalc = new ExerciseIf2();
        double taxes = taxCalc.taxCalculate(familyIncome);
        System.out.println(taxes+"€");

    }
}
