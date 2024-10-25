package second_trimester.class_112322;

import java.util.Scanner;

public class FindingNameOnArray {
     /*
        Exercise Two:You have saved 10 names of friends in an array. The names are as follow:
        "Javier","Mohamed","Younes","Raul","Maria","Pedro","Ahmed","Boris".
        The user has 10 times to find any of the names of your friend.
        If the user guess any particular name you have to print a message saying "Congratulations,
        you have found one of my friend's name",otherwise print "Not this time, try again".
        When the program finishes print how may names has the user guessed.
     */

    static int remainingTries = 10;
    static int guessedPosition = 0;


    public static void main(String[] args) {
        String[] myName = {"Javier", "Mohamed", "Younes", "Raul", "Maria", "Pedro", "Ahmed", "Boris", "Diana", "David"};
        String[] guessedNames = new String [10];
        Scanner userInput = new Scanner(System.in);
        int guessCounter = 0;
        String nullKeyword = "null";

        do {
            System.out.print("Introduce a name: ");
            String inputTry = userInput.nextLine().toUpperCase();

            for (int j = 0; j < myName.length; j++) {
                if (inputTry.equals(myName[j].toUpperCase())) {
                    System.out.println("Congratulations you found one of my friends name!");
                    guessedNames[guessedPosition] = myName[j].toUpperCase();
                    guessedPosition++;
                    guessCounter++;
                    break;
                }
                if (j == myName.length-1) {
                    remainingTries--;
                    System.out.println("Wrong, try again. Remaining tries: " +remainingTries);
                }
                if (remainingTries==0){
                    System.out.println("I'm sorry, you ran out of tries.");
                }
            }
            if (guessCounter==10){
                break;
            }

        }while (remainingTries>0);
        if (guessCounter==0) {
            System.out.println("You guessed a total of " + guessCounter + " names, maybe next time buddy!");
        } else {
            System.out.println("You guessed a total of " + guessCounter + " names, well done!");
            System.out.println("This is the list of the names you guessed: ");
            for (int k = 0; k < 10; k++) {
                if (guessedNames[k]!=null) {
                    System.out.print(guessedNames[k] + " ");
                }
            }
        }
    }
}
