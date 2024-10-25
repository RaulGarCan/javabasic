package second_trimester.class_011723;

import java.util.Scanner;

public class Ejercicio6_7 {
    /*
        Actividad 6.7: diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuántas veces aparece la palabra en la frase.
     */
    public static int buscarPalabra(String palabra, String frase){
        int vecesPalabra = 0;
        String[] palabrasFrase = frase.split(" ");
        for (int i=0; i<palabrasFrase.length; i++){
            if (palabrasFrase[i].equals(palabra)){
                vecesPalabra++;
            }
        }
        return vecesPalabra;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String palabra = "";
        String frase = "";
        do {
            System.out.print("Introduce una palabra: ");
            while (userInput.hasNextInt() || userInput.hasNextDouble()){
                System.out.print("No has introducido una palabra. Vuelve a intentarlo: ");
                userInput.nextLine();
            }
            palabra = userInput.nextLine().strip();
        }while (palabra.split(" ").length>1);
        do {
            System.out.print("Introduce una frase: ");
            while (userInput.hasNextInt() || userInput.hasNextDouble()){
                System.out.print("No has introducido una frase. Vuelve a intentarlo: ");
                userInput.nextLine();
            }
            frase = userInput.nextLine().strip();
        }while (!(frase.split(" ").length>1));
        System.out.println("La palabra \""+palabra+"\" está repetida "+buscarPalabra(palabra, frase)+" veces.");
    }
}
