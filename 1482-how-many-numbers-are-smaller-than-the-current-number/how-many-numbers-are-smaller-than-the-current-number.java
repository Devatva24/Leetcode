class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];
        //store the freq of each ele in buck
        for(int i=0;i<nums.length;i++) {
            buck[nums[i]] += 1;
        }
        //generate prefix sum of all the freq
        for(int i=1;i<=100;i++) {
            buck[i] += buck[i-1];
        }
        //required ans for ith index would be present at i-1(previous valid number)
        for(int i=0;i<nums.length;i++) {
            int pos = nums[i];
            nums[i] = pos == 0 ? 0 : buck[pos - 1];
        }
        return nums;
    }
}