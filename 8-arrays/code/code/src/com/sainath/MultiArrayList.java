package com.sainath;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    /*
    MultiArrayList : ArrayList inside Arraylist
    it is like multidimensional array concept.

    */



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //declaration of Multi Array list
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();

        //initialization of Multi Array List.
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); //create individual Arraylist in the ArrayList
        }

        //get inputs and add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt()); //access individual arraylist and add in that input.
            }
        }

        System.out.println(list);

    }


}
