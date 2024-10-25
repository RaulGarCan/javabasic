package other;

class Car{

    String color="red";
    int power	= 120;
    int maxSpeed	= 240;
    int numberSeat	= 7;

    static void stop(){
        System.out.println("Stopping the car");
    }
    static void start(){
        System.out.println("Starting the car");
    }
    static void brake(){
        System.out.println("Braking the car");
    }
    static void speedUp(){
        System.out.println("Speeding up the car");
    }
    static void slowDown(){
        System.out.println("Slowing down the car");
    }
    public static void main(String[] args){
        stop();
        start();
        brake();
        speedUp();
        slowDown();
    }

}
