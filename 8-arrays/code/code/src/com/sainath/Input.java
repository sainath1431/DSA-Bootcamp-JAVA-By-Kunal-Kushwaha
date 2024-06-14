package com.sainath;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
        //Array of Primitives .
        int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 46;
        arr[2] = 47;
        arr[3] = 48;
        arr[4] = 49;
        //[45,46,47,48,49]

        System.out.println(arr[0]);

        //System.out.println(arr[5]); // index out of bound error because arr index are start from 0 and end with 4
                                      // So that 5 index is not present rather than we are access the value at that index.
                                      // So will get error like index out of bound.


        System.out.println(Arrays.toString(arr)); // this convert the array into string and then print.
//        [45, 46, 47, 48, 49]

        /*

        //input using for loop
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextByte();
        }


      
        //here iterating array using index by traditional for loop
        //print using for loop
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        

        
        //Here iterating an array using modern for-each() loop without using index.
        for (int num: arr) { // for every element in array, print the element.
            System.out.print(num + " "); //here num represents the element of an array.
        }

         */


        /*
        Array of Objects
         */

        String[] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
        
        


    }
}
