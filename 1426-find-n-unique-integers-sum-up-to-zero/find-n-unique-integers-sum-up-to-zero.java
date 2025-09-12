class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int c = 0;
        if(n%2 == 0) {
            for(int i=1;i<=(n/2);i++) {
                ans[c] = i;
                c++;
                ans[c] = -i;
                c++;
            }
        } else {
            ans[c] = 0;
            c++;
            for(int i=1;i<=(n/2);i++) {
                ans[c] = i;
                c++;
                ans[c] = -i;
                c++;
            }
        }
        return ans;
    }
}
