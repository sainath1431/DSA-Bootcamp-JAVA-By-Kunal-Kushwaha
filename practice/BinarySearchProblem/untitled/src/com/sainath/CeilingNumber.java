package com.sainath;

public class CeilingNumber {
    public static void main(String[] args) {

        int[] numbers = {1,3,4,8};
        int target = 9;
        System.out.println(ceilingNumber(numbers,target));

    }

    static int ceilingNumber( int[] arr, int target){

        // when the target is greater than greatest number of array.
        if(target > arr[arr.length-1]){
            return -1;
        }

        //Here target is present then find ceiling of target element.

        int start = 0;
        int end = arr.length - 1;



        while (start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return start;
    }


}
