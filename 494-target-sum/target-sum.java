class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        int[][] dp = new int[n+1][sum+1];
        for(int i=0;i<=n;i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++) {
            for(int j=0;j<=sum;j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j - nums[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int ele = (target + sum)/2;
        int count = 0;
        if((target + sum)%2 != 0) return 0;
        for(int i=0;i<=sum;i++) {
            if(dp[n][i] != 0) {
                if(ele == i) count += dp[n][i];
            }
        }
        return count;
    }
}