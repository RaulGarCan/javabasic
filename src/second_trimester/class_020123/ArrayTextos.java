package second_trimester.class_020123;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ArrayTextos {
    /*
        Crear un array dinamico que almacene objetos de tipo Texto
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Texto[] arrayTextos = new Texto[]{};
        int contador = 0;
        do {
            System.out.print("Introduce tu texto: ");
            String textosUsuario = userInput.nextLine().strip();
            if (textosUsuario.equalsIgnoreCase("salir")){
                System.out.println("Cerrando el programa...");
                break;
            }
            Date fechaCreacion = new Date();
            Texto texto = new Texto(fechaCreacion, textosUsuario);
            arrayTextos = Arrays.copyOf(arrayTextos, arrayTextos.length+1);
            arrayTextos[contador] = texto;
            contador++;
        }while(true);
        for (int i=0; i<arrayTextos.length; i++){
            arrayTextos[i].mostrarInformacion();
        }
    }
}
