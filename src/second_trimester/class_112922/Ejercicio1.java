package second_trimester.class_112922;

import java.util.Scanner;

public class Ejercicio1 {
    /*
    Realizar un programa que pregunte al usuario que introduzca el número de valores int que va a introducir por el
    teclado y posteriormente el usuario irá insertando valor por valor hasta llegar al número de veces que ha indicado el usuario.
En cada inserción el usuario comprobará que lo introducido no es un número dentro del rango (0,100), no decimal,
 ni una cadena de caracteres, en tal caso se le volverá a preguntar de forma recursiva hasta que el valor introducido
 sea un int. Este proceso se comprobará para cada uno de los valores introducidos hasta llegar al último valor.
Sólo se contarán las veces que el usuario introduzca valores int válidos, en los caso contrarios no se contará valor int.
Los valores int válidos serán guardados en un array que se llamará arrayInt.
Se crearán las funciones:

sumatorioArray: que será un método no estático, que devuelva un int como el sumatorio de todos los números.
Tendrá como parámetro de entrada un array a partir del cual se calculará el sumatorio.

mediaArray: que será un método no estático, que devuelva un double como la media de todos los números.
Tendrá como parámetro de entrada un array a partir del cual se calculará la media de todos los números. Este método llamará
al método sumatorioArray para el cálculo de la media de todos los números y

maximoNumeroArray: será un método no estático que devolverá un int como el número máximo de todo el array.
Tendrá como parámetro de entrada un array a partir del cual se calculará el número mayor.

minimoNumeroArray: será un método no estático que devolverá un int como el número mínimo de todo el array.
Tendrá como parámetro de entrada un array a partir del cual se calculará el número menor.
     */
    public static Scanner userInput = new Scanner(System.in);
    public int sumatorioArray(int[] input){
        int result = 0;
        for (int i=0; i<input.length; i++){
            result+=input[i];
        }
        return result;
    }
    public double mediaArray(int[] input){
        double result;
        result = ((double)(sumatorioArray(input)))/input.length;
        return result;
    }
    public int maximoNumeroArray(int[] input){
        int max = input[0];
        for (int i = 0; i<input.length; i++){
            if (input[i]>max){
                max = input[i];
            }
        }
        return max;
    }
    public int minimoNumeroArray(int[] input){
        int min = input[0];
        for (int i = 0; i<input.length; i++){
            if (input[i]<min){
                min = input[i];
            }
        }
        return min;
    }
    public static boolean checkInput(int input, int min, int max){
        if (input>min && input <max){
            return true;
        } else {
            System.out.println("Por favor introduzca un número perteneciente al rango "+min+", "+max);
            userInput.nextLine();
            return false;
        }
    }
    public static void main(String[] args) {
        int size;
        do {
            System.out.print("Introduzca el número de valores que se va a introducir: ");
            while(!userInput.hasNextInt()) {
                System.out.println("Error, el valor introducido no es un int");
                System.out.print("Introduzca el número de valores que se va a introducir: ");
                userInput.nextLine();
            }
            size = userInput.nextInt();
        }while(!checkInput(size, 0, 20));

        int[] arrayInt = new int[size];
        for (int i = 0; i<size; i++){
            do {
                System.out.print("Introduzca un número int: ");
                while(!userInput.hasNextInt()) {
                    System.out.println("Error, el valor introducido no es un int");
                    System.out.print("Introduzca un número int: ");
                    userInput.nextLine();
                }
                arrayInt[i] = userInput.nextInt();
            }while (!checkInput(arrayInt[i], 0, 100));
        }
        for (int j = 0; j<size; j++) {
            System.out.println(arrayInt[j]);
        }

        Ejercicio1 funciones = new Ejercicio1();
        System.out.println("El sumatorio de los valores del Array es: "+funciones.sumatorioArray(arrayInt));
        System.out.println("La media de los valores del Array es: "+funciones.mediaArray(arrayInt));
        System.out.println("El máximo de los valores del Array es: "+funciones.maximoNumeroArray(arrayInt));
        System.out.println("El mínimo de los valores del Array es: "+funciones.minimoNumeroArray(arrayInt));
    }
}
