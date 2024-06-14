package com.sainath;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

        System.out.println(isArmstrong(n));

        /*
        //To print the Three digit Armstrong number (counter start : 100 and counter ends : 1000)

        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }

        // Output : 153 370 371 407

         */
    }

    static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }

        int c = 2;
        while( c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
    /*
        if( c * c > n){
            return true;
        }

        return false;

        in above code is reduce by below return statement.
        in above code c * c > n is return true and then if run and return ture so
        we have directly check the condition and return true if condition is true
        otherwise return false so that we reduce the code by following code.


    */
        return c * c > n;



    }

    // print all the 3 digits armstrong numbers.

    static boolean isArmstrong(int n){
        int original = n; //to check at the last with the input value of n.
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n = n / 10;

        }

        /*
        if( sum == original){
            return true;
        }

        return false;

        replace above commented code by return statement condition;
         */

        return sum == original;
    }


}
