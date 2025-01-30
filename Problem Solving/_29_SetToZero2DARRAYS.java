public class _29_SetToZero2DARRAYS {
    public static void setToZero(int[][] nums)
    {
        int rows = nums.length;
        int cols = nums[0].length;

        // declaring arrays to store whether ith and jth row and col need to be zeroed or not
        boolean[] isRowZero = new boolean[rows];
        boolean[] isColZero = new boolean[cols];

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if(nums[i][j] == 0){
                    isRowZero[i] = true;
                    isColZero[j] = true;
                }
            }
        }

        // setting row to zero
        for (int i = 0; i < rows; i++){
            if(isRowZero[i]){
                for(int j = 0;j  < cols; j++){
                    nums[i][j] = 0;
                }
            }
        }

        //setting col to zero
        for(int i = 0 ; i < cols; i++){
            if(isColZero[i])
            {
                for (int j = 0; j < rows; j++)
                {
                    nums[j][i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[][] = {{1,2, 3}, {5, 0, 7}, {44, 33, 11}};
        setToZero(nums);
        for(int[] num : nums)
        {
           for(int a : num)
           {
               System.out.print(a  + " ");
           }
            System.out.println();
        }
    }
}
