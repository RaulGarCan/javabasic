package second_trimester.class_011723;

public class Ejercicio6_5 {
     /*
        Actividad 6.5: diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. Por ejemplo, la cadena "Hola Mundo" quedaría "odnuM aloH".
     */
    public static char[] invertirCaracteres(char[] cadena){
        char[] cadenaInvertida = new char[cadena.length];
        int contadorDesorden = cadena.length-1;
        for (int i=0; i<cadena.length; i++){
            cadenaInvertida[contadorDesorden] = cadena[i];
            contadorDesorden--;
        }
        return cadenaInvertida;
    }
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        char[] cadenaChar = cadena.toCharArray();
        System.out.println(invertirCaracteres(cadenaChar));
    }
}
