class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int pivot = -1;
        int count = 0;
        for(int i=1;i<nums.size();i++) {
            if(nums.get(i-1) > nums.get(i)) {
                pivot = i;
                count++;
            }
        }
        if(pivot == -1) return 0;
        if(count > 1) return -1;
        if(nums.get(nums.size() - 1) > nums.get(0)) return -1;
        return (nums.size()) - pivot;
    }
}