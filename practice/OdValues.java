import java.io.*;
import java.util.*;

public class OdValues{
    public static void main(String[] args){

        int m = 3;
        int n = 2;
        int[][] indices = new int[m][n];
        oddCells(m,n,indices);
        
    }

    static void oddCells(int m, int n, int[][] indices) {

        for(int i = 0 ; i < indices.length ; i++){
            for(int j = 0 ; j <  indices[i].length; j++){
                indices[i][j] = 0; 
            } 
        }

        for(int[] num : indices){
            System.out.println(Arrays.toString(num));            
        }
        
    }
}