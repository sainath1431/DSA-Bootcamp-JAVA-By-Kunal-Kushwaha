package com.sainath;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 56; //[2,3]

        int[] ans = search(arr, target); //format of return value {row,col} --> array int[].

        System.out.println(Arrays.toString(ans));

        System.out.println(max2(arr));
    }

    static int[] search(int[][] arr,int target){

        int row_index;
        int col_index;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                   return new int[] {row, col};
                   //Note : here we can not only write {row,col} because there does not know what is the type of array
                    //so that we have to follow such at the time of returning new array from function.

                }
            }

        }

        // if the element is not found in the 2D Array then return following array which values row , col -1 represents
        // the element is not present in any row of any columns.

        return new int[] {-1,-1};

    }


    // maximum of an 2D array

    //first way

    static int max(int[][] arr){

        int maximum = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if( arr[row][col] > maximum){
                    maximum = arr[row][col];
                }
            }
        }

        return maximum;

    }

    //second Way

    static int max1(int[][] arr){

        // here Integer.MIN_VALUE it store minimum value initially in maximum.
        int maximum = Integer.MIN_VALUE;
        //access the row array inside arr
        for (int row = 0; row < arr.length; row++) {
            // access the value of row array
            for (int col = 0; col < arr[row].length; col++) {
                //check the arr[row][col] is maximum from maximum if it is true then
                // arr[row][col] is stored into maximum

                if( arr[row][col] > maximum){
                    maximum = arr[row][col];
                }
            }
        }

        return maximum;

    }

    //Third Way By Enhanced for loop

    static int max2(int[][] arr){

        int maximum = arr[0][0];

        // access each row (array type)  in 2-D Array
        for(int[] row : arr){
            // access each col (int type) in each row (value) of 2-D Array
            for(int col : row){
                // condition to check the maximum condition.
                if(col > maximum){
                    maximum = col;
                }
            }
        }

        return maximum;

    }
}
