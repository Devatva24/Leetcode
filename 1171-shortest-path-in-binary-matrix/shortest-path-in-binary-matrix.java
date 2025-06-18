public class Pair {
    int row;
    int col;
    int dis;
    Pair(int row, int col, int dis) {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        if (grid[0][0] != 0 || grid[n-1][m-1] != 0) return -1;
        int[][] vis = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                vis[i][j] = (int)(1e9);
            }
        }
        vis[0][0] = 1;
        q.add(new Pair(0, 0, 1));
        int[] drow = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dcol = {-1, 0, 1, 1, 1, 0, -1, -1};
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int row = p.row;
            int col = p.col;
            int dis = p.dis;
            if(row == n-1 && col == m-1) break;
            for(int i=0;i<8;i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 0) {
                    if(vis[nrow][ncol] > dis + 1) {
                        vis[nrow][ncol] = dis + 1;
                        q.add(new Pair(nrow, ncol, dis + 1));
                    }
                }
            }
        }
        return vis[n-1][m-1]==1e9?-1:vis[n-1][m-1];
    }
}