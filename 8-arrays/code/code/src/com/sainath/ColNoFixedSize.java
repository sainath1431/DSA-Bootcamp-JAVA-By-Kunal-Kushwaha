package com.sainath;

import java.util.Arrays;

public class ColNoFixedSize {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4},
                { 5, 6},
                { 7, 8 ,9}
        };


        //Traditional Way
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        };

        //Second Way Arrays.toString() with row for loop
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // By using Enhanced for loop / for-Each loop.

        /*
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
        */

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }



    }
}
