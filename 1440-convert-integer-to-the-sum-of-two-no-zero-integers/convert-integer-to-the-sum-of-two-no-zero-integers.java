class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i=1;i<=n;i++) {
            if(!checkZero(i) && !checkZero(n-i)) {
                ans[0] = i;
                ans[1] = n - i;
                break;
            }
        }
        return ans;
    }
    public boolean checkZero(int n) {
        while(n!=0) {
            int d = n%10;
            if(d == 0) return true;
            n = n/10;
        }
        return false;
    }
}