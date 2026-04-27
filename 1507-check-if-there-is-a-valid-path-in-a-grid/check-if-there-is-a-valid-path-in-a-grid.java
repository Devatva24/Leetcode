class Solution {

    int[][] dirs = {
        {-1, 0}, {0, 1}, {1, 0}, {0, -1}
    };

    int[][] type = {
        {},
        {1, 3},
        {0, 2},
        {3, 2},
        {1, 2},
        {3, 0},
        {1, 0}
    };

    public boolean hasValidPath(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        return dfs(grid, 0, 0, vis);
    }

    private boolean dfs(int[][] grid, int r, int c, boolean[][] vis) {
        int n = grid.length, m = grid[0].length;

        if(r == n-1 && c == m-1) return true;

        vis[r][c] = true;

        for(int d : type[grid[r][c]]) {
            int nr = r + dirs[d][0];
            int nc = c + dirs[d][1];

            if(nr < 0 || nc < 0 || nr >= n || nc >= m || vis[nr][nc]) continue;

            // check reverse direction
            for(int back : type[grid[nr][nc]]) {
                if(back == (d + 2) % 4) {
                    if(dfs(grid, nr, nc, vis)) return true;
                }
            }
        }

        return false;
    }
}