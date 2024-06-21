package com.sainath;

public class Floor {

    public static void main(String[] args) {

        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -19;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    //return the index
    //return index of the greatest element which is smaller than or equal to the target.(index of floor of target element)
    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end =  arr.length-1;

        while(start <= end){
            //find the middle element.
            //int mid = (start + end)/2 ; //might be possible that (start + end) exceeds the range of int.

            int mid  = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                //return ans
                return mid;
            }
        }

        // if above inside while is not execute that means element is not exist so return end;
        return end;
    }
}
