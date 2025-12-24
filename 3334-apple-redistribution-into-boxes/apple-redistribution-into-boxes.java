class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i=0;i<apple.length;i++) {
            sum += apple[i];
        }
        Arrays.sort(capacity);
        int i = capacity.length-1;
        int count = 0;
        for(;i>=0;i--) {
            if(capacity[i] >= sum) break;
            sum = sum - capacity[i];
            count++;
        }
        return count+1;
    }
}