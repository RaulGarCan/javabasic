package other;

public class Screen {

    String brand	="BenQ";
    int size	= 21;
    int frequency   = 60;

    static void brightUp(){
        System.out.println("Increasing brightness of the screen");
    }
    static void brightDown(){
        System.out.println("Decreasing brightness of the screen");
    }
    static void turnOff(){
        System.out.println("Turning off the screen");
    }
    public static void main(String[] args){
        brightUp();
        brightDown();
        turnOff();
    }

}
