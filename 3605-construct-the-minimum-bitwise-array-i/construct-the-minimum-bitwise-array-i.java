class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i=0;i<nums.size();i++) {
            int ele = helper(nums.get(i));
            ans[i] = ele;
        }
        return ans;
    }
    public int helper(int val) {
        for(int i=1;i<=1000;i++) {
            if((i | (i+1)) == val) {
                return i;
            }
        }
        return -1;
    }
}