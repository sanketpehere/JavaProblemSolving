import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class _05_KthLargestEelement {
    // using sorting
    public static int kthLargest(int nums[], int k)
    {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // without using sorting
    public static int kthLargest1(int nums[], int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums)
        {
            pq.add(num);
        }
        int res = 0;

        while(k > 0)
        {
            res = pq.poll();
            k--;
        }
        return  res;
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 6, 4};

        System.out.println(kthLargest(arr, 3));
        System.out.println(kthLargest1(arr,3));
    }
}
