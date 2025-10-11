class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] dp = new int[energy.length];
        int max = Integer.MIN_VALUE;
        for(int i=energy.length-1;i>=0;i--) {
            dp[i] = energy[i];
            if(i + k < energy.length) {
                dp[i] = dp[i] + dp[i+k];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}