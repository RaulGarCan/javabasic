package class_101722;

public class JavaExercise1 {
    /*
    Exercise 1: write a public and static method called checkParameter with a double parameter number.
    The method should return true if the value of the parameter is greater than 0 and less than 1.000.000.
     */
    public static boolean checkParameter(double parameter){
        final int MIN = 0;
        final int MAX = 120;
        boolean result;
        if ((parameter>MIN)&&(parameter<MAX)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static void main(String[] args){
        final int MAXRANDOM = 10000000;
        double parameterInput = MAXRANDOM*Math.random();
        System.out.println(+parameterInput+" is greater than 0 and less than 1.000.000: "+checkParameter(parameterInput));
    }
}
