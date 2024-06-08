package com.sainath;

public class Scopping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//
//           int a = 78; //already initialized outside the block in the same method , hence you cannot initialized again.

            a = 100; //here reassign the origin ref variable ot some other value.
            System.out.println(a);//but you can change/update variable.
            int c = 99;
            //values initialised in this block, will remain in block.
        }
//        System.out.println(c); we cannot use initialized block variable out side the block

        String name = "Rahul";
        {
            name = "sainath";

        }

        System.out.println(name);
        
        //Scoping in for loops

        for (int i = 0; i < 4; i++) {
            System.out.println(i);

        }

//        System.out.println(i);// we cannot access i outside for loop.

        //note : what ever value are already defined in the scope of the function of the for loop or the block we cannot initialize those again.
        //note : anything will be initialized outside the block can be used inside the block. but anything will be initialized the block cannot use outside the block.
        // note : anything will be initialized outside the block cannot again initialized the inside the block but anything will be initialized inside the block can be again initialized out side the block.
        
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

        // we cannot use the variable which initialized function ,are not used variabels outside the function scope.

    }
}
