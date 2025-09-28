class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int k = nums.length - 1; k >= 2; k--) {
            if (nums[k - 2] + nums[k - 1] > nums[k]) {
                return nums[k - 2] + nums[k - 1] + nums[k];
            }
        }
        return 0;
    }
}