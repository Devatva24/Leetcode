class Solution {
    public int compress(char[] chars) {
        List<Character> list = new ArrayList<>();
        int i=0;
        int j = 0;
        for(;j<chars.length;j++) {
            if(chars[i] == chars[j]) {
                continue;
            } else {
                list.add(chars[i]);
                int freq = j - i;
                if(freq == 1) {
                    i = j;
                    continue;
                }
                String fr = Integer.toString(freq);
                for(int k=0;k<fr.length();k++) {
                    list.add(fr.charAt(k));
                }
                i = j;
            }
        }
        list.add(chars[i]);
        int freq = j - i;
        if (freq > 1) {
            String fr = Integer.toString(freq);
            for (int k = 0; k < fr.length(); k++) {
                list.add(fr.charAt(k));
            }
        }
        for(i=0;i<list.size();i++) {
            chars[i] = list.get(i);
        }
        return list.size();
    }
}