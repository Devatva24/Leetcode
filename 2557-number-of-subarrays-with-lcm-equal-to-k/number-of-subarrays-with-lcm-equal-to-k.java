class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            int lcm = nums[i];
            if(lcm == k) count++;
            for(int j=i+1;j<nums.length;j++) {
                lcm = lcm(lcm, nums[j]);
                if(lcm == k) count++;
                if(lcm > k) break;
            }
        }
        return count;
    }
    public int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    public int lcm(int x, int y) {
        return (x / gcd(x, y)) * y;
    }
}