package second_trimester.class_121622;

import java.util.Arrays;

public class InitializingBiArrays {
    /*
        Inicializa los siguientes arrays de las tres maneras vistas.

11      22
44      4



11  22  -9  1
44  4   77  32



11  22
44  47
23  8
-4  1
9   13
78  -11


     */
    public static void tabla1(){
        int[][] tabla1 = {
                {11,22},
                {44,4},
        };
        for (int i=0; i<tabla1.length; i++){
            System.out.println(Arrays.toString(tabla1[i]));
        }
        System.out.println();

        tabla1[0][0] = 11;
        tabla1[0][1] = 22;
        tabla1[1][0] = 44;
        tabla1[1][1] = 4;
        for (int i=0; i<tabla1.length; i++){
            System.out.println(Arrays.toString(tabla1[i]));
        }
        System.out.println();

        for (int i=0; i<tabla1.length; i++){
            for (int j=0; j<tabla1[0].length; j++){
                tabla1[i][j] = (int)(100*Math.random());
            }
        }
        for (int i=0; i<tabla1.length; i++){
            System.out.println(Arrays.toString(tabla1[i]));
        }
        System.out.println();
    }
    public static void tabla2(){
        int[][] tabla2 = {
                {11,22,-9,1},
                {44,4,77,32},
        };
        for (int i=0; i<tabla2.length; i++){
            System.out.println(Arrays.toString(tabla2[i]));
        }
        System.out.println();

        tabla2[0][0] = 11;
        tabla2[0][1] = 22;
        tabla2[0][2] = -9;
        tabla2[0][3] = 1;
        tabla2[1][0] = 44;
        tabla2[1][1] = 4;
        tabla2[1][2] = 77;
        tabla2[1][3] = 32;
        for (int i=0; i<tabla2.length; i++){
            System.out.println(Arrays.toString(tabla2[i]));
        }
        System.out.println();

        for (int i=0; i<tabla2.length; i++){
            for (int j=0; j<tabla2[0].length; j++){
                tabla2[i][j] = (int)(100*Math.random());
            }
        }
        for (int i=0; i<tabla2.length; i++){
            System.out.println(Arrays.toString(tabla2[i]));
        }
        System.out.println();
    }
    public static void tabla3(){
        int[][] tabla3 = {
                {11,22},
                {44,47},
                {23,8},
                {-4,1},
                {9,13},
                {78,-11},
        };
        for (int i=0; i<tabla3.length; i++){
            System.out.println(Arrays.toString(tabla3[i]));
        }
        System.out.println();

        tabla3[0][0] = 11;
        tabla3[0][1] = 22;
        tabla3[1][0] = 44;
        tabla3[1][1] = 47;
        tabla3[2][0] = 23;
        tabla3[2][1] = 8;
        tabla3[3][0] = -4;
        tabla3[3][1] = 1;
        tabla3[4][0] = 9;
        tabla3[4][1] = 13;
        tabla3[5][0] = 78;
        tabla3[5][1] = -11;
        for (int i=0; i<tabla3.length; i++){
            System.out.println(Arrays.toString(tabla3[i]));
        }
        System.out.println();

        for (int i=0; i<tabla3.length; i++){
            for (int j=0; j<tabla3[0].length; j++){
                tabla3[i][j] = (int)(100*Math.random());
            }
        }
        for (int i=0; i<tabla3.length; i++){
            System.out.println(Arrays.toString(tabla3[i]));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Tabla 1:");
        tabla1();
        System.out.println("Tabla 2:");
        tabla2();
        System.out.println("Tabla 3:");
        tabla3();
    }
}
