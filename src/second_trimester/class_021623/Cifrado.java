package second_trimester.class_021623;

import java.util.Scanner;

public class Cifrado {
    /*
        Actividad 7.17: El cifrado César es una forma sencilla de modificar un texto para que no sea entendible a quines no conocen el código.
        Este cifrado consiste en modificar cada letra de un texto por otra que se encuentra en el alfabeto n posiciones detrás.

        Por ejemplo, para un valor de n igual a 3, la letra a se codifica con la d, y la letra q se codifica con la x.
        En el caso de que una letra exceda a la z, seguiremos de forma circular volviendo a contar desde el principio. Solo se cifrarán las letras, mayúsculas y minúsculas.

        Realiza una clase que:

        1.- Con un método estático devuelva cifrado el texto que se le pasa con una paso de n letras.
        2.- Con un método estático que devuelva el texto no cifrado que se le pasa el texto cifrado con un paso de n letras.
     */
    public static String cifrarTexto(String inputTexto, int saltos){
        String textoCifrado = "";
        for (int i=0; i<inputTexto.length(); i++){
            if (!(Character.isSpaceChar(inputTexto.charAt(i)))){ // Omite espacios en blanco
                int asciiLetra = inputTexto.charAt(i);
                //System.out.println(asciiLetra);
                for (int j=0; j<saltos; j++){ // Hace los saltos para cada caracter
                    if (asciiLetra+1>122) { // Pone a 96 (valor anterior al caracter 'a' que es 97 en ASCII)
                        asciiLetra=96;
                    }
                    asciiLetra++;
                }
                textoCifrado += (char) asciiLetra;
                //System.out.println((int)textoCifrado.charAt(i));
            } else {
                textoCifrado += " ";
            }
        }
        return textoCifrado;
    }
    public static String descrifrarTexto(String textoCifrado, int saltosCifrado){
        String textoDescrifrado = "";
        for (int i=0; i<textoCifrado.length(); i++){
            if (!(Character.isSpaceChar(textoCifrado.charAt(i)))){ // Omite espacios en blanco
                int asciiLetra = textoCifrado.charAt(i);
                //System.out.println(asciiLetra);
                for (int j=0; j<saltosCifrado; j++){ // Hace los saltos para cada caracter
                    if (asciiLetra-1<97) { // Pone a 123 (valor siguiente al caracter 'z' que es 122 en ASCII)
                        asciiLetra=123;
                    }
                    asciiLetra--;
                }
                textoDescrifrado += (char) asciiLetra;
                //System.out.println((int)textoCifrado.charAt(i));
            } else {
                textoDescrifrado += " ";
            }
        }
        return textoDescrifrado;
    }

    public static void main(String[] args) {
        // a = 97    z = 122
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce un texto para cifrar: ");
        String texto = userInput.nextLine().toLowerCase().strip();
        System.out.print("Introduce un número de saltos [1, 27]: ");
        int saltosLetras = userInput.nextInt();
        while (saltosLetras<1 || saltosLetras>27){
            System.out.print("Introduce un número de saltos [1, 27]: ");
            saltosLetras = userInput.nextInt();
        }
        /*for (int i =0; i<texto.length(); i++){
            System.out.println((int)texto.charAt(i));
        }*/
        //System.out.println("");
        System.out.println("\nEl texto cifrado es: \""+cifrarTexto(texto, saltosLetras)+"\"");
        System.out.println("El texto descrifrado es: \""+descrifrarTexto(cifrarTexto(texto, saltosLetras), saltosLetras)+"\"");
    }
}
