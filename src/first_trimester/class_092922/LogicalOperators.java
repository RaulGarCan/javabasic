package class_092922;

public class LogicalOperators {

    public static void main(String[] args){
      /*
          These are the logical operators: AND(&&), OR(||) , NOT(!)
      */
        int     integerOne  =   2;
        int     integerTwo  =   3;
        boolean booleanOne  =   true;
        boolean booleanTwo  =   false;

        //Compare and print the two integers numbers using the logical operators.
        //System.out.println(integerOne+" && "+integerTwo+" "+(integerOne && integerTwo));
        //System.out.println(integerOne+" || "+integerTwo+" "+(integerOne || integerTwo));
        //System.out.println(integerOne+" ! "+(!integerOne));
        //System.out.println(integerTwo+" ! "+(!integerTwo));


        //Compare and print one integer number and one boolean variable using the logical operators.
        //System.out.println(integerOne+" && "+booleanOne+" "+(integerOne && booleanOne));
        //System.out.println(integerOne+" || "+booleanOne+" "+(integerOne || booleanOne));
        //System.out.println(integerOne+" ! "+booleanOne+" "+(integerOne ! booleanOne));

        //Compare and print two boolean variables using the logical operators.
        System.out.println(booleanOne+" && "+booleanTwo+" -> "+(booleanOne && booleanTwo));
        System.out.println(booleanOne+" || "+booleanTwo+" -> "+(booleanOne || booleanTwo));
        System.out.println(booleanOne+" ! "+(!booleanOne));
        System.out.println(booleanTwo+" ! "+(!booleanTwo));



        //Evaluate and print the following statements:
        System.out.println((integerOne < integerTwo) && (integerTwo  >= integerOne));
        System.out.println((integerOne == integerTwo) || (integerTwo != integerTwo));
        System.out.println((integerTwo <= integerTwo) != (integerOne >= integerTwo));
        System.out.println(!(integerOne == integerTwo) || (integerTwo != integerTwo));
        System.out.println((integerOne < integerTwo) && !(integerTwo  >= integerOne));
        System.out.println(!((integerTwo <= integerTwo) != (integerOne >= integerTwo)));

    }//public static void main(String[] args)

}//public class class_092922.LogicalOperators
