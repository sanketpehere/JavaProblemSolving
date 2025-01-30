public class _01_NextPermutation {
    public static void nexPermutation(int arr[])
    {
        int i = arr.length - 2; //we will be iterating back from right to left with from second last element.

        while(i>=0 && arr[i] >= arr[i +1])
        {
            i--;            // this is for finding the pivot element, at which we find breakpoint
                            // point at which condition become false, we will get value of i ie. breakpoint
        }

        if(i >= 0) // if we find a valid breakpoint then
        {
            int j = arr.length - 1; // this is index of last element
            // we need to swap the pivot element with its immediate greater element
            //finding that greater element
            while (j >= 0 && arr[j] <= arr[i]) {
                j--; // at point condition become false, we will get that greater element than the arr[i];
            }

            // now we need to swap them
            swap(arr, i, j); // function to swap them
        }
        // finally we will reverse the remaining array for getting the nextPermutation
        // also if i becomes <= 0 then we will return reversed array.
        reverse(arr, i+1, arr.length - 1);
    }
    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[], int start, int end)
    {
        while(start < end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3,1,4};
        nexPermutation(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}