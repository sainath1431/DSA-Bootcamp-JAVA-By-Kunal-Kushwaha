package com.sainath;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = in.nextInt();
        int num = n;
        System.out.print("Enter The Digit Which is count : ");
        int countNum = in.nextInt();

        int count = 0;

        while(n > 0){
            int rem  = n % 10;
            if(rem == countNum){
                count++;
            }
            n = n / 10; // n /= 10;
        }

        System.out.println(countNum + " Is Occuence " + count + " Times In " + num);
    }
}
