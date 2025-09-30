class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) return a[0] - b[0]; // min-heap by value
                return a[1] - b[1];                   // then by index
            }
        );
        // Keep top k elements
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
            if (pq.size() > k) pq.poll();
        }
        // Collect elements
        List<int[]> list = new ArrayList<>(pq);
        list.sort((a, b) -> a[1] - b[1]); // sort by index to preserve order
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i)[0];
        }
        return ans;
    }
}