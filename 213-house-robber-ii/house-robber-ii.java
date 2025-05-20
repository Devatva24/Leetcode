class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1, -1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        int[] ans1 = new int[nums.length-1];
        int[] ans2 = new int[nums.length-1];
        for(int i=1;i<=ans1.length;i++) {
            ans1[i-1] = nums[i];
        }
        for(int i=0;i<ans2.length;i++) {
            ans2[i] = nums[i];
        }
        int index = ans1.length-1;
        return Math.max(helper(index, ans1, dp1), helper(index, ans2, dp2));
    }
    public int helper(int index, int[] nums, int[] dp) {
        if(index == 0) return nums[0];
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];
        int notpick = helper(index - 1, nums, dp);
        int pick = nums[index] + helper(index - 2, nums, dp);
        return dp[index] = Math.max(notpick, pick);
    }
}