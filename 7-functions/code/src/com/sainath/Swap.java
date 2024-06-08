package com.sainath;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //swap numbers code

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);

        System.out.println(a + " " + b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name  = "rahul Rana"; // here we have not modifying the object rather than creating an new object.

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        //this change will only be valid in this function scope only.


    }
}
