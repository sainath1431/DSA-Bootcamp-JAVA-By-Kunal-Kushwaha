package com.sainath;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        /*
        int[] reverse = reverseArray(arr);
        System.out.println(Arrays.toString(reverse);

         */

        //call second reverse Array method/function.
        reverse(arr);

    }


    /*

    //By for loops Reversing An Array
    static int[] reverseArray(int[] arr) {

        int n = arr.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }

        return arr;

    }


     */

    // Arrays Reversing using while loop and it uses for even number Arrays or odd number Arrays.

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.print("Reverse Array : " + Arrays.toString(arr));
    }


    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}