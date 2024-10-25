package second_trimester.class_112922;

import java.util.Scanner;

public class Ejercicio2 {
     /*
        Dado el siguiente array {1,0,-9,4,6,7,9,22,31,64,99,-11, 20,77,27, 10,41, 89,24,6}.
        Crear un método que reciba un número int menor que 20 y devuelva un subarray con el número de elementos que se ha introducido como parámetro del método.
     */
    public static int[] elementosBuscados(int nElementos){
        int[] arrayPadre = {1,0,-9,4,6,7,9,22,31,64,99,-11, 20,77,27, 10,41, 89,24,6};
        int[] elementosArray = new int[nElementos];
        for (int i=0; i<elementosArray.length; i++){
            elementosArray[i] = arrayPadre[i];
        }
        return elementosArray;
    }
    public static boolean checkInput(int input){
        if (input>=1 && input <=20){
            return true;
        } else {
            System.out.println("Por favor introduzca un número perteneciente al rango 0,20");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nElementos = -1;

        do {
            System.out.print("Introduzca el número de elementos del Array que desea visualizar: ");
            while(!userInput.hasNextInt()) {
                System.out.println("Error, el valor introducido no es un int");
                System.out.print("Introduzca un número int: ");
                userInput.nextLine();
            }
            nElementos = userInput.nextInt();
            userInput.nextLine();
        }while(!checkInput(nElementos));

        for (int j=0; j<elementosBuscados(nElementos).length; j++) {
            System.out.println(elementosBuscados(nElementos)[j]);
        }
    }
}
