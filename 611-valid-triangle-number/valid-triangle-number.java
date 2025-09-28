class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int k=nums.length-1;k>=2;k--) { // fixed the greatest side
            int i=0;
            int j=k-1;
            while(i<j) {
                if(nums[i] + nums[j] > nums[k]) {
                    count+=(j-i); // all the elements which form pair and are between i and j 
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}