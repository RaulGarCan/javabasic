package class_092622;

public class PrimitiveTypes {

    public static void main(String[] args){
        int intMinValue; //What is the value of this variable?
        int intMaxValue; //What is the value of this variable?
        short shortMinValue;
        short shortMaxValue;
        byte byteMinValue;
        byte byteMaxValue;
        long longMinValue;
        long longMaxValue;
        float floatMinValue;
        float floatMaxValue;
        double doubleMinValue;
        double doubleMaxValue;

        int intDownFlow;
        byte byteDownFlow;
        short shortDownFlow;
        long longDownFlow;
        float floatDownFlow;
        double doubleDownFlow;

        int intOverFlow;
        byte byteOverFlow;
        short shortOverFlow;
        long longOverFlow;
        float floatOverFlow;
        double doubleOverFlow;

        byte myByteNumber = 27;
        short myShortNumber = 160;
        int myIntNumber = 4374;
        // The sum is working as an int but JVM automatically converts it to a long
        long myLongNumber = 50000+10*(myByteNumber+myShortNumber+myIntNumber);

        long myLongValue = 1000L;
        long myLongNewValue = myLongValue/2;

        //Casting Java primitives types.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myByteValue = (byte)(myMinByteValue/2);

        short myMinShortValue = Short.MIN_VALUE;
        short MyShortValue = (short)(myMinShortValue/2);

        /* Let's get the integer's minimum value. */

        intMinValue = Integer.MIN_VALUE;
        intDownFlow = intMinValue-1;
        shortMinValue = Short.MIN_VALUE;
        shortDownFlow = (short)(shortMinValue-1);
        byteMinValue = Byte.MIN_VALUE;
        byteDownFlow = (byte)(byteMinValue-1);
        longMinValue = Long.MIN_VALUE;
        longDownFlow = longMinValue-1;
        floatMinValue = Float.MIN_VALUE;
        floatDownFlow = floatMinValue-1;
        doubleMinValue = Double.MIN_VALUE;
        doubleDownFlow = doubleMinValue-1;

        //Let's print this variable.
        System.out.println("The minimum value of a integer is: "+ intMinValue);
        System.out.println("The minimum value of a short is "+ shortMinValue);
        System.out.println("The minimum value of a byte is "+ byteMinValue);
        System.out.println("The minimum value of a long is "+ longMinValue);
        System.out.println("The minimum value of a float is "+ floatMinValue);
        System.out.println("The minimum value of a double is "+ doubleMinValue);
        System.out.println(intDownFlow);
        System.out.println(shortDownFlow);
        System.out.println(byteDownFlow);
        System.out.println(longDownFlow);
        System.out.println(floatDownFlow);
        System.out.println(doubleDownFlow);

        /* Let's get the integer's maximum value. */
        intMaxValue = Integer.MAX_VALUE;
        intOverFlow = intMaxValue+1;
        shortMaxValue = Short.MAX_VALUE;
        shortOverFlow = (short)(shortMaxValue+1);
        byteMaxValue = Byte.MAX_VALUE;
        byteOverFlow = (byte)(byteMaxValue+1);
        longMaxValue = Long.MAX_VALUE;
        longOverFlow = longMaxValue+1;
        floatMaxValue = Float.MAX_VALUE;
        floatOverFlow = floatMaxValue+1;
        doubleMaxValue = Double.MAX_VALUE;
        doubleOverFlow = doubleMaxValue+1;

        //Let's print this variable.
        System.out.println("The maximum value of a integer is: "+ intMaxValue);
        System.out.println("The maximum value of a short is "+ shortMaxValue);
        System.out.println("The maximum value of a byte is "+ byteMaxValue);
        System.out.println("The maximum value of a long is "+ longMaxValue);
        System.out.println("The maximum value of a float is "+ floatMaxValue);
        System.out.println("The maximum value of a double is "+ doubleMaxValue);
        System.out.println(intOverFlow);
        System.out.println(shortOverFlow);
        System.out.println(byteOverFlow);
        System.out.println(longOverFlow);
        System.out.println(floatOverFlow);
        System.out.println(doubleOverFlow);

        System.out.println(myLongNumber);
    }
}
