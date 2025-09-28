class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // we make use of remainder
        // if the remainder of two number is same then there ought to be subarray with sum divisible by that number
        // 0%5 = 0
        // 1%5 = 1
        // 2%5 = 2
        // 3%5 = 3
        // 4%5 = 4
        // 5%5 = 0 here the 0 already exist cal sum from 1 to 4 = 1 + 2 + 3 + 4 = 10 divisible by 5
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int result = 0;
        for(int i=0;i<nums.length;i++) {
            prefix += nums[i];
            int remainder = ((prefix % k) + k) % k;
            if(map.containsKey(remainder)) {
                result += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return result;
    }
}