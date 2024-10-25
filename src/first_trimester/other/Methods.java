package other;

public class Methods {

    public double calculateArea(double radius){
        double area;
        final double PI = 3.14159;
        area            = PI*radius*radius;
        return area;
    }
    public static double calcArea(double radius){
        double area;
        final double PI = 3.14159;
        area             = PI*radius*radius;
        return area;
    }
    public static void main(String[] args){
        double myRadius = 100*Math.random();
        Methods myMethodObject = new Methods();
        double myArea = myMethodObject.calculateArea(myRadius);
        System.out.println("The area of a circle with radius "+myRadius+" is "+myArea);

        //double myArea = calcArea(myRadius);
        //System.out.println("The area of a circle with radius "+myRadius+" is "+myArea);
    }
}
