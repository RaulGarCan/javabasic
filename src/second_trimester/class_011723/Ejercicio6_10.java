package second_trimester.class_011723;

import java.util.Scanner;

public class Ejercicio6_10 {
    /*
        Actividad 6.10: realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que la frase sea igual
        leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: "Dábale arroz a la zorra el abad".
        La vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si no lo fuese.
        Por esto, supondremos que el usuario introduce la frase sin tildes.
     */
    public static boolean esPalindroma(String frase){
        int contadorIguales = 0;
        String fraseSinEspacios = "";
        // Quitar espacios de la frase inicial.
        for (int k=0; k<frase.length(); k++){
            if (!(frase.charAt(k)==' ')){
                fraseSinEspacios+=frase.charAt(k);
            }
        }
        char[] fraseAlReves = new char[fraseSinEspacios.length()];
        int contador = fraseSinEspacios.length()-1;
        System.out.println(fraseSinEspacios);
        // Creamos un char[] que almacena los caracteres en orden inverso.
        for (int i=0; i<fraseSinEspacios.length(); i++){
            fraseAlReves[contador]=fraseSinEspacios.charAt(i);
            contador--;
        }
        System.out.println(fraseAlReves);
        // Comparamos los caracteres de las mismas posiciones para ver si son todos iguales.
        for (int j=0; j<fraseSinEspacios.length(); j++){
            if (fraseAlReves[j]==fraseSinEspacios.charAt(j)){
                contadorIguales++;
            }
        }
        System.out.println(contadorIguales+"/"+fraseSinEspacios.length());
        // Si el porcentaje de igualdad es del 100% se devuelve "true".
        if (contadorIguales==fraseSinEspacios.length()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String palabra = "";
        String frase = "";
        do {
            System.out.print("Introduce una frase: ");
            while (userInput.hasNextInt() || userInput.hasNextDouble()){
                System.out.print("No has introducido una frase. Vuelve a intentarlo: ");
                userInput.nextLine();
            }
            frase = userInput.nextLine().strip().toLowerCase();
        }while (!(frase.split(" ").length>1));
        System.out.println(esPalindroma(frase));
    }
}
