class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);
    }
    public int helper(int index, int[] dp) {
        if(index == 0) {
            return 1;
        }
        if(index == 1) {
            return 1;
        }
        if(dp[index] != -1) return dp[index];
        return dp[index] = helper(index-1, dp) + helper(index-2, dp);
    }
}