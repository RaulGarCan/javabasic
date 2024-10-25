package second_trimester.class_121322;

public class EjercicioChar {
     /*
        Dado el siguiente texto: “Habia una vez un cordero y una oveja.”
            Calcular el número total de vocales que hay en el texto.
            Calcular el número total de palabras del texto.
     */
     static String palabraGuardada = "";
    public static int cantidadPalabras(char[] input){
        int result = 1;
        for (int i=0; i<input.length; i++){
            if (Character.isSpaceChar(input[i])){
                result++;
            }
        }
        return result;
    }
    public static int cantidadVocales(char[] input){
        int result = 0;
        for (int i=0; i<input.length; i++){
            if ((input[i]=='a' || input[i]=='e') || input[i]=='i' || input[i]=='o' || input[i]=='u'){
                result++;
            }
        }
        return result;
    }
    public static void guardarPalabras(char[] input){
        int size = cantidadPalabras(input);
        String[] arrayPalabras = new String[size];
        int pos = 0;
        for (int i=0; i<input.length; i++){
            if (!(Character.isSpaceChar(input[i]))){
                palabraGuardada += input[i];
            }
            if (Character.isSpaceChar(input[i]) || i==input.length-1){
                arrayPalabras[pos] = palabraGuardada;
                pos++;
                palabraGuardada="";
            }
        }
        for (int k = 0; k<arrayPalabras.length; k++){
            System.out.println(arrayPalabras[k]);
        }
    }
    public static void main(String[] args) {

        String texto = "Habia una vez un cordero y una oveja.";
        char[] cadenaDeChar = texto.toCharArray();
        System.out.println("El texto tiene un total de: "+cantidadPalabras(cadenaDeChar)+" palabras");
        System.out.println("El texto tiene un total de: "+cantidadVocales(cadenaDeChar)+" vocales");
        guardarPalabras(cadenaDeChar);
    }
}
