package second_trimester.class_011723;

import java.util.Scanner;

public class Ejercicio6_9 {
    /*
        Actividad 6.9: introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
        Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena <<fin>> escrita con cualquier
        combinación de mayúsculas y minúsculas. La cadena <<fin>> no aparecerá en la frase final.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String palabra = "";
        String fraseResultado = "";
        while (!(palabra.equalsIgnoreCase("fin"))) {
            fraseResultado+=palabra+" ";
            do {
                System.out.print("Introduce una palabra: ");
                while (userInput.hasNextInt() || userInput.hasNextDouble()) {
                    System.out.print("No has introducido una palabra. Vuelve a intentarlo: ");
                    userInput.nextLine();
                }
                palabra = userInput.nextLine().strip();
            } while (palabra.split(" ").length > 1);
        }
        System.out.println(fraseResultado.strip());
    }
}
