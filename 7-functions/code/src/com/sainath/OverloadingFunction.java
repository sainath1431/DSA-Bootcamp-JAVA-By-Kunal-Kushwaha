package com.sainath;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OverloadingFunction {
    /*
        Function Overloading : Two or More functions have same name and same return type and same parameter name
                                But different type of argument(data type of argument ) . or same datatype of arguments but
                                not same number of arguments. such concept is known as function overloading.

        In function overloading at compile time compiler check the which type of arguments are passed or how many arguments passed
        as per that corresponding the method definition will be executed.

        Function Overloading is done at Compile Time.



        function overloading basically happens two or more function of the same name
        They can exist. if the parameters are different type.
     */
    public static void main(String[] args) {

        //function overloading : different types of arguments.
        func(67);
        func("sainath");

        //function overloading : different number of arguments with same type of arguments.
        int sum1 = sum(10,20);
        int sum2 = sum(10,20,30);

        System.out.println("First Sum : " +  sum1);
        System.out.println("Second Sum : " + sum2);

        //function overloading : by using Variable length  Argument.
        VarArgs(2,3,4,5,6);
        VarArgs("sainath","tushar","shri","Akau");

//        VarArgs(); This gives error or create ambiguity
/*
        because the if argument  is not passed then compiler get
        confused which VarArgs function we have to run because there
        is not argument so it can't determine the which call is that
        because call is determined from datatype of argument and here
        the argument is not pass so that we compiler create ambiguity and
        rise the error.
 */



    }


    // function overloading with different datatype of argments.
    static void func(int a){
        System.out.println(a);

    }

    static void func(String a){
        System.out.println(a);

    }

    //function overloading with same data type or different data type of different number or argments to be passed.

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a , int b , int c){
        return a + b + c;
    }

    //function overloading with variable length arguments.

    static void VarArgs(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void VarArgs(String...v){
        System.out.println(Arrays.toString(v));
    }
}
