package com.sainath;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {

        /*
        Arrays are mutable. (changeable)

        In below example index 0 value is change 3 to 99 . so that original value changes
        so that Arrays are mutable in nature.

        in below nums and arrs are both reference variable are point to the same array object.


         */
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));//[3, 4, 5, 12]

        change(nums);
        System.out.println(Arrays.toString(nums));//[99, 4, 5, 12]

    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
