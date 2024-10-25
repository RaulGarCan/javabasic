package third_trimester.class_030823;

import java.util.Scanner;

public class Factorial {
    public static int factorialFor(int numero){
        int resultado = 1;
        for(int i=1; i<=numero; i++){
            resultado*=i;
        }
        return resultado;
    }
    public static int factorialWhile(int numero){
        int resultado = 1;
        int contador = 1;
        while(contador<=numero){
            resultado*=contador;
            contador++;
        }
        return resultado;
    }
/*    public static int factorialRecursiv(int numero, int contador, int resultado){
        resultado*=contador;
        contador++;
        if (contador<=numero){
            resultado = factorialRecursiv(numero, contador, resultado);
        }
        return resultado;
    }*/
    public static int factorialRecursiv(int numero){
        if(numero==1){
            return 1;
        }
        return numero*factorialRecursiv(numero-1);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        while (!userInput.hasNextInt()){ // Evitar entrada de no ints
            System.out.print("Introduce un número entero: ");
            userInput.next();
        }
        int numero = userInput.nextInt();
        System.out.println("El resultado del factorial con for es: "+factorialFor(numero));
        System.out.println("El resultado del factorial con while es: "+factorialWhile(numero));
        //System.out.println("El resultado del factorial con recursividad es: "+factorialRecursiv(numero, 1, 1));
        System.out.println("El resultado del factorial con recursividad es: "+factorialRecursiv(numero));
    }
}
