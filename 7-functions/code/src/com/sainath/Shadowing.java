package com.sainath;

public class Shadowing {
    static int x = 90; //static is write because we cannot use object dependent things in object independent things (Static Methods).
    // This will be shadowed at line 9 because the lower level scope overlaping the uperleve scope.
    public static void main(String[] args) {
        System.out.println(x);//90
        int x ;//the class variable at line 4 is shadowed by this.
//        System.out.println(x); The scope of the local variable that shadows the class variable is not begining at the point where the local scope begins
                                // Shadowing begins actually when the local variable is declared.
                                // scope will begin when value is initialised.
        x = 40;
        System.out.println(x);//40
        func();

    }

    /*
    Shadowing in Java is practice of  using two variables with the same name within the scope that overlaps

    When you add another same name variable in the scope where overlap the variable with higher level scope is hidden

    Shadowing is does not take place in methods.

     */

    static void func(){
        System.out.println(x);
    }
}
