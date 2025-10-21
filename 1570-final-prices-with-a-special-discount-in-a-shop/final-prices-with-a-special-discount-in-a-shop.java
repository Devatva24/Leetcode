class Solution {
    public int[] finalPrices(int[] prices) {
        int ar[] = new int[prices.length];
        for(int i=0;i<prices.length;i++) {
            int flag=0;
            for(int j=i+1;j<prices.length;j++) {
                if(prices[j]<=prices[i]) {
                    ar[i] = prices[i]-prices[j];
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) ar[i] = prices[i];
        }
        return ar;
    }
}