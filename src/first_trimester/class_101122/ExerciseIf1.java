package class_101122;

import java.util.Scanner;
public class ExerciseIf1 {
    /*
    Generate a random int number between 0 and 10 and create a boolean variable.
    If the number generated is less than 5 assign the boolean variable true and if it is greater and
    equal than 5 assign the boolean a false value.
     */
    public boolean passExam(int grade){
        boolean myBoolean;
        final int FIXED5 = 5;

        if(grade<FIXED5){
            myBoolean = false;
        }
        else{
            myBoolean = true;
        }
        return myBoolean;
    }
    public static void main(String[] args){
        Scanner userGrade = new Scanner(System.in);
        System.out.println("Introduce your grade: ");
        int myGrade = userGrade.nextInt();

        ExerciseIf1 pass = new ExerciseIf1();
        boolean passResult = pass.passExam(myGrade);

        System.out.println("My grade is "+myGrade+" so the pass result is: "+passResult);
    }
}