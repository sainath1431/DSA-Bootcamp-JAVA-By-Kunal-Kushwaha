package com.sainath;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr,target,1,4));

    }


    static int linearSearch(int[] arr, int target , int start, int end){
        //if array is empty then return -1;
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = start; index <= end; index++) {
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
