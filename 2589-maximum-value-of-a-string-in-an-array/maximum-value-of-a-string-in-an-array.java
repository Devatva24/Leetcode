class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i=0;i<strs.length;i++) {
            if(helper(strs[i])) {
                int val = Integer.parseInt(strs[i]);
                max = Math.max(max, val);
            } else {
                max = Math.max(max, strs[i].length());
            }
        }
        return max;
    }
    public boolean helper(String s) {
        for(int i=0;i<s.length();i++) {
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
}