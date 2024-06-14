package com.sainath;

public class OrderAgnosticBS {

    /*
     Time Complexity for BS for Ascending and BS for Descending is same.


     */
    public static void main(String[] args) {

        //ascending ordered array
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

        //descending order array
        int[] arr2 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target1 = 22;
        int ans1 = orderAgnosticBS(arr2 , target1);
        System.out.println(ans1);
    }

    static int orderAgnosticBS(int arr[] ,int target){
        int start = 0;
        int end =  arr.length-1;

        //find whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            //find the middle element.
            //int mid = (start + end)/2 ; //might be possible that (start + end) exceeds the range of int.

            int mid  = start + (end - start)/2;

            if( arr[mid] == target){
                //return ans.
                return mid;
            }

            if( isAsc == true ){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        // if above inside while is not execute that means element is not exist so return -1;
        return -1;
    }

}
