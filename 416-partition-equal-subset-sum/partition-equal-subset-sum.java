class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        if(sum%2 != 0) return false;
        int n = nums.length;
        int target = sum/2;
        boolean[][] dp = new boolean[n+1][target + 1];
        for(int i=0;i<=n;i++) {
            dp[i][0] = true;
        }
        for(int i=1;i<=target;i++) {
            dp[0][i] = false;
        }
        for(int index = 1;index<=n;index++) {
            for(int weight = 1;weight<=target;weight++) {
                if(weight < nums[index-1]) {
                    dp[index][weight] = dp[index-1][weight];
                } else {
                    dp[index][weight] =  dp[index - 1][weight - nums[index - 1]] || dp[index-1][weight];
                }
            }
        }
        return dp[n][target];
    }
}