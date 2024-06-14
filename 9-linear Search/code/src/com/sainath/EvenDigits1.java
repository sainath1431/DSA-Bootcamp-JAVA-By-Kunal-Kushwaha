package com.sainath;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EvenDigits1 {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896,0,-12};

        System.out.println("The original Array : " + Arrays.toString(nums));

        System.out.println("Even Digit Numbers In Array : " + findNumber(nums));

//        System.out.println("The Number of digits in Number : 12344 are digits : " + digits(12344));

    }


    /*
    //first Approach
    static int findNumbers(int[] nums){
        int even = 0;
        for(int num:nums){


            //if number is negative make it positive
            if(num<0){
                num = num * -1;
            }

            int n = num;


            int counter = 0;

            while(n > 0){
                counter++;
                n = n / 10;

            }

            if(counter % 2 ==0) {
                even++;
            }
        }
        return even;
    }
    */




    //second approach

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }


    /*

     function to check whether a number contains even digits or not.
     steps:
     1)count the no. of digits
     2)convert num eg. 1764 ==> string "1764" take the length of string.

    */

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;

         */


        return numberOfDigits % 2 == 0; //shortcut for above commented code;

    }

    //count number of digit in a number
    static int digits(int num) {

        // if number is negative make it positive
        if(num<0){
            num *= -1; //num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num>0){
            count++;
            num /= 10; //num = num / 10
        }


        return count;
    }

    //Optimized digits() into digits2() as follow as

    static int digits2(int num){

        //if num is negative then make it positive.
        if(num < 0){
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1; //Here without using while loop we do in single step other all things. so it more optimized than above digits()



    }





}
