package com.sainath;

import java.util.Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }

    //find minimum element in the array
    //Assume arr.length != 0
    //return the minimum value in the array
    static int min(int[] arr){
//        if(arr.length == 0){
//            return Integer.MIN_VALUE;
//        }
        int min_val = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min_val) {
                min_val = arr[i];
            }
        }

        return min_val;
    }


}
