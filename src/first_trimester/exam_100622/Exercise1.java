package exam_100622;

public class Exercise1 {
    public static void printAscii(char character1, char character2, char character3){
        int ascii = character1;
        System.out.println("The ascii value for the given character "+character1+" is "+ascii);
        ascii = character2;
        System.out.println("The ascii value for the given character "+character2+" is "+ascii);
        ascii = character3;
        System.out.println("The ascii value for the given character "+character3+" is "+ascii);
    }
    public static void main(String[] args) {

    /*
    Exercise 1: given the following char characters '9', 'L' and '$', print their ASCII char number.
     */

        char character1 = '9';
        char character2 = 'L';
        char character3 = '$';

        printAscii(character1, character2, character3);
    }
}
