package exam_100622;

public class Exercise5 {
    /*
    Exercise 5: given the following Strings literals "Hola", "me", "llamo", "Adrian".
                                Create a String variable that concatenates all the String literal using the
                                shorthand notation and print the result is: "Hola me llamo Adrian"
     */
    public static void main(String[] args) {
        String result = "";
        result+= "Hola";
        result+= " ";
        result+= "me";
        result+= " ";
        result+= "llamo";
        result+= " ";
        result+= "Adrian";

        System.out.println(result);
    }
}
