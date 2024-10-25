package other;

import java.util.Scanner;
public class KeyboardIn {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String yourname = keyboard.nextLine();
        System.out.println("Tu nombre es: "+yourname);
    }
}