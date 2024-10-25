package class_092922;

public class RelationalOperators {

    public static void main(String[] args){
        /*
            These are the relational operators: ==, !=, <, >, <=, >=

         */
        int     integerOne      = 2;
        int     integerTwo      = 3;
        double  doubleOne       = 2.3d;
        double  doubleTwo       = 5.3;
        boolean booleanOne      = true;
        boolean booleanTwo      = false;

        //Compare the two integers numbers using the relational operators.
        System.out.println(integerOne+" == "+integerTwo+" : "+(integerOne==integerTwo));
        System.out.println(integerOne+" != "+integerTwo+" : "+(integerOne!=integerTwo));
        System.out.println(integerOne+" < "+integerTwo+" : "+(integerOne<integerTwo));
        System.out.println(integerOne+" > "+integerTwo+" : "+(integerOne>integerTwo));
        System.out.println(integerOne+" <= "+integerTwo+" : "+(integerOne<=integerTwo));
        System.out.println(integerOne+" >= "+integerTwo+" : "+(integerOne>=integerTwo));

        //Compare and print the two double numbers using the relational operators.
        System.out.println(doubleOne+" == "+doubleTwo+" : "+(doubleOne==doubleTwo));
        System.out.println(doubleOne+" != "+doubleTwo+" : "+(doubleOne!=doubleTwo));
        System.out.println(doubleOne+" < "+doubleTwo+" : "+(doubleOne<doubleTwo));
        System.out.println(doubleOne+" > "+doubleTwo+" : "+(doubleOne>doubleTwo));
        System.out.println(doubleOne+" <= "+doubleTwo+" : "+(doubleOne<=doubleTwo));
        System.out.println(doubleOne+" >= "+doubleTwo+" : "+(doubleOne>=doubleTwo));

        //Compare and print one integer with one double using the relational operators.
        System.out.println(integerOne+ " == "+doubleOne+" : "+(integerOne==doubleOne));
        System.out.println(integerOne+ " != "+doubleOne+" : "+(integerOne!=doubleOne));
        System.out.println(integerOne+ " < "+doubleOne+" : "+(integerOne<doubleOne));
        System.out.println(integerOne+ " > "+doubleOne+" : "+(integerOne>doubleOne));
        System.out.println(integerOne+ " <= "+doubleOne+" : "+(integerOne<=doubleOne));
        System.out.println(integerOne+ " >= "+doubleOne+" : "+(integerOne>=doubleOne));

        //Compare and print one integer with one boolean using the relational operators.
        /*
        System.out.println(integerOne+ " == "+booleanOne" : "+(integerOne==booleanOne));
        System.out.println(integerOne+ " != "+booleanOne" : "+(integerOne!=booleanOne));
        System.out.println(integerOne+ " < "+booleanOne" : "+(integerOne<booleanOne));
        System.out.println(integerOne+ " > "+booleanOne" : "+(integerOne>booleanOne));
        System.out.println(integerOne+ " <= "+booleanOne" : "+(integerOne<=booleanOne));
        System.out.println(integerOne+ " >= "+booleanOne" : "+(integerOne>=booleanOne));
        */

        //Compare and print  the two boolean variables using the relational operators.
        System.out.println(booleanOne+" == "+booleanTwo+" : "+(booleanOne==booleanTwo));
        System.out.println(booleanOne+" != "+booleanTwo+" : "+(booleanOne!=booleanTwo));
        /*
        System.out.println(booleanOne+" < "+booleanTwo+" : "+(booleanOne<booleanTwo));
        System.out.println(booleanOne+" > "+booleanTwo+" : "+(booleanOne>booleanTwo));
        System.out.println(booleanOne+" <= "+booleanTwo+" : "+(booleanOne<=booleanTwo));
        System.out.println(booleanOne+" >= "+booleanTwo+" : "+(booleanOne>=booleanTwo));
        */
    }
}
