class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int days = n%7;
        int ans = weeks * 28 + (weeks * (weeks - 1) / 2) * 7;
        for(int i=1;i<=days;i++) {
            ans = ans + i + weeks;
        }
        return ans;
    }
}