class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int left = 0;
        long product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            // Include nums[right] in the window
            product *= nums[right] ;

            // Shrink until the product is valid
            while (product >= k) {
                product /= nums[left];
                left++;
            }

            // Count valid subarrays ending at right
            count += right - left + 1;;
        }

        return count;
    }
}
