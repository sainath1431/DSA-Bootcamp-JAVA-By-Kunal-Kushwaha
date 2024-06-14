package com.sainath;

public class Main {
    public static void main(String[] args) {

//        int[] nums = {};
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }


    //search the target and return ture or false.
    // use this when target is -1
    static boolean linearSearch3(int[] arr, int target){
        //if array is empty then return -1;
        if(arr.length == 0){
            return false;
        }

        //run a  enhanced for loop to access each element of arr.
        for(int element:arr){
            // To Check the target is equal to the element or not.
            if(element == target){
                return true;
            }
        }

        //This line will execute if none of the return statement above have executed.

        //return Integer.MAX_VALUE; //If our target is '-1' . Integer.MAX_VALUE --> constant and constant are written in capital letter.

        return false;
    }

    //search the target and return the element (By using enhanced for loop)

    static int linearSearch2(int[] arr, int target){
        //if array is empty then return -1;
        if(arr.length == 0){
            return -1;
        }

        //run a  enhanced for loop to access each element of arr.
        for(int element:arr){
            // To Check the target is equal to the element or not.
            if(element == target){
                return element;
            }
        }

        //This line will execute if none of the return statement above have executed.

        return -1;
    }



    /*
        Search in the Array : return the index if item found
                              Otherwise if item not found return -1
     */

    static int linearSearch(int[] arr, int target){
        //if array is empty then return -1;
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            //check for element at every index if it is = target
            if(element == target){
                return index;
            }

        }

        //This line will execute if none of the return statement above have executed.

        return -1;
    }

}
