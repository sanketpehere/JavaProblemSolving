public class _02_FindingMissingNumber {
    // array of n size is given containing element from 0 to n
    // need to find missing element
    // first calculate sum of n
    // then calculate sum of array
    // diff between these two is the missing value
    public static int findMissingNumber(int arr[])
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i <= arr.length; i++)
        {
            sum1+=i;
        }
        for(int i = 0; i < arr.length; i++)
        {
            sum2+=arr[i];
        }

        return (sum1 - sum2);
    }
    public static void main(String[] args) {
        int arr[] =  {0, 1, 2, 4};
        System.out.println(findMissingNumber(arr));
    }
}
