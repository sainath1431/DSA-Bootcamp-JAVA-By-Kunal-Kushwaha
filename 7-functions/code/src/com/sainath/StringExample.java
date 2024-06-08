package com.sainath;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        String personalised  = mygreet(name);
        System.out.println(personalised);

    }

    static String mygreet(String name) {
        String message = "Hello " + name;
        return message;

    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
