package com.company;
/**
This is the fifth task of my homework. 17th August 2021.
The task is:
6. In the main method, get the word entered from the console and output to the console the expression: the entered word "and_there_in_tags_must_be_entered_word".. */
public class HomeworkLesson2Task6 {
    public static void main(String[] args) {
        String yourWord = args[0];
for (int i = 0; i != args.length; i++ ){
    System.out.print(args[i]);
    if (i < args.length -1) {
        System.out.print("_");
    }
    }
    }
}
