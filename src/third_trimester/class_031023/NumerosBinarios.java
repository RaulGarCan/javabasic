package third_trimester.class_031023;

import java.util.Scanner;

public class NumerosBinarios {
    public static String decimalBinario(int numero){
        if (numero<=1){
            return decimalBinario(numero/2)+numero%2;
        }
        return String.valueOf(decimalBinario(numero/2));
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = userInput.nextInt();
        System.out.println(decimalBinario(numero));
    }
}
