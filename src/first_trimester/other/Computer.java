package other;

public class Computer {

    String cpu="Intel i5-8400";
    int psu		= 650;
    int ram		= 8;

    static void turnOn(){
        System.out.println("Turning on the computer");
    }
    static void turnOff(){
        System.out.println("Turning off the computer");
    }
    static void standBy(){
        System.out.println("Standing by the computer");
    }
    public static void main(String[] args){
        turnOn();
        turnOff();
        standBy();
    }
}
