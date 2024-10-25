package class_101022;
import java.util.Scanner;
public class Student {
    /*
    2. Create a class called class_101022.Student. The class should have the following:
     a) Fields:
          String id;
          String name;
          String surname;
          int       age;
          String address;
          char gender;

     b) other.Methods:
         public boolean enrol();
         public void dropOut();
         public void pass();
         public void fail();
         public void study();

    Once created the class, generate 5 objects with the names of the class students: kevin, mohamed, raulT, raulG, francisco
     */
    public String  id;
    public String  name;
    public String  surname;
    public int     age;
    public String  address;
    public char    gender;

    public Student(){}

    public boolean enroll(){
        System.out.println("Enrolling");
        return false;
    }
    public boolean pass(){
        System.out.println("Passing");
        return true;
    }
    public String dropOut(){
        return "Dropping out";
    }
    public String study() {
        return "Studying";
    }

    public static void main(String[] args){
        Scanner newObject   = new Scanner(System.in);
        Student kevin       = new Student();

        System.out.print("Introduce the name of the Student: ");
        kevin.name          = newObject.nextLine();
        System.out.print("Introduce the surname of the Student: ");
        kevin.surname       = newObject.nextLine();
        System.out.print("Introduce the address of the Student: ");
        kevin.address       = newObject.nextLine();

        System.out.println(kevin.name);
        System.out.println(kevin.surname);
        System.out.println(kevin.address);
        System.out.println(kevin.dropOut());
        System.out.println(kevin.study());

        /*
        class_101022.Student mohamed     = new class_101022.Student();
        mohamed.name        = "Mohamed";
        mohamed.surname     = "MohamedSurname";
        mohamed.address     = "C/Mohamed address in Ceuta";
        System.out.println(mohamed.name);
        System.out.println(mohamed.surname);
        System.out.println(mohamed.address);

        class_101022.Student raulT     = new class_101022.Student();
        raulT.name        = "RaulT";
        raulT.surname     = "RaulTSurname";
        raulT.address     = "C/RaulT address in Ceuta";
        System.out.println(raulT.name);
        System.out.println(raulT.surname);
        System.out.println(raulT.address);

        class_101022.Student raulG     = new class_101022.Student();
        raulG.name        = "RaulG";
        raulG.surname     = "RaulGSurname";
        raulG.address     = "C/RaulG address in Ceuta";
        System.out.println(raulG.name);
        System.out.println(raulG.surname);
        System.out.println(raulG.address);

        class_101022.Student francisco     = new class_101022.Student();
        francisco.name        = "Francisco";
        francisco.surname     = "FranciscoSurname";
        francisco.address     = "C/Francisco address in Ceuta";
        System.out.println(francisco.name);
        System.out.println(francisco.surname);
        System.out.println(francisco.address);
         */
    }

}
