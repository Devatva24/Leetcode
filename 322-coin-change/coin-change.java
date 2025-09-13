class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = helper(coins, coins.length-1, amount, dp);
        if(ans >= 1e9) return -1;
        return ans;
    }
    public int helper(int[] coins, int index, int amount, int[][] dp) {
        if(index == 0) {
            if(amount%coins[index] == 0) return (amount/coins[index]);
            return (int)(1e9);
        }
        if(dp[index][amount] != -1) return dp[index][amount];
        int pick = (amount >= coins[index]) ? 1 + helper(coins, index, amount - coins[index], dp) : (int)(1e9);
        int notpick = helper(coins, index - 1, amount, dp);
        return dp[index][amount] = Math.min(pick, notpick);
    }
}