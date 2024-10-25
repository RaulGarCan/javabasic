package class_101822;

import java.util.Scanner;
public class WhatIsYourAge {
    /*
    Create a Java class  named clase_181022.WhatIsYourAge that aks the user for their age.
    Modify the method checkParameter for the following range (0,120). Print “You are not of this planet.”
    if the age is out of range and “You are not so bad for your age” if the age is within the range.
     */
    public static void main(String[] args){
        Scanner userAge = new Scanner(System.in);
        System.out.println("Introduce your age: ");
        int age = userAge.nextInt();
        if (class_101722.JavaExercise1.checkParameter(age)){
            System.out.println("You are not so bad for your age");
        }else {
            System.out.println("You are not of this planet.");
        }
    }
}