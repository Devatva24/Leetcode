class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int xor1 = 0;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                xor1 ^= nums[i];
                continue;
            }
            set.add(nums[i]);
        }
        return xor1;
    }
}