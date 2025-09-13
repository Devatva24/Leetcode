class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) sum+= arr[i];
        if(sum%2 != 0) return false;
        int K = sum/2;
        boolean[] prev = new boolean[K+1];
        prev[0] = true;
        if (arr[0] <= K) {
            prev[arr[0]] = true;
        }
        for(int i=1;i<arr.length;i++) {
            boolean[] curr = new boolean[K+1];
            curr[0] = true;
            for(int target=1;target<=K;target++) {
                boolean notTake = prev[target];
                boolean take = false;
                if(target >= arr[i]) take = prev[target-arr[i]];
                curr[target] = take | notTake;
            }
            prev = curr;
        }
        return prev[K];
    }
}