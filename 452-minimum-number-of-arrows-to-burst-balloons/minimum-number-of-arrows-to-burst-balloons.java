class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int[] prev = points[0];
        int count = 1; // 1 arrow is required to burst the prev or 0th element
        for(int i=1;i<points.length;i++) {
            int[] curr = points[i];
            if(curr[0] > prev[1]) { // non overlapping condition
                count++;
                prev = curr;
            } else { // overlapping condition
                prev[0] = Math.max(prev[0], curr[0]);
                prev[1] = Math.min(prev[1], curr[1]);
            }
        }
        return count;
    }
}