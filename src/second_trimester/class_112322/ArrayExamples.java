package second_trimester.class_112322;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] myArray;              // Declared but empty
        myArray = new int[20];      // Number of items are declared now but still empty

        int[] myArray2 = new int[10]; // Declared with number of items but empty

        int[] myArray3 = {1,2,3,4,6,7,8,10}; // Declared and initialized

//        myArray[0] = 1;
//        myArray[1] = 2;
//        myArray[2] = 3;
//        myArray[3] = 4;
//        myArray[4] = 5;
        // myArray[20] = 6; is not possible because the size of the array is of 20 (and the first position is 0)

//        System.out.println(myArray[0]);

        for (int i=0; i<10; i++){
            myArray2[i] = (int)(100*Math.random());
        }

        for (int j = 0; j<10; j++){
            System.out.println(myArray2[j]);
        }
    }
}
