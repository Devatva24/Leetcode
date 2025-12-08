class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i=1;i<=n;i++) {
            int target = i * i;
            int low = 1;
            int high = i-1;
            while(low < high) {
                int val = (low * low) + (high * high);
                if(val == target) {
                    count++;
                    low++;
                    high--;
                }
                else if(val < target) low+=1;
                else high-=1;
            }
        }
        return count * 2;
    }
}