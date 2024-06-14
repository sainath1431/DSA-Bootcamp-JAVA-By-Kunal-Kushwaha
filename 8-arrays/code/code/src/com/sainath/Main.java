package com.sainath;

public class Main {
    public static void main(String[] args) {

        //Q: store a roll number
        int a  = 19;

        //Q: store a Student's name
        String name = "Sainath Wankhede";

        //Q: Store a 5 roll numbers
        int roll1 = 43;
        int roll2 = 44;
        int roll3 = 45;
        int roll4 = 46;
        int roll5 = 47;

        //Q: Store a 500 roll numbers

        /*
        This is very tedious task or hectic task by using
        Traditional way of storing roll numbers and each
        manual initialization of roll number is very
        hectic process. This problem is solved by using the
        Arrays Concept.

         */

        /*
        Array : Collection of data types either it can Primitive
                Data , non - primitive data (objects,complex data types).
                you can store in it array.


         Syntax :
         datatype[] variable_name/array_name = new datatype[size];


         store 5 roll numbers:
         int[] rnos = new int[5];
         rnos this reference variable is pointing to an array object
         that contain type integer values.



         Or directly :
         int[] rnos2 = {23, 12, 45, 32, 15};

         Note :
         i) datatype represents what type of data store in arrays.
         ii) all the type of data in array should be same.(cannot store mixed type of data in array)
         iii) if you don't mention the size of array give an error.

        int[] rnos; // declaration of array : rnos is getting defined in  the stack.(it will happen at compile time)
        rnos = new int[5]; // Initialization : actually here object is being created in the memory (heap).
                                               (it will happens at runtime this is also known as dynamic memory allocation.)

        int [] ros;
        ros = new int[5]; //[0,0,0,0,0]

        System.out.println(ros[1]);//for integer array by default value is 0








        String [] arr = new String[4]; //[null,null,null,null]
        System.out.println(arr[0]); // for String array by default value is 'null'.
        //null is special literal . null can only assign to non-primitives but not assign to the primitives.
        //null is like to 'None' in python.
        //null is not an any object , data type it is only special value is by default value of non-primitive datatype.


        String str = null; // assign null only to non-primitive.
        int num = null; // null is not assign to primitive.

        Note :
        Primitives (int , char, float ...) are store only in stack.
        But all the objects (String type, Array type, hashmaps ,own types ,classes etc) all are stored into heap memory.



        */



    }
}
