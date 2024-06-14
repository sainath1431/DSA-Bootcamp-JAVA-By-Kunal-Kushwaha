package com.sainath;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    /*
         eg. 2-D   1 2 3
                   4 5 6
                   7 8 9

         Representation of Arrays:

         1-D Array ---> int[] arr = new int[size];
         2-D Array ---> int[][] arr = new int[rows(mandatory)][cols(not mandatory)]; // here rows are mandetory but cols are not.


         Direct initialization of Array :

         1-D Array ---> int[] arr = {2,3,4,5};
         2-D Array ---> int[][] arr = {
                                        { 1 , 2 , 3 },  //row 1
                                        { 4 , 5 , 6 }, //row 2
                                        { 7 , 8 , 9 }  //row 3
                                     }

          Important Notes for 2-D array:

          i) The size of individual arrays inside main array is does not matter.
             arr[0].length = 3  ---> {1,2,3}
             arr[1].length = 2 ---> {4,5}
             arr[2].length = 4 ---> {6,7,8,9}

             int [][] arr = {
                                { 1, 2, 3}, // array size is 3 or col no is 3 in row 1
                                { 4, 5}, //array size is 2 or col no is 2 in row 2
                                { 6, 7, 8, 9}, //array size is 4 or col no is 4 in row 3
                            }
             // we can see above example size of individual array is not matter
                so that the column size is not mandatory at tha time of initialization of array.


     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int[][] arr = new int[3][3];
        // System.out.println(arr.length);// no of rows.

        //input in 2-D Array

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        /*
        //Output in 2-D Array (First Way)

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Output in 2-D Array (Third Way By Enhanced For-Each loop)

        for (int[] newArr : arr) {
            System.out.println(Arrays.toString(newArr));
        }
        */


        //Output in 2-D Array (Second Way)

        for (int row = 0 ; row < 3 ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}