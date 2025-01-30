// container with most water

public class _08_ContainerWithMostWater {
    public static int maxWater(int arr[])
    {
        int n = arr.length;
        int maxWater = 0;
        // initialize two pointers
        int leftPtr = 0;
        int rightPtr = n - 1;

        while(leftPtr < rightPtr)
        {
            // calculate height of container
            int ht = Math.min(arr[leftPtr], arr[rightPtr]);

            int width = rightPtr - leftPtr;

            int currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            if(arr[leftPtr] < arr[rightPtr])
            {
                leftPtr++;
            }
            else {
                rightPtr--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(heights));
    }
}
