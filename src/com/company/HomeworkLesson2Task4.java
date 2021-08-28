package com.company;
/**
This is the forth task of my homework. 17th August 2021.
The task is:
4. In the main method, declare a variable of type double and assign arbitrary numeric values to it.
Make the variable explicitly cast to the int type.
Output the result to the console. */
public class HomeworkLesson2Task4 {
    public static void main(String[] args) {
        double var1 = 3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482;
        int var2 = (int) var1;
        System.out.println("Pie =  " + var1);
        System.out.println(  "Now it is rounded " + var2);
    }
}
