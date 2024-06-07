package com.sainath;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.print("Please enter Your Roll Number : ");
//        int roll_no = input.nextInt();
//        System.out.println("Your roll number  is " + roll_no);

        //if we want to store big integer or no like 23,000,000 is not possible so that it can handle by replacing (,) by (_)
        //int a  = 23,000,000 (wrong)
//        int a = 23_000_000;
//        System.out.println(a);
//
//        String name = input.nextLine();
//        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
