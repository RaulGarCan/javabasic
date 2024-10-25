package other;

public class Mouse {

    int weight		= 340;
    int numberButtons	= 5;
    int DPI         	= 15000;

    static void leftClick(){
        System.out.println("Left click input");
    }
    static void rightClick(){
        System.out.println("Right click input");
    }
    static void middleClick(){
        System.out.println("Middle click input");
    }
    public static void main(String[] args){
        leftClick();
        rightClick();
        middleClick();
    }
}
