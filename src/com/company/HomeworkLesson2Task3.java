package com.company;
/**
This is the third task of my homework. 17th August 2021.
The task is:
3.In the main method, declare two variables of type int and assign arbitrary numeric values ​​to them.
For the first variable, call the increment operation, for the second variable, call the decrement operation.
Output the results to the console. */
public class HomeworkLesson2Task3 {
    public static void main(String[] args) {
        int var1 = 2;
        int var2 = 2;
        System.out.println("first var. " + var1);
        System.out.println(  "second var. " + var2);
        var1++;
        ++var2;
        System.out.println("first var. " + var1);
        System.out.println(  "second var. " +  var2);
        var1--;
        --var2;
        System.out.println("first var. " + var1);
        System.out.println(  "second var. " +  var2);
        System.out.println(  "It doesn't matte whether you write this operation before or behind the variable.");
    }
}
