package second_trimester.class_121622;

import java.util.Arrays;

public class ArrayAlumnos {
    /*
        Se tiene un array de alumnos {"Pepe","Mohamed","Maria","Sara"} y un array de notas {7,5,4,0,3,9,3,6,5,8,9,10}.
        Las notas de los alumn@s están agrupadas de 3 en 3. De tal manera que las notas de Pepe serán 7,5 y 4, las notas de Mohamed serán
        0,3 y 9, y así sucesivamente. Utilizando el método copyOfRange de la clase Arrays; crear un array bidimensional en el que aparezcan
        los alumnos con sus notas medias, de la siguiente manera:

                                            Pepe    Mohamed     María       Sara
                                            5,71    7,49        8,34        4,32

        Imprimir la tabla una vez realizada.

     */
    public static double mediaNotas(double[] entradaNotas){
        double media = 0;
        for(int i=0; i<entradaNotas.length; i++){
            media+=entradaNotas[i];
        }
        media/= entradaNotas.length;
        return media;
    }
    public static void main(String[] args) {
        String[] alumnos = {"Pepe", "Mohamed", "Maria", "Sara"};
        double[] notas = {7, 5, 4, 0, 3, 9, 3, 6, 5, 8, 9, 10};
        String[][] tablaNotas = new String[2][4];
        for (int j = 0; j < tablaNotas[0].length; j++) {
            tablaNotas[0][j] = alumnos[j];
        }

        int inicio = 0;
        int fin = 3;
        for (int k=0; k<tablaNotas[0].length; k++){
            double[] copiaNotas = Arrays.copyOfRange(notas, inicio, fin);
            double mediaResult = mediaNotas(copiaNotas);
            tablaNotas[1][k] = Double.toString(mediaResult);
            inicio=fin;
            fin+=3;
        }
        for (int l=0; l<tablaNotas.length; l++){
            System.out.println(Arrays.toString(tablaNotas[l]));
        }
    }
}
