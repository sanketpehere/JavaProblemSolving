public class _06_findMinInRotatedSortedArray {
        public static int findMin(int[] nums) {

            // modified binary search
            int left = 0; //left pointer at 0th element
            int right = nums.length -1;

            while(left < right)
            {
                int mid = left + (right - left) / 2;
                // if middle element is greater than rightmost then, minimum element is on the right half
                if(nums[mid] > nums[right])
                {
                    // move left to mid + 1
                    left = mid + 1;
                }
                else // otherwise
                {
                    right = mid;
                }
            }
            return nums[left]; // when left == right, while loop breaks, and left points to the minimum element
        }

    public static void main(String[] args) {
        int nums[] = {3,4,5,0,1,2};
        System.out.println(findMin(nums));
    }
}
