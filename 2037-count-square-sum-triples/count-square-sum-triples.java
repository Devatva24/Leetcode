class Solution {
    public int countTriples(int n) {
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=1;i<=n;i++) {
            set.add(i*i);
        }
        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                int sum = (i * i) + (j * j);
                if(set.contains(sum)) count++;
            }
        }
        return count*2;
    }
}