class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<dominoes.length;i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            int key = (a < b) ? a*10 + b : b*10 + a;
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                count = count + map.get(key);
                map.put(key, map.get(key)+1);
            }
        }
        return count;
    }
}