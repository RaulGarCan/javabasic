package second_trimester.class_122122;

import java.util.Scanner;

public class PasswordGame {
     /*con
        Diseñar el juego "Acierta la contraseña". La mecanica del juego es la siguiente: el primer jugador introduce la contraseña;
        a continuacion, el segundo jugador debe teclar palabras hasta que la acierte.
        Realizar dos versiones:

        En la primera se facilita el juego indicando si la palabra introducida es mayor o menor alfabeticamente que la contraseña.

        En la segunda, el programa mostrara la longitud de la contraseña y una cadena con los caracteres acertados en sus
        lugares respectivos y asteriscos en los no acertados.

        *Es necesario contemplar las mayusculas y minusculas como caracteres distintos
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Jugador 1, introduce la contraseña: ");
        String password = userInput.next().strip();
        while (!(password.length()<=10)){
            System.out.println("La contraseña debe tener una longitud máxima de 10 dígitos");
            System.out.print("Jugador 1, introduce la contraseña: ");
            password = userInput.next().strip();
            userInput.nextLine();
        }
        System.out.print("Jugador 2, introduce la contraseña: ");
        String intento = userInput.next().strip();
        while (!(intento.equals(password))){
            if (password.compareToIgnoreCase(intento)<0){
                System.out.println("La palabra introducida es mayor alfabéticamente que la contraseña");
            } else {
                System.out.println("La palabra introducida es menor alfabéticamente que la contraseña");
            }
            System.out.print("Intentalo de nuevo: ");
            intento = userInput.next();
            userInput.nextLine();
        }
        System.out.println("Correcto! La contraseña era: "+password);
    }
}
