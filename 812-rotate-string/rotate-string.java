class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++) {
            String str = rotateString(s, i);
            if(str.equals(goal)) return true;
        }
        return false;
    }
    public String rotateString(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        String st = "";
        reverse(str, 0, n-1);
        reverse(str, 0, k-1);
        reverse(str, k, n-1);
        for(char ch : str) {
            st += ch;
        }
        return st;
    }
    public void reverse(char[] s, int i, int j) {
        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}