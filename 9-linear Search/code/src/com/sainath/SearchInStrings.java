package com.sainath;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "sainath";
        char target = 'n';
        System.out.println(search(name, target));
    }

    //here search the char from string by using traditional for loop
    static boolean search(String str,char target){

        //String have String_name.length() method to find the length of the String.
        //internally it have .length method only like array . inside the length().
        if(str.length() == 0){
            return false;
        }

        // To access single char in String then use charAt() method.
        for (int i = 0; i < str.length(); i++) {
              if(str.charAt(i) == target){
                  return true;
              }
        }

        return false;
    }



    //here search char from string using the modern for loop / for each loop

    static boolean search2(String str,char target){

        //String have String_name.length() method to find the length of the String.
        //internally it have .length method only like array . inside the length().
        if(str.length() == 0){
            return false;
        }

        //To convert String into character Array by using toCharArray() method in String.
        //Here use the modern for loop / for each loop to access each character from String.

        for(char ch:str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
