public class test{
    public static void main(String[] args){

        int[][] arr= {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };


        flipAndInvertImage(arr);
        // int[][] ans = flipAndInvertImage(arr);

        // for(int[] nums : ans){
        //     System.out.println(Arrays.toString(nums));

        // }


    }

    static void flipAndInvertImage(int[][] image) {
        
        // for(int row  = 0 ; row < image.length ; row++){
        //     int n = image[row].length;
        //     for(int col = 0 ; col < n /2 ; col++){

                
        //         int temp = image[row][col];
        //         image[row][col] = image[row][n - col];
        //         image[row][n - col] = temp;


        //         System.out.print(image[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        for(int[] nums : image){
            int n = nums.length-1;
            for(int i = 0;  i < n/2 ; i++){
                int temp = nums[i];
                nums[i] = nums[n - i];
                nums[n - i] = temp;
            }

            for(int i = 0 ; i <= n ; i++ ){
                if(nums[i] == 0){
                    nums[i] = 1;
                } else{
                    nums[i] = 0;
                }
            
            }
            
            for(int i = 0 ; i <= n ; i++){
                System.out.print(nums[i]+ " ");
            }
            System.out.println();
        }

        


        
    }
}





