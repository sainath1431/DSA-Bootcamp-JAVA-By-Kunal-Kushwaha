
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{
    public static void main(String[] args){
        int m = 2;
        int n = 3;
        int[][] nums = new int[m][n];

        oddCells(m,n,nums);

        // int[][] ans = oddCells(m,n,nums);

        // for(int[] num : ans){
        //     System.out.println(Arrays.toString(num));
        // }
    }

static void oddCells(int m, int n, int[][] indices) {


        for(int i = 0 ; i < indices.length ; i++){
            for(int j = 0 ; j <  indices[i].length; j++){
                indices[i][j] = 0; 
            } 
        }
        
        for(int i = 0 ; i< indices.length; i++)
        {
            for(int j = 0 ; j < indices[i].length ; j++)
            {
                System.out.print(indices[i][j] + " ");
            } 
            System.out.println(" ");
        }
             
        // row imcrement 

        for(int[] row : indices){
            for(int i = 0 ; i < row.length ; i++){
                row[i]++;
            }
        }

        
        for(int[] row : indices){
            for(int i = 0 ; i < row.length ; i++){
                row[i]++;
            }
        }

        
        
}

}
