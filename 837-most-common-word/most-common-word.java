class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.replaceAll("[!?',;.]", " ");
        s = s.toLowerCase();
        String[] str = s.split(" ");
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<banned.length;i++) {
            set.add(banned[i]);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<str.length;i++) {
            map.put(str[i], map.getOrDefault(str[i], 0)+1);
        }
        int max = 0;
        String maxS = "";
        for(int i=0;i<str.length;i++) {
            if(!set.contains(str[i]) && map.get(str[i]) > max && !str[i].equals("")) {
                max = map.get(str[i]);
                maxS = str[i];
            }
        }
        return maxS;
    }
}