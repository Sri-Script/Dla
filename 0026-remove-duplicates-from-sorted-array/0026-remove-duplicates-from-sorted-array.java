class Solution {
    public int removeDuplicates(int[] nums) {
        int write = 1;//The first element is automatically unique because nothing comes before it

        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[write - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}
