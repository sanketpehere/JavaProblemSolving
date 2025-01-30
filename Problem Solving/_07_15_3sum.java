import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_15_3sum {
    public static ArrayList<List<Integer>> threeSum(int arr[])
    {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        // sort that array
        Arrays.sort(arr);

        //iterating through the array
        for(int i = 0; i  < n - 2; i++){ //i goes upto n - 2, because to ensure the formation of triplet
            if(i > 0 && arr[i] == arr[i -1]) // skip if duplicate
            {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while(left < right)
            {
                int sum = arr[i] + arr[left]  + arr[right];

                if(sum == 0) // if 0 then add it to result
                {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while(left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0)
                {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {-4, -1, -1, 0, 1,2};
        System.out.println(threeSum(nums));
    }
}
