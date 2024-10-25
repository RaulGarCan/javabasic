package class_102622;

import java.util.Scanner;

public class SwitchExercise1 {
    /*
        Exercise 1: create a switch statement using a char type of primitive variable for the switch evaluation.
        Ask the user to type in any of the following letters: A, B, C, D and E. The program should be case sensitive.
            Display a message if any of these letters are found and then break.
            Add a default which displays a message saying not found.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce your letter withing the available values A, B, C, D and E: ");
        char character1 = userInput.next().charAt(0);

        switch(character1){
            case 'A': case 'a':
                System.out.println("Letter A found");
                break;
            case 'B': case 'b':
                System.out.println("Letter B found");
                break;
            case 'C': case 'c':
                System.out.println("Letter C found");
                break;
            case 'D': case 'd':
                System.out.println("Letter D found");
                break;
            case 'E': case 'e':
                System.out.println("Letter E found");
                break;
            default:
                System.out.println("Letter not found");
        }
    }
}
