class Solution {
    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] drow = {-1, 1, 0, 0};
        int[] dcol = {0, 0, -1, +1};
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(!visited[i][j]) {
                    if(dfs(i, j, visited, drow, dcol, grid, -1, -1)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int row, int col, boolean[][] visited, int[] drow, int[] dcol, char[][] grid, int prow, int pcol) {
        visited[row][col] = true;
        for(int i=0;i<4;i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow < 0 || nrow >= grid.length || ncol < 0 || ncol >= grid[0].length)
                continue;
            if(grid[nrow][ncol] != grid[row][col])
                continue;
            if(!visited[nrow][ncol]) {
                if(dfs(nrow, ncol, visited, drow, dcol, grid, row, col)) return true;
            } else if(prow != nrow || pcol != ncol) return true; // visited as well as parents are not same; or simply preventing cycle within 2 nodes; not visiting the prev node again
        }
        return false;
    }
}