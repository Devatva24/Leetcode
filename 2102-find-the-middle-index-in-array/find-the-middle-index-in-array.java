class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        int sum = nums[0];
        prefix[0] = sum;
        for(int i=1;i<prefix.length;i++) {
            sum = sum + nums[i];
            prefix[i] = sum;
        }
        int[] suffix = new int[nums.length];
        sum = 0;
        suffix[0] = nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--) {
            sum = sum + nums[i];
            suffix[i] = sum;
        }
        for(int i=0;i<nums.length;i++) {
            if(suffix[i] == prefix[i]) {
                return i;
            }
        }
        return -1;
    }
}