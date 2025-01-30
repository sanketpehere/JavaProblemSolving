//Given an array arr[] of distinct elements size N that is sorted and then rotated around an unknown point,
// the task is to check if the array has a pair with a given sum X.

public class _06_FindPairwithSumSortedRotatedArr {
    public static boolean isPairSum(int arr[], int sum)
    {
        int n = arr.length;
        // find largest element
        int i ;
        for(i = 0; i < n - 1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                break;
            }
        }

        int left = (i + 1) % n; // this is the index of the min element in sorted rotated array
        int right = i; // this is the index of the max. element in sorted rotated array;

        while(left != right)
        {
            // if pair sum exist return true;
            if(arr[left] + arr[right] == sum)
            {
                return true;
            }

            if(arr[left] + arr[right] < sum)
            {
                // then circularly decrement the left pointer
                left = (left + 1) % n;
            }
            else
            {
                // then circularly decrement the right pointer
                right = (n + right - 1) % n;
            }

        }
        return false; // if not exist
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(isPairSum(arr, 1));
    }
}
