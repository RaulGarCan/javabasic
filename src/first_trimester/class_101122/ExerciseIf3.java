package class_101122;

import java.util.Scanner;
public class ExerciseIf3 {
    /*
    Generate a random int number less than 10 and print the grades:
0 < grade < 5 : insuficiente.
5 <= grade <7: bien.
7 <= grade <9: notable
9 <= grade <=10: sobresaliente.
     */

    public String examResult(int grade){
        String gradeResult = "";
        final int FIXED0 = 0;
        final int FIXED5 = 5;
        final int FIXED7 = 7;
        final int FIXED9 = 9;


        if ((grade>=FIXED0)&&(grade<FIXED5)){
            gradeResult = "Insuficiente";
        }else if((grade>=FIXED5)&&(grade<FIXED7)){
            gradeResult = "Bien";
        }else if((grade>=FIXED7)&&(grade<FIXED9)){
            gradeResult = "Notable";
        }else {
            gradeResult = "Sobresaliente";
        }
        return gradeResult;
    }
    public static void main(String[] args){
        Scanner gradeInput = new Scanner(System.in);
        System.out.println("Introduce your grade: ");
        int grade = gradeInput.nextInt();
        System.out.println("My grade is "+grade);

        ExerciseIf3 myExamResult = new ExerciseIf3();
        String myGradeResult = myExamResult.examResult(grade);
        System.out.println(myGradeResult);
    }
}