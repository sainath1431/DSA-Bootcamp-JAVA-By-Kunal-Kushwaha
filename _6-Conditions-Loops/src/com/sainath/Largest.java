package com.sainath;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q : Find the largest of the 3 numbers.

        /*  first way
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
         */

        /* IInd Way
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }

        if(c > max){
            max = c;
        }
        */

//        int max = Math.max(23, 56);// it returns max from two numbers.

        /*IIIrd Way
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
         */

        /*Ivth Way
        if(a>b && a>c){
            System.out.println("max : " + a);
        } else if (b > c) {
            System.out.println("max : " + b);
        }else{
            System.out.println("max : " + c);
        }
        */

    }
}
