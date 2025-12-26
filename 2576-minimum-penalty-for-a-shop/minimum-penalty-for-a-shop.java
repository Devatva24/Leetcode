class Solution {
    public int bestClosingTime(String customers) {
        int[] prefix = new int[customers.length()+1];
        int[] suffix = new int[customers.length()+1];
        int n = 0;
        for(int i=0;i<customers.length();i++) {
            prefix[i] = n;
            if(customers.charAt(i) == 'N') n++;
        }
        prefix[customers.length()] = n;
        int y = 0;
        for(int i=customers.length()-1;i>=0;i--) {
            if(customers.charAt(i) == 'Y') y++;
            suffix[i] = y;
        }
        int min = Integer.MAX_VALUE;
        int out = 0;
        for(int i=0;i<=customers.length();i++) {
            int val = prefix[i] + suffix[i];
            if(val < min) {
                min = val;
                out = i;
            }
        }
        return out;
    }
}