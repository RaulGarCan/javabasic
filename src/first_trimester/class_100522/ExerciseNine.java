package class_100522;

import java.util.Scanner;

public class ExerciseNine {
    /*
    Write a java program that print the ascii value
    of a given character.
    */
    public static void printAscii(char character1){
        int ascii = character1;
        System.out.println("The ascii value for the given character "+character1+" is "+ascii);
    }
    public static void main(String[] args){
        //Scanner userInput = new Scanner(System.in);
        //System.out.print("Introduce your character: ");
        //char character1 = userInput.next;
        char character1 = 'g';
        printAscii(character1);
    }
}