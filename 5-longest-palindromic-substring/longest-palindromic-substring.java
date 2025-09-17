class Solution {
    public String longestPalindrome(String s) {
        int sp = -1;
        int len = Integer.MIN_VALUE;
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                if(isPalindrome(s, i, j, dp) == 1) {
                    if(j-i+1 > len) {
                        sp = i;
                        len = j - i + 1;
                    }
                }
            }
        }
        return s.substring(sp, sp + len);
    }
    public int isPalindrome(String s, int i, int j, int[][] dp) {
        if(i >= j) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)) return dp[i][j] = isPalindrome(s, i+1, j-1, dp);
        return dp[i][j] = 0;
    }
}