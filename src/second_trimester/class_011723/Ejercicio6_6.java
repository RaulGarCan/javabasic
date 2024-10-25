package second_trimester.class_011723;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6_6 {
    /*
        Actividad 6.6: escribir un programa que pida el nombre completo al
        usuario y lo muestre sin vocales (mayúsculas, minúsculas y acentudadas). Por ejemplo "Álvaro Pérez" se mostrará "lvr Prz".
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce tu nombre y apellidos: ");
        while (userInput.hasNextInt() || userInput.hasNextDouble()){
            System.out.println("No has introducido una palabra, inténtalo de nuevo");
            System.out.print("Introduce tu nombre y apellidos: ");
            userInput.nextLine();
        }
        String nombreUsuario = userInput.nextLine().strip();
        char[] cadenaCaracteres = nombreUsuario.toLowerCase().toCharArray();
        char[] cadenaResultante = new char[]{};
        boolean [] vocalesCadena= new boolean[cadenaCaracteres.length];
        for (int i=0; i<nombreUsuario.length(); i++){
            switch (cadenaCaracteres[i]){
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'á': case 'é': case 'í': case 'ó': case 'ú':
                    vocalesCadena[i] = true;
                    break;
            }
        }
        int contador = 0;
        for (int j=0; j<nombreUsuario.length(); j++){
            if (!(vocalesCadena[j])){
                cadenaResultante = Arrays.copyOf(cadenaResultante,cadenaResultante.length+1);
                cadenaResultante[contador] = cadenaCaracteres[j];
                contador++;
            }
        }
        for (int k=0; k<cadenaResultante.length; k++){
            System.out.print(cadenaResultante[k]);
        }
    }
}
