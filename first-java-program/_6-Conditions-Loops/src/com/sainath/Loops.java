package com.sainath;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            USECASE OF LOOP :
            1) FOR LOOP : When we know how many times do repetation / how many numbers to time do task is repeated.
            2) WHILE LOOP : When we know the if the condition is true till the we have to repeated that taks at that time we want to use While loop.
         */


        /*
            Syntax of for loops:

            for(initialization; condition; increment/decrement){
                //body
            }

         */

        //Q : print numbers from 1 to 5
//        for(int num = 1 ; num <= 5 ; num++){
//            System.out.println(num);
//        }

        // Print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n ; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }

        //While loops

        /*
            Syntax :
            while (condition){
                //body
             }
         */

        //Q : print numbers from 1 to 5

//        int num = 1; //initialization
//        while(num <= 5){   //condition
//            System.out.println(num);
//            num++; //increment/decrement
//        }

        /*
            do While

            Syntax :
                    do{
                        //body
                    }while (condition);

             Here the body of loop executes at least once definitely.and then
             depends upon the condition body of loop is executes.

         */

        int n = 1;
        do{
            System.out.println("Hello World");
            n++;
        }while( n != 5);




    }
}
