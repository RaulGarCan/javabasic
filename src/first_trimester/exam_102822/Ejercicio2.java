package exam_102822;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    (3 puntos) Crear un programa que pida al usuario que introduzca 4 números enteros de tipo int distintos
    que sean mayores que 0 y menores o iguales a 100.
Una vez introducidos los 4 números comprobar que son distintos, en caso contrario comunicarle al usuario
 que los números no son iguales y terminar el programa.
En el caso de que los 4 números sean distintos, comprobar que están dentro del rango (0,100), si no lo están,
imprimir un mensaje al usuario de que están fuera de rango y terminar el programa. En el caso de que estén dentro
del rango llamar a una función que recoja los 4 números y que imprima primero el segundo y después el tercero mayor en orden.
Por ejemplo, de los números 50, 39, 61, 4, se debería imprimir primero el segundo en orden, el 39 y después el tercero en orden, el 50.
     */
    static int mayor1;
    static int mayor2;
    static int mayor3;
    public static void sonIguales(int number1, int number2, int number3, int number4) {
        if (((number1 != number2) && (number1 != number3)) && (number1 != number4)) {
            if (((number1 > 0) && (number1 <= 100))) {
                if (((number2 > 0) && (number2 <= 100))) {
                    if (((number3 > 0) && (number3 <= 100))) {
                        if (((number4 > 0) && (number4 <= 100))) {
                            imprimirNumeros(number1, number2, number3, number4);
                        } else {
                            System.out.println("Los números están fuera de rango");
                        }
                    } else {
                        System.out.println("Los números están fuera de rango");
                    }
                } else {
                    System.out.println("Los números están fuera de rango");
                }
            } else {
                System.out.println("Los números están fuera de rango");
            }
        } else {
            System.out.println("Los números son iguales");
        }
    }
    public static void imprimirNumeros ( int number1, int number2, int number3, int number4){
        if ((number1 > number2) && (number1 > number3) && (number1 > number4)) {
            mayor1 = number1;
            if ((number2>number3)&&(number2>number4)){
                mayor2 = number2;
                if (number3>number1){
                    mayor3 = number3;
                } else {
                    mayor3 = number1;
                }
            } else if((number3>number2)&&(number3>number1)){
                mayor2 = number3;
                if(number2>number1){
                    mayor3 = number2;
                } else {
                    mayor3 = number1;
                }
            } else {
                mayor2 = number4;
                if (number3>number2){
                    mayor3 = number3;
                } else {
                    mayor3 = number2;
                }
            }
        } else if (((number2 > number1) && (number2 > number3) && (number2 > number4))) {
            mayor1 = number2;
            if ((number1>number3)&&(number1>number4)){
                mayor2 = number1;
                if(number3>number4){
                    mayor3 = number3;
                } else {
                    mayor3 = number4;
                }
            } else if((number3>number1)&&(number3>number4)){
                mayor2 = number3;
                if(number1>number4){
                    mayor3 = number1;
                } else {
                    mayor3 = number4;
                }
            } else {
                mayor2 = number4;
                if (number1>number3){
                    mayor3 = number1;
                } else {
                    mayor3 = number3;
                }
            }
        } else if (((number3 > number1) && (number3 > number2) && (number3 > number4))) {
            mayor1 = number3;
            if ((number2>number1)&&(number2>number4)){
                mayor2 = number2;
                if (number1>number4){
                    mayor3 = number1;
                } else {
                    mayor3 = number4;
                }
            } else if((number1>number2)&&(number1>number4)){
                mayor2 = number1;
                if (number2>number4){
                    mayor3 = number2;
                } else {
                    mayor3 = number4;
                }
            } else {
                mayor2 = number4;
                if (number1>number2){
                    mayor3 = number1;
                } else {
                    mayor3 = number4;
                }
            }
        } else {
            mayor1 = number4;
            if ((number2>number1)&&(number2>number3)){
                mayor2 = number2;
                if (number1>number3){
                    mayor2 = number1;
                } else {
                    mayor2 = number3;
                }
            } else if((number3>number1)&&(number3>number2)){
                mayor2 = number3;
                if(number1>number2){
                    mayor3 = number1;
                } else {
                    mayor3 = number2;
                }
            } else {
                mayor2 = number1;
                if (number2>number3){
                    mayor3 = number2;
                } else {
                    mayor3 = number3;
                }
            }
        }
        System.out.println(mayor2);
        System.out.println(mayor3);
    }
    public static void main (String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce tu primer número: ");
        int number1 = userInput.nextInt();
        System.out.print("Introduce tu segundo número: ");
        int number2 = userInput.nextInt();
        System.out.print("Introduce tu tercer número: ");
        int number3 = userInput.nextInt();
        System.out.print("Introduce tu cuarto número: ");
        int number4 = userInput.nextInt();

        sonIguales(number1, number2, number3, number4);
    }
}
