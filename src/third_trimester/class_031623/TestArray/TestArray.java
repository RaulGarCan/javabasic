package third_trimester.class_031623.TestArray;

import java.util.Arrays;

public class TestArray {
    /*
        1. Crea una clase TestArray cuyos atributos sean un array de enteros y un entero que
        albergue el tamaño del array.

        2. Escribe un constructor que lo inicialice a un tamaño especificado por parámetro.

        3. Crea un array de 5 casillas y rellénalo con los números del 1 al 5.

        4. Escribe un método que muestre por pantalla el contenido del array.

        5. Escribe un método que añade un elemento al final del array.

        6. Escribe un método que elimine el último elemento del array.
     */
    private int[] arrayInt;
    private int arraySize;
    public TestArray(int size){
        this.arrayInt = new int[size];
        this.arraySize = 0;
    }
    @Override
    public String toString(){
        return Arrays.toString(this.arrayInt);
    }
    public void addElemento(int elemento){
        if((this.arraySize<this.arrayInt.length)&&(elemento>=0)){
            this.arrayInt[this.arraySize] = elemento;
            this.arraySize++;
        }
    }
    public int eliminarElemento(){
        if(this.arraySize>0) {
            int valorBorrado = this.arrayInt[--arraySize];
            this.arrayInt[arraySize] = 0;
            return valorBorrado;
        }
        return -1;
    }
    public int nElementos(){
        return this.arraySize;
    }
}
