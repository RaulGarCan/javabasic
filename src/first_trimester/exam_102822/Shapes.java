package exam_102822;

import java.util.Scanner;

public class Shapes {
    /*
    Crear una clase llamada Shapes que pregunte al usuario:
Que inserte el nombre de una de las siguientes figuras: cuadrado y rectángulo. Los nombres deberań
ir sin acentos y mediante una método llamado checkUserInput se comprobará que el nombre introducido
por el usuario corresponde con uno de los dos nombres posibles. Dicho método será sensible a las mayúsculas y minúsculas.
Sólo se podrá crear un sólo objeto Scanner para recoger la entrada del usuario. Además se llamará al
método checkUserInput de forma recursiva hasta que el usuario inserte correctamente uno de los dos nombres,
en caso contrario se le volverá a preguntar al usuario que vuelva insertar uno de los nombres permitidos.
Una vez que el usuario haya introducido el nombre de la figura correctamente se preguntará para el caso
del cuadrado su lado y para el rectángulo la base y la altura. Las variables que se esperán para dichos valores son de tipo int.
Se comprobará mediante un método llamado checkUserInput  de forma recursiva que los valores introducidos
son mayores que cero y que son menores al máximo permitido para los int. Se deberá comprobar recursivamente
que los valores introducidos son correctos dentro del rango válido, en caso contrario se volverá a preguntar
que introduzca los datos para cada caso.
Una vez que los valores introducidos son válidos se calculará para cada caso el área de la figura mediante
sendos métodos llamados areaOfShape que devolverán un double representando el área de la figura.
El programa terminará cuando imprima el área de la figura correspondiente.
NOTA: todos los métodos y variables globales serán public y static.
     */
    public static void checkUserInput(String name1, String name2){
        final String CUADRADO = "cuadrado";
        final String RECTANGULO = "rectangulo";

    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Inserte el nombre de la primera figura: ");
        String name1 = userInput.next();
        System.out.print("Inserte el nombre de la segunda figura: ");
        String name2 = userInput.next();
    }
}
