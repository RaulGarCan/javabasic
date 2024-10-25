package third_trimester.class_031623.TestArray;
public class Main {
    public static void main(String[] args) {
        TestArray array1 = new TestArray(5);
        for (int i=1; i<6; i++){
            array1.addElemento(i);
        }
        System.out.println(array1);
        for(int j=0; j<10; j++){
            array1.eliminarElemento();
        }
        System.out.println(array1);
    }
}
