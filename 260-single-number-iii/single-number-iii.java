class Solution {
    public int[] singleNumber(int[] nums) {
        //find the total xor of the array
        int total_xor = 0;
        for(int n : nums) total_xor ^= n;

        //divide the array into two groups where the bit of xor_total is 1 :
        //either one of the element will contain 0 or 1
        int first_group_xor = 0;
        int second_group_xor = 0;

        //find the ith bit which is 1
        int ith_bit = 0;
        while(((total_xor >> ith_bit) & 1) != 1) ith_bit++;
        
        //find the xor of each element in the group : left would be alone element
        //since duplicate elements would be present in same group
        for(int num : nums) {
            if(((num >> ith_bit) & 1) == 1) first_group_xor ^= num;
            else second_group_xor ^= num;
        }
        return new int[] {first_group_xor, second_group_xor};
    }
}