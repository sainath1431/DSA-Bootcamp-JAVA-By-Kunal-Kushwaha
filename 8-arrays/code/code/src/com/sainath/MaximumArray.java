package com.sainath;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = { 14, 122, 34, 65,3455, 333,443};

        // print the maximum of Array
        System.out.print("Array : " + Arrays.toString(arr));
        System.out.println();
        System.out.print("Maximum of Array : " + max(arr));
        System.out.println();

        // print the maximum of Array within given Range.
        System.out.print("Array : " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Enter the Range : ");
        System.out.print("Start (Index) : ");
        int start_index = in.nextInt();
        System.out.print("End (Index) : ");
        int end_index = in.nextInt();
        System.out.print("Maximum of Array : " + maxRange(arr,start_index,end_index));



    }

    //Imagine that array is not empty
    static int max(int[] arr){
        //handle the empty array condition by returning -1;
        if(arr.length == 0){
            return -1;
        }

        //int max = Integer.MAX_VALUE; if array is empty than this max is initiate by random number.
        int max_val=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= max_val){
                max_val = arr[i];
            }
        }

        return max_val;
    }

    // Calculate Maximum from the range of Array.
    static int maxRange(int[] arr,int start, int end){

        //handle out of range condition
        if(end > start){
            return -1;
        }

        //handle null condition
        if(arr == null){
            return -1;
        }

        int max_val=arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] >= max_val){
                max_val = arr[i];
            }
        }

        return max_val;
    }

    //work on edge cases here , like array being null
}
