// rotate 2D array by 90degrees in clockwise direction
// in case of anticlockwise direction take trans. and then reverse each column.
public class _31_Rotate2DArray {
    public static void rotateArray(int[][] arr){
        int n = arr.length;
        // 1. take transpose
        for(int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //2.reverse each row
        for(int i = 0; i < n ; i++){
            int start = 0;
            int end = n- 1;
            while (start < end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int num[] : arr)
        {
            for(int a : num){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println("_-----------------------------------_");
        rotateArray(arr);
        for (int num[] : arr)
        {
            for(int a : num){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
