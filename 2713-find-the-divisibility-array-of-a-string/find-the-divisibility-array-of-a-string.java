class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] ans = new int[word.length()];
        long prefix = 0;
        for(int i=0;i<word.length();i++) {
            prefix = (prefix * 10 + (word.charAt(i) - '0'))%m;
            if(prefix == 0) ans[i] = 1;
            else ans[i] = 0;
        }
        return ans;
    }
}