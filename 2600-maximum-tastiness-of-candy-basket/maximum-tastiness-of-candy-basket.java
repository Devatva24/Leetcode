class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = 0;
        int high = price[price.length-1] - price[0];
        while(low <= high) {
            int mid = (low + high)/2;
            if(canBeFormed(price, mid, k)) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }
    public boolean canBeFormed(int[] price, int difference, int k) {
        int count = 1;
        int val = price[0];
        for(int i=1;i<price.length;i++) {
            if(price[i] - val >= difference) {
                count++;
                val = price[i];
            }
        }
        if(count >= k) return true;
        return false;
    }
}