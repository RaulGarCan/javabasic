package second_trimester.class_122122;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
/*      String letraA = "animales";
        String letraC = "animal";
        System.out.println(letraA.compareTo(letraC));
        String texto1 = "El perro de San Roque no tiene rabo";
        String texto2 = "Cuidado con el perro";
        boolean resultado = texto1.regionMatches(3, texto2, 15, 5);
        // regionMatches(inicio primer texto, texto2, inicio segundo texto, longitud comparación)
        System.out.println(resultado);*/


/*      //Sistema similar al comando grep
        String[] alertas = {"ALERTA! 19/12/22 archivo1", "ALERTA! 19/12/22 archivo2", "ALERTA! 20/12/22 archivo3"};

        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce la fecha para filtrar el documento de alertas: ");
        String fecha = userInput.nextLine();
        for (int i=0; i<alertas.length; i++) {
            if (fecha.regionMatches(0, alertas[i], 8, 2)) {
                System.out.println(alertas[i]);
            }
        }*/

        /*//Prueba ordenar alfabeticamente Array String
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce el tamaño del Array");
        int size = userInput.nextInt();
        String[] palabras = new String[size];

        for (int i=0; i< palabras.length; i++){
            System.out.print("Introduce una palabra en el Array");
            palabras[i] = userInput.next();
        }

        for (int j=0; j<palabras.length; j++) {
            for (int k=0; k< palabras.length; k++){
                if (palabras[j].compareTo(palabras[k])<0){

                }
            }
        }*/
        String textoA = "    El perro de San Roque no tiene rabo.\t";
        String textoB = "Va seguido";
        //textoB = textoA.substring(3, 8);
        //System.out.println(textoB);
        System.out.println(textoB+textoA.strip()+textoB);

        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = userInput.next();
        System.out.print("Introduce la primera palabra: ");
        String palabra2 = userInput.next();

        if (palabra1.length()>palabra2.length()){
            System.out.println(palabra1);
        } else {
            System.out.println(palabra2);
        }
    }
}
