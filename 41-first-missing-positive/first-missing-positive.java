class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        //place the elements at there original position by swapping them
        for(int i=0;i<n;i++) {
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        //find the first element that does not matches the previous one
        for(int i=0;i<n;i++) {
            if(nums[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
}