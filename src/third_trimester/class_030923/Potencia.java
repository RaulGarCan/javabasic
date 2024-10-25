package third_trimester.class_030923;

import java.util.Scanner;

public class Potencia {
    public static int potencia(int numero1, int numero2){
        if (numero2==0){
            return 1;
        }
        return numero1*potencia(numero1, numero2-1);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero1 = userInput.nextInt();
        System.out.print("Introduce un número: ");
        int numero2 = userInput.nextInt();
        System.out.println(potencia(numero1, numero2));
    }
}
