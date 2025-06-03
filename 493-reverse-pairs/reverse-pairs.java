class Solution {
    public int reversePairs(int[] nums) {
     return mergeSort(0, nums.length-1, nums);
    }
    public int mergeSort(int low, int high, int[] nums) {
        int count = 0;
        if(low < high) {
            int mid = (low + high)/2;
            count += mergeSort(low, mid, nums);
            count += mergeSort(mid+1, high, nums);
            count += merge(low, mid, high, nums);
            return count;
        }
        return count;
    }
    public int merge(int low, int mid, int high, int[] nums) {
        int j = (mid + 1);
        int count = 0;
        for(int i=low;i<=mid;i++) {
            while(j <= high && (long)nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j-(mid+1);
        }
        int left = low;
        int right = mid + 1;
        int[] ans = new int[high - low + 1];
        int index = 0;
        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                ans[index] = nums[left];
                index++;
                left++;
            } else {
                ans[index] = nums[right];
                index++;
                right++;
            }
        }
        while(left <= mid) {
            ans[index] = nums[left];
            index++;
            left++;
        }
        while(right <= high) {
            ans[index] = nums[right];
            index++;
            right++;
        }
        for(int i=low;i<=high;i++) {
            nums[i] = ans[i - low];
        }
        return count;
    }
}