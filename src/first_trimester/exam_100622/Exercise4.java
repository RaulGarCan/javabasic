package exam_100622;

public class Exercise4 {
    /*
        Exercise 4: the following code runs but it always get the 0 value for the int
                       variable. The program is meant to generate an int random number greater than 0 and less
                       than 100. Modify the code so it works as meant.
    */
    public static void main(String[] args){

        double randomNumber = 100*Math.random();
        int myFirstInt = (int)randomNumber;
        System.out.println("Mi primer número aleatorio "+ myFirstInt);

    }
}
