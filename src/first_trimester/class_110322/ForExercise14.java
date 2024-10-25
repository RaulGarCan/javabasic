package class_110322;

public class ForExercise14 {
    /*
        Write programs that print the following:
        10 * width, 4 * height

        *
        * *
        . . .

        Same but inverted
     */
    public static void exercise1(){
        int width = 10;
        int height = 4;
        for (int i = 1; i<=height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public static void exercise2(int rows){
        for (int i = 1; i<=rows; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void exercise3(int rows){
        for (int i=rows;i>0;i--){
            for (int j=i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=1; k<rows-i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void exercise4(int rows){
        for (int i=0;i<rows;i++){
            for (int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void exercise5(int rows){
        for (int i=0;i<rows-1;i++){
            for (int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++ ){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    public static void exercise6(int rows){
        for (int i=0;i<rows-1;i++){
            for (int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=i+1;k>0;k-- ){
                System.out.print(k);
            }
            for (int l=0;l<i;l++){
                System.out.print(l+2);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        exercise1();
        System.out.println("Exercise 2");
        exercise2(5);
        System.out.println("Exercise 3");
        exercise3(5);
        System.out.println("Exercise 4");
        exercise4(5);
        System.out.println("Exercise 5");
        exercise5(5);
        System.out.println("Exercise 6");
        exercise6(5);
    }
}
