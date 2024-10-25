package third_trimester.class_030823;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimos {
    public static boolean esPrimo(int numeroGenerado) {
        int contadorDivisores = 0;
        for (int l = 1; l <= numeroGenerado; l++) {
            if (numeroGenerado % l == 0) {
                contadorDivisores++;
            }
        }
        if (contadorDivisores>2){
            return false;
        } else {
            return true;
        }
    }
    public static void generarNumeros(int numero){
        for (int k=1; k<=numero; k++){
            if (esPrimo(k)){
                System.out.print(k+", ");
            }
        }
    }
    public static int[] nPrimos(int numero){
        int[] numerosPrimos = new int[]{};
        int contadorPosiciones = 0;
        int contadorDivisores = 0;
        for (int i=1; i<=numero; i++){ // Genera los numeros en el rango [1, numero]
            for(int j=1; j<=i; j++) { // Comprueba los divisores en el rango [1, i]
                if (i % j == 0) {
                    contadorDivisores++;
                }
            }
            if(!(contadorDivisores>2)) { // Almacena los números primos
                numerosPrimos = Arrays.copyOf(numerosPrimos, numerosPrimos.length + 1);
                numerosPrimos[contadorPosiciones] = i;
                contadorPosiciones++;
            }
            contadorDivisores=0; // Reinicia el contador de divisores para cada número
        }
        return numerosPrimos;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce un número int: ");
        while(!userInput.hasNextInt()){
            System.out.print("Introduce un número int: ");
            userInput.next();
        }
        int numero = userInput.nextInt();
        System.out.println(Arrays.toString(nPrimos(numero)));
        generarNumeros(numero);
    }
}
