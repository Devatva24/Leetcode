class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0;
        int high = position[position.length - 1] - position[0];
        while(low <= high) {
            int mid = (low + high)/2;
            if(canWePlace(position, mid, m)) low = mid + 1;
            else high = mid - 1;
        }
        return high;
    }
    public boolean canWePlace(int[] nums, int dist, int m) {
        int count = 1;
        int last = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i] - last >= dist) {
                count++;
                last = nums[i];
            }
        }
        if(count >= m) return true;
        return false;
    }
}