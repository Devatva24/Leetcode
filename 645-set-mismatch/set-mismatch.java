class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup = -1;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) {
                dup = nums[i];
                continue;
            } else {
                set.add(nums[i]);
            }
        }
        int lost = -1;
        for(int i=1;i<=nums.length;i++) {
            if(!set.contains(i)) {
                lost = i;
                break;
            }
        }
        int[] ans = {dup, lost};
        return ans;
    }
}