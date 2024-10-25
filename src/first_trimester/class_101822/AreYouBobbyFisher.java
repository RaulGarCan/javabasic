package class_101822;

import java.util.Scanner;
public class AreYouBobbyFisher {
    /*
    Create a Java class named clase_181022.AreYouBobbyFisher that asks the user for their name and if
    the name is “Bobby” then print “I finally found you”  and if the name is not “Bobby” then print
    “I am still looking for him.
    NOTE: use a method that checks for the name typed in by the user.
     */
    public static String checkName(String nameInput){
        String result = "";
        final String expectedName = "Bobby";
        if (expectedName.equals(nameInput)){
            result = "I finally found you";
        } else {
            result = "I am still looking for him.";
        }
        return result;
    }
    public static void main(String[] args){
        Scanner userName = new Scanner(System.in);
        System.out.print("Introduce your name: ");
        String name = userName.nextLine();
        System.out.println(checkName(name));
    }
}