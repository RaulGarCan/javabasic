package exam_100622;

public class Tap {

    /*
Exercise 6: create a java class called exam_061022.Tap with the following requirements:
                            1.- The class should be executable.
                            2.- The class should have the following methods:
                                - open():   public and returns nothing. It should print the text: "Opening
                                            the tap".
                                - close():  public and returns nothing. It should print the text: "Closing
                                            the tap".
                            3.- The class should have the following fields:
                                - temperature: double.
                                - model: String.
                            4.- The class should have a default constructor.
                            5.- Create an object and call it myTappy.
                            6.- Print the object and explain the result.
 */

    double temperature;
    String model = "";

    public Tap(){}
    public static void open(){
        System.out.println("Opening the tap");
    }
    public static void close(){
        System.out.println("Closing the tap");
    }
    public static void main(String[] args){

        open();
        close();

        Tap myTappy = new Tap();
        System.out.println(myTappy);

    }
}
