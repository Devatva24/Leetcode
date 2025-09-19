class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return gcd(min, max);
    }
    public int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        if(a < b) return gcd(b, a);
        return gcd(b, a%b);
    }
}