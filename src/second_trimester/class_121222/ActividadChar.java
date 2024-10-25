package second_trimester.class_121222;

public class ActividadChar {
    /*
        Escribir un programa que muestre todos los caracteres Unicode junto a su code point, cuyo valor esté comprendido entre \u0000 y \uFFFF
    */
    public static void main(String[] args) {
        char inicio = '\u0000';
        for(int i = 0; i<=Character.MAX_VALUE; i++){
            inicio++;
            System.out.println(inicio);
        }
        /*
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++){
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u"+xxxx+": "+(char)codePoint);
        }
        */
    }
}
