class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--) {
            if(carry == 1 && digits[i] < 9) {
                digits[i] = digits[i] + carry;
                carry = 0;
            } else if(carry == 1 && digits[i] == 9) {
                int sum = digits[i] + carry;
                digits[i] = sum % 10;
            }
        }
        if(carry == 1) {
            int[] ans = new int[digits.length+1];
            for(int i=1;i<ans.length;i++) {
                ans[i] = digits[i-1];
            }
            ans[0] = 1;
            return ans;
        }
        return digits;
    }
}