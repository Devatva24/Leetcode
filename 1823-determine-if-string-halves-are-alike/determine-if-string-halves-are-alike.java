class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String vowel = "aeiouAEIOU";
        int count = 0;
        for(int i=0;i<n/2;i++) {
            if(vowel.indexOf(s.charAt(i)) != -1) count++; 
        }
        for(int i=n/2;i<n;i++) {
            if(vowel.indexOf(s.charAt(i)) != -1) count--;
        }
        if(count == 0) return true;
        return false;
    }
}