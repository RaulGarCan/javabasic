package exam_112122;

import java.util.Scanner;

/*******************************************************************************************
 ( 2 points) Print the following pattern using nested for statements and printing the * sign
 one by one.

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 ******************************************************************************************/
public class DrawPattern {
    public static void pattern(int rows){
        rows/=2;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i <= rows-2; i++){
            for (int j = rows-2; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce the amount of rows you want: ");
        int rows = userInput.nextInt();
        pattern(rows);
    }
}
