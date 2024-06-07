package com.sainath;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Here println prints new message in new line.
        System.out.println("Hello world");
        System.out.println("My name is sainath");

        //Here only print use so that next message continue after previous message without new line.
        System.out.print("Hello World");
        System.out.println("My name is sainath");

        //Take Input by using Scanner class
        //Take Input as interger
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());

        //Take Input as single string.
        Scanner input2 = new Scanner(System.in);
        System.out.println(input2.next());

        //Take Input as whole line string.
        Scanner input3 = new Scanner(System.in);
        System.out.println(input3.nextLine());

    }
}
