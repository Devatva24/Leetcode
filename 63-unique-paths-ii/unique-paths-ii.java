class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] prev = new int[n];
        Arrays.fill(prev, -1);
        for(int i=0;i<m;i++) {
            int[] curr = new int[n];
            Arrays.fill(curr, 0);
            for(int j=0;j<n;j++) {
                if(obstacleGrid[i][j] == 1) {
                    curr[j] = 0;
                } else if(i == 0 && j == 0) {
                    curr[j] = 1;
                } else {
                    int up = i > 0 ? prev[j] : 0;
                    int left = j > 0 ? curr[j-1] : 0;
                    curr[j] = (left + up);
                }
            }
            prev = curr;
        }
        return prev[n-1];
    }
}