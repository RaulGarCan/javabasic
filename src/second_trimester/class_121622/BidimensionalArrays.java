package second_trimester.class_121622;

import java.util.Arrays;

public class BidimensionalArrays {
    public static void main(String[] args) {
        int[][] myBitArray;
        myBitArray = new int[][]{
                {5,7},
                {5,9},
                {55,33},
                {9,8}
        };
        System.out.println(myBitArray.length);
        System.out.println(myBitArray[0].length);
        for (int i=0; i<myBitArray.length; i++){
            for (int j=0; j<myBitArray.length; j++){
                myBitArray[i][j] = (int)(100*Math.random());
                System.out.println(Arrays.toString(myBitArray[i]));
            }
        }
    }
}
