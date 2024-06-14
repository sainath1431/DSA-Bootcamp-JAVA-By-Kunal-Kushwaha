package com.sainath;

public class Main {

    public static void main(String[] args) {
        /*

           Binary Search :

           - Binary Search is used for sorted arrays.
                sorted Array : Ascending order sorted array : [ 2, 3, 6, 8, 10]
                               Descending order sorted array : [10, 8, 6, 3, 2]

            Algorithm:
            1)find the middle element
            2) target > mid ==> search in the right
               else search in left
            3) if middle element ==  target element // ans

            if ( start > end ) : element not found.

            Time Complexity :

                -Best Case : O(1) (constant) The target element is middle element of array.
                -Worst Case :

             Why Binary Search ?
                -Total comparisons in the worst case  = log(n)
                - for example : Search in a 1,000,000
                                By linear Search --> 1,000,000 comparisons done.
                                By binary Search --> only 20 comparisons done.
                - From above example we can see that huge difference in searching comparisons of  By linear search and By binary search
                  that's binary search take very less time to search than linear search so that binary search is more important.


             Order-Agnostic Binary Search :
             - In order-Agnostic Binary search is used when we know the array is sorted but we not
               know the array is sorted in which either is ascending or descending such problem solve
               by Order-Agnostic Binary Search.

              - for ex arr = [3,3,3,5,6,7,8,9,10,33]  ( s > f )==>( 33 > 3 )-->true so that it is ascending sorted array.
                              f-->first           s-->second
                              first no. of array  last no. of array

                              because the first two no may be same at that time we cannot determine
                              array is ascending or descending so that we take worst case scenario
                              in that first is Take to first element of array and second is take to
                              last element of array.

                     we have to check either array is sorted in ascending or descending manner
                     so that we have to check first (f) and second (s)

                     if ( s > f ) ==> ascending /Increasing order
                     else ==> descending / decreasing order.



         */
    }
}
