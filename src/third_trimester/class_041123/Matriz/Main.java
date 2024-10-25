package third_trimester.class_041123.Matriz;

import java.util.Arrays;

public class Main {
    static Integer[][] matriz;
    public static void operacion(Integer n1, Operacion op, Integer n2){
        Integer[][] matrizTMP = new Integer[matriz.length+1][4];
        for (int i=0; i<matriz.length; i++){
            matrizTMP[i] = Arrays.copyOf(matriz[i], matriz[i].length+1);
        }
        matrizTMP[matrizTMP.length-1][0]=n1;
        matrizTMP[matrizTMP.length-1][1]=op.ordinal();
        matrizTMP[matrizTMP.length-1][2]=n2;
        matriz = new Integer[matrizTMP.length][4];
        for (int j=0; j<matrizTMP.length; j++){
            matriz[j] = Arrays.copyOf(matrizTMP[j],matrizTMP[j].length);
        }
    }
    public static void main(String[] args) {
        operacion(1, Operacion.SUMA, 3);
        for (Integer[] i : matriz){
            System.out.println(Arrays.toString(i));
        }
    }
}
