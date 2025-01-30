import java.util.HashMap;

public class _34_CommonElementInALLRows {
    // all rows are sorted

    public static int commonElement(int[][] arr)
    {
        HashMap<Integer, Integer> map  = new HashMap<>();
        int row = arr.length;
        int col = arr[0].length;

        for(int j = 0; j < col; j++)
        {
            map.put(arr[0][j], 1);
        }

        for(int i = 1; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(map.containsKey(arr[i][j]) && map.get(arr[i][j]) == i)
                {
                        map.put(arr[i][j], i+1);
                }
            }
        }
        for(int key : map.keySet())
        {
            if(map.get(key) == row)
            {
                return key;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9}
        };
        System.out.println(commonElement(arr));
    }
}
