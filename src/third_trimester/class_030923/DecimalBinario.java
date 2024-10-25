package third_trimester.class_030923;

import java.util.Scanner;

public class DecimalBinario {
    public static int decimalBinario(int numero){
        int resto=numero%2;
        if (numero>=2){
            System.out.print(decimalBinario(numero/2));
        }
        return resto;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = userInput.nextInt();
        System.out.println(decimalBinario(numero));
    }
}
