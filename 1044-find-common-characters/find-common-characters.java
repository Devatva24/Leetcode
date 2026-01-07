class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            freq[words[0].charAt(i) - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] fre = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                fre[words[i].charAt(j) - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                freq[j] = Math.min(freq[j], fre[j]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                list.add(String.valueOf((char)(i + 'a')));
            }
        }
        return list;
    }
}