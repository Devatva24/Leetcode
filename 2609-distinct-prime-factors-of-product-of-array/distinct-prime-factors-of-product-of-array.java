class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
            for(int j=2;j*j<=nums[i];j++) {
                while(nums[i]%j == 0) {
                    set.add(j);
                    nums[i]=nums[i]/j;
                }
            }
            if(nums[i] > 1) set.add(nums[i]);
        }
        return set.size();
    }
}