package com.sainath;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayElements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = {12, 34, 56, 67, 89, 34};

        System.out.print("Original Array : " + Arrays.toString(arr));

        System.out.println();

        System.out.println("Enter the Swapped element Index : ");

        System.out.print("Index 1 : ");
        int index1 = in.nextInt();

        System.out.print("Index 2 : ");
        int index2 = in.nextInt();

        swap(arr,index1,index2);

        System.out.println();

        System.out.println("Swapped Array : " + Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
