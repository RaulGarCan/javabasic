package second_trimester.class_122122;

import java.util.Scanner;

public class PasswordGame2 {
    /*
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
        char[] aciertos = new char[password.length()];
        for (int l=0; l<aciertos.length; l++){
            aciertos[l] = '*';
        }
        while (!(intento.equals(password))){
            System.out.println("La contraseña introducida es errónea! La longitud de la contraseña es de: "+password.length());
            for (int i=0; i<password.length(); i++){
                for (int j=0; j<password.length(); j++){
                    if (intento.toCharArray()[j]==password.toCharArray()[i]){
                        aciertos[i] = password.toCharArray()[i];
                    }
                }
            }
            for (int k=0; k<aciertos.length; k++){
                System.out.print(aciertos[k]+" ");
            }
            System.out.print("\nIntentalo de nuevo: ");
            intento = userInput.next();
            userInput.nextLine();
        }
        System.out.println("Correcto! La contraseña era: "+password);
    }
}
