public class _05_productExceptSelf {
        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            // calculating product on the left side of the i element
            int prefix[]  = new int[nums.length];
            // calculate product on the right side of the ith element
            int suffix[] = new int[nums.length];

            prefix[0] = 1; // since no element before first
            for(int i = 1; i < n; i++)
            {
                prefix[i] =  prefix[i - 1] * nums[i - 1];
            }

            suffix[n- 1] = 1; // since no element after last
            for(int i = n - 2 ; i >= 0; i--)
            {
                suffix[i] = suffix[i + 1] * nums[i + 1]; // calculating actual products
            }

            int res[] = new int[n];

            for(int i = 0; i < n; i++)
            {
                res[i] = prefix[i] * suffix[i];
            }
            return res;
        }

    public static void main(String[] args) {
            int num[] = {1, 2, 3,4 , 5, 6};
            int res[] = productExceptSelf(num);
            for(int i = 0; i < res.length; i++){
                System.out.print(res[i] + " ");
            }
    }
}
