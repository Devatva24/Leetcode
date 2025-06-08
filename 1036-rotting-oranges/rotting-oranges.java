public class Pair {
    int row;
    int col;
    int tm;
    Pair(int _row, int _col, int _tm) {
        this.row = _row;
        this.col = _col;
        this.tm = _tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m]; // create a visited of n * m
        Queue<Pair> q = new LinkedList<>(); // generate Pair(row, col, level(time))
        int cnt = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0)); //put those oranges in queue who are rotten initially
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1) cnt++; // count the fresh oranges
            }
        }
        int cntO = 0;
        int tm = 0;
        int[] drow = {-1, 0, +1, 0}; // check for row(prev, next)
        int[] dcol = {0, 1, 0, -1}; // check for col(prev, next)
        while(!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm, t);
            q.poll();
            for(int i=0;i<4;i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, t+1));
                    vis[nrow][ncol] = 2;
                    cntO++;
                }
            }
        }
        if(cntO != cnt) return -1;
        return tm;
    }
}