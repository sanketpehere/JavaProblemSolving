import java.util.ArrayList;
import java.util.List;

public class _24_NextPermutation {
    public static List<Integer> nextPermutaion(int arr[])
    {
        int i = arr.length - 2;
        while (i >= 0  && arr[i] >= arr[i+1])
        {
            i--;
        }
        if(i >= 0)
        {
            int j = arr.length - 1;
            while (arr[j] <= arr[i])
            {
                j--;
            }

            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);

        List<Integer>result = new ArrayList<>();
        for(int num : arr)
        {
            result.add(num);
        }
        return  result;
    }
    public static void reverse(int arr[], int start, int end)
    {
        while (start < end)
        {
            swap(arr,start, end);
            start++;
            end--;
        }
    }
    public static void swap(int arr[], int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5,4};
        System.out.println(nextPermutaion(arr));
    }
}
