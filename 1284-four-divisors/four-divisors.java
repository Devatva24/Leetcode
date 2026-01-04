class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int ele : nums) {
            int[] ans = factor(ele);
            if(ans[0] == 4) sum += ans[1];
        }
        return sum;
    }
    public int[] factor(int n) {
        int count = 0;
        int sum = 0;
        for(int i=1;i*i<=n;i++) {
            if(n%i == 0) {
                int d1 = i;
                int d2 = n/i;
                if(d1 == d2) { //perfect square
                    sum += d1;
                    count++;
                } else {
                    count += 2;
                    sum += (d1 + d2);
                }
                if(count > 4) break;
            }
        }
        return new int[]{count, sum};
    }
}