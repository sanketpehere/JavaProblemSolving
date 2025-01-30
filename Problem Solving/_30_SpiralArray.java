import java.util.ArrayList;
import java.util.List;

public class _30_SpiralArray {
        public static List<Integer> spiralOrder(int[][] matrix) {
            // Check if the matrix is empty
            if (matrix == null || matrix.length == 0) return new ArrayList<>();

            // Get the dimensions of the matrix
            int m = matrix.length; // number of rows
            int n = matrix[0].length; // number of columns
            int[] result = new int[m * n]; // array to store the result
            List<Integer> res = new ArrayList<>(); // temporary list to store elements in spiral order

            // Initialize boundaries
            int top = 0, bottom = m - 1;
            int left = 0, right = n - 1;
            int index = 0;

            // Loop until the boundaries overlap
            while (top <= bottom && left <= right) {
                // Traverse from left to right on the top row
                for (int i = left; i <= right; i++) {
                    res.add(matrix[top][i]);
                }
                top++; // Move the top boundary down

                // Traverse from top to bottom on the right column
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
                right--; // Move the right boundary left

                // Traverse from right to left on the bottom row
                if (top <= bottom) { // Check if there's a valid row left to traverse
                    for (int i = right; i >= left; i--) {
                        res.add(matrix[bottom][i]);
                    }
                    bottom--; // Move the bottom boundary up
                }

                // Traverse from bottom to top on the left column
                if (left <= right) { // Check if there's a valid column left to traverse
                    for (int i = bottom; i >= top; i--) {
                        res.add(matrix[i][left]);
                    }
                    left++; // Move the left boundary right
                }
            }
            return res;
        }
    public static void main(String[] args) {
            int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
            System.out.println(spiralOrder(arr));
    }

}
