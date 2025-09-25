class Solution {
    public int minInsertions(String s) {
        String s1 = s;
        // for(int i=s.length()-1;i>=0;i--) {
        //     s2 += s.charAt(i);
        // }
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String s2 = new String(arr);
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(i=1;i<=n;i++) {
            for(j=1;j<=m;j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int ans = n + m - 2 * dp[n][m];
        return ans/2;  
    }
}