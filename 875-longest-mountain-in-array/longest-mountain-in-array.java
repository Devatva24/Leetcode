class Solution {
    public int longestMountain(int[] nums) {
        int max = 0;
        for(int i=1;i<nums.length-1;i++) {
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                int pivot = i;
                int left = i-1;
                int right = i+1;
                while(true) {
                    if(left - 1 >= 0 && nums[left] > nums[left - 1]) left--;
                    else break;
                }
                while(true) {
                    if(right + 1 < nums.length && nums[right] > nums[right + 1]) right++;
                    else break;
                }
                max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}