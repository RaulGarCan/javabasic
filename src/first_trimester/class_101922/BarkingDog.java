package class_101922;
import java.util.Scanner;
public class BarkingDog {
    /*
    BarkingDog.java: we have a dog that likes to bark.  We need to wake up if the dog is barking at night! Write a method shouldWakeUp that has 2 parameters.
        1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
        2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
        We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true. In all other cases return false.
        If the hourOfDay parameter is less than 0 or greater than 23 return false.
        TIP: Use the if else statement with multiple conditions.
        NOTE: The shouldWakeUp method needs to be defined as public static like we have been doing so far in the course.
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp;
        if((hourOfDay<0)||(hourOfDay>23)) {
            wakeUp = false;
        }
        else if (barking) {
            wakeUp = false;
        }else if((hourOfDay<8)||(hourOfDay>22)){
            wakeUp = true;
        }else {
            wakeUp = false;
        }
        return wakeUp;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Is the dog barking? ");
        boolean dogBarking = userInput.nextBoolean();
        System.out.print("What time is it? ");
        int timeOfDay = userInput.nextInt();
        System.out.println("Should we wake up? "+shouldWakeUp(dogBarking, timeOfDay));
    }
}
