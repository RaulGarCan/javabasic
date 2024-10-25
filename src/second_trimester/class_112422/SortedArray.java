package second_trimester.class_112422;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    /*
        SortedArray.java: create a program using arrays that sorts a list of integers in descending order. Descending order is highest value to lowest.
In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
Implement the following methods:

getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.

printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
Element 0 contents 106
Element 1 contents 81
Element 2 contents 26
Element 3 contents 15
Element 4 contents 5

sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
The scenario is:
1. getIntegers() is called.
2. The returned array from getIntegers() is then used to call sortIntegers().
3. The returned array from sortIntegers() is then printed to the console.
TIP: you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.
TIP: Instantiate (create) the Scanner object inside the method.
TIP: Be extremely careful about spaces in the printed message.
TIP: Make sure the Scanner class is imported.
     */
    static Scanner userInput = new Scanner(System.in);
    public static int[] getIntegers(int size){
        int[] numbersArray = new int [size];
        for (int i=0; i<size; i++){
            System.out.print("Introduce a number: ");
            numbersArray[i] = userInput.nextInt();
        }
        return numbersArray;
    }
    public static int[] sortIntegers(int[] inputArray){
        Arrays.sort(inputArray);
        return inputArray;
    }
    public static void printArray(int[] resultArray){
        int size = resultArray.length;
        for (int j = 0; j<size;j++){
            System.out.print(resultArray[j]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduce the size of the Array: ");
        int size = userInput.nextInt();
        printArray(sortIntegers(getIntegers(size)));
    }
}