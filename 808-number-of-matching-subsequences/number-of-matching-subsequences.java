class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++) {
            if(words[i].length() > s.length()) continue;
            else if(isSubsequence(words[i], s)) count++;
        }
        return count;
    }
    public boolean isSubsequence(String word, String input) {
        int prevIndex = -1;
        for(char ch : word.toCharArray()) {
            int index = input.indexOf(ch, prevIndex);
            if(index == -1) return false;
            prevIndex = index + 1;
        }
        return true;
    }
}