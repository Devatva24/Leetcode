class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        int[] dp = new int[n+1];
        Arrays.fill(dp, 0);
        dp[1] = 1;
        if(n == 1) return dp;
        for(int i=2;i<=n;i++) {
            if(i%2 == 0) dp[i] = dp[i/2];
            else dp[i] = 1 + dp[i/2];
        }
        return dp;
    }
    // public int helper(int n, int[] dp) {
    //     if(n == 0) return dp[0];
    //     if(n == 1) return dp[1];
    //     if(n%2 == 0) return dp[n] = 0 + helper(n/2, dp);
    //     return dp[n] = 1 + helper(n/2, dp);
    // }
}