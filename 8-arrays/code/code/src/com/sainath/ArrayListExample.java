package com.sainath;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    /*
        Why need of ArrayList : In array we have fixed size, But what if you don't know
                                the size of array what will you do then, you will do then
                                hey java please handle the size for me , and let me input
                                any number of element that I have want. In such Situations/
                                Problem statement We use the Array List.

        ArrayList is similar to Vectors in c++.
        ArrayList is part of Collections Framework in java.
        ArrayList is present in java.util package.
        ArrayList is a Class.
        In ArrayList : We cannot pass the primitive(int, char, float, double...) data types.
                     we can pass Wrapper Classes (Integer,Float,Char,Boolean..)


        Syntax :
        ArrayList<Datatype> list = new ArrayList<>();
        (Class)    (type)               (Constructor)

        for Integer
        ArrayList <Integer> list = new ArrayList<>();
    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //ArrayList<>(argument) this Constructor takes an argument which show initialCapacity of ArrayList.
        //We can't add primitives (int , float..) . we have to add Wrapper Class (Integer, Float ,Double...).

        ArrayList<Integer> list = new ArrayList<>(10);

        // here we declare initialCapacity is 10 but we can more than 10 elements in the arraylist.


        //list object has add() which takes an integers and add into list.
        //Here We can add as many as integers as we required.
//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(70);
//        list.add(72);
//        list.add(78);
//        list.add(100);

        /*
        //print the Arraylist object (list)
        System.out.println(list);
        System.out.println(list.contains(78));//true list.contains(value) check the value is present in list or not.
        System.out.println(list.set(0,99));
        list.remove(2);//removes the element at index 2 from list.
        System.out.println(list);
        */

        //input in ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item/element at any index.
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");//pass index here in list.get(index), list[index] syntax will not work here.

        }

        //print list directly
        System.out.println(list);


    }

}
