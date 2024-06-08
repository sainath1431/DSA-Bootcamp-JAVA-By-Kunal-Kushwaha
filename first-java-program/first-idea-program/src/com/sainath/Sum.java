package com.sainath;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
//        int num1 = input.nextInt();
        float num1 = input.nextFloat();

        System.out.print("Enter the Second Number : ");
//        int num2 = input.nextInt();
        float num2 = input.nextFloat();

//        int sum = num1 + num2;
        float sum = num1 + num2;
        
        System.out.println("\n"+num1 + " + "+ num2 + " = " +sum);
    }
}
