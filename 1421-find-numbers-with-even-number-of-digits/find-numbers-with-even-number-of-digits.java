class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(countDigit(nums[i])%2 == 0) {
                count++;
            }
        }
        return count;
    }
    public int countDigit(int a) {
        int count = 0;
        while(a!=0) {
            int d = a%10;
            count++;
            a=a/10;
        }
        return count;
    }
}