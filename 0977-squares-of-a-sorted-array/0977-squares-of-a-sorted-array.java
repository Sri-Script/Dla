class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int write = nums.length - 1;
        int[] result = new int[nums.length];

        while(left<=right) {
           int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right] ;

            if(leftSquare>rightSquare){
                result[write] = leftSquare;
                left++;
            } else {
                result[write]= rightSquare;
                right--;
            }
            write--;
        }
        return result;
    }
}