package com.sainath;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//        sum();

        /*
        Note : anything is to be used in the static that has to be static.
                That's if we not declare the sum() as static then
                complier rise an error at the time of function call of
                sum() method inside the static main() method. so that we
                have to declare the sum() as static.
         */

//        int total = sum2();
//        System.out.print("The total = " + total);

        int result = sum3(10,20);
        System.out.println("Result : " + result);
    }

    //Pass the value of numbers when you are calling the method inside main()

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }



    //Return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

//        System.out.println("This will never executes because after return the execution of function will terminate.");


    }

    //without Return
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    /*
        Function declaration:
        Syntax :  access modifier (we'll look in OOP) return_type function_name(parameter1,parameter2,...parameterN){
                        //body
                        return statement;
                   }

          Function Call:

           function_name(arg1,arg2,...,argN);
     */
}
