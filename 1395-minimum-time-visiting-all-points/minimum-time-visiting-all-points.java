class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int startX = points[0][0];
        int startY = points[0][1];
        int res = 0;
        for(int i=1;i<points.length;i++) {
            int x = points[i][0];
            int y = points[i][1];
            res += Math.max(Math.abs(startX - x), Math.abs(startY - y)); // key learning : diagonal is made by adding x + y resultant would be the max of(x, y)
            startX = points[i][0];
            startY = points[i][1];
        }
        return res;
    }
}