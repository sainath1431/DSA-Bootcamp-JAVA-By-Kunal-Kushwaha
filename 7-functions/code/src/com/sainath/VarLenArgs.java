package com.sainath;

import java.util.Arrays;

public class VarLenArgs {
    /*
        Variable length Arguments : when you create method variable number of arguments are taken by the method.

        If we don't know how many arguments are passed in the function at that time we can use the Variable length arguments (VarArgs method).

        (int ... v) // for integer arguments.
        (String ...v) // for String arguments.
        (datatype ...identifier) // here values of given datatypes are stored in array which named as given identifier.
     */
    public static void main(String[] args) {
        func(2,3,4,5,5,6,843,4,4,4,5,4,3); //here we can pass any number of arguments .

        multiple(10, 10.39f ,"Sainath","tushar","Akash","Shrinivas");
    }

    static void func(int...v){ //here V --> identifier which stores the integer value in the array structure.
        System.out.println(Arrays.toString(v));
    }

    //multiple data type

    /*
        Imp Note :
       In multiple type of arguments the variable length numbers array is passed as the last argument only must.

       variable length arugment always at the end. (int a, float b, String ...v)
     */

    static void multiple(int a, float b , String ...v){
        System.out.println( a + " " + b + " "+ Arrays.toString(v));
    }
}
