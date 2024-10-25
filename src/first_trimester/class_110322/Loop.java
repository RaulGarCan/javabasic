package class_110322;

public class Loop {
    /*
        Check the code and explain what is happening:
public class Loop {
    public static void main(String[] args) {
         int sum = 0;
        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
    }
}
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }

         /*
            The code is generating an endless loop because the condition i<=10 is
            always true, and we are decrementing the "i" variable every loop.
         */
    }
}


