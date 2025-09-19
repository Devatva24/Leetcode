class Solution {
    public long maxScore(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1L * nums[0] * nums[0];

        long max = 0;

        // try removing each element
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, helper(nums, i));
        }

        // case: use all elements
        long totalLCM = nums[0];
        long totalGCD = nums[0];
        for (int i = 1; i < nums.length; i++) {
            totalLCM = lcm(totalLCM, nums[i]);
            totalGCD = gcd(totalGCD, nums[i]);
        }
        max = Math.max(max, 1L * totalLCM * totalGCD);

        return max;
    }

    public long helper(int[] nums, int skip) {
        long currLCM = -1;
        long currGCD = -1;

        for (int i = 0; i < nums.length; i++) {
            if (i == skip) continue;

            if (currLCM == -1) { // first element
                currLCM = nums[i];
                currGCD = nums[i];
            } else {
                currLCM = lcm(currLCM, nums[i]);
                currGCD = gcd(currGCD, nums[i]);
            }
        }
        return 1L * currLCM * currGCD;
    }

    public long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
