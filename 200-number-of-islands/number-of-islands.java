class Pair {
    int r;
    int c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] drow = {-1, +1, 0, 0};
        int[] dcol = {0, 0, -1, +1};
        int count = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == '1') {
                    count++;
                    bfs(i, j, grid, drow, dcol, n, m);
                }
            }
        }
        return count;
    }
    public void bfs(int row, int col, char[][] grid, int[] drow, int[] dcol, int r, int c) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(row, col));
        while(!q.isEmpty()) {
            int qrow = q.peek().r;
            int qcol = q.peek().c;
            q.poll();
            for(int i=0;i<4;i++) {
                int nrow = drow[i] + qrow;
                int ncol = dcol[i] + qcol;
                if(nrow < r && ncol < c && nrow >=0 && ncol >= 0 && grid[nrow][ncol] == '1') {
                    grid[nrow][ncol] = '0';
                    q.offer(new Pair(nrow, ncol));
                }
            }
        }
    }
}