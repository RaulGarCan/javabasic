package class_101822;

import java.util.Scanner;
public class YourNameIs {
    /*
    Create a Java class named clase_181022.YourNameIs that asks the user for their name and then print:
    “Your name is <<name introduced by the user>>”.
     */
    public static void main(String[] args){
        Scanner userName = new Scanner(System.in);
        System.out.println("Introduce your name: ");
        String name = userName.nextLine();
        System.out.println("Your name is "+name);
    }
}