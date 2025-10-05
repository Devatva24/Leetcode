class Pair {
    int r;
    int c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int r = heights.length;
        int c = heights[0].length;
        boolean[][] visitedP = new boolean[r][c];
        boolean[][] visitedA = new boolean[r][c];
        int[] drow = {-1, +1, 0, 0};
        int[] dcol = {0, 0, -1, +1};
        for(int i=0;i<r;i++) {
            bfs(i, 0, drow, dcol, heights, visitedP);
            bfs(i, c-1, drow, dcol, heights, visitedA);
        }
        for(int j=0;j<c;j++) {
            bfs(0, j, drow, dcol, heights, visitedP);
            bfs(r-1, j, drow, dcol, heights, visitedA);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(visitedP[i][j] && visitedA[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }
    public void bfs(int r, int c, int[] drow, int[] dcol, int[][] heights, boolean[][] visited) {
        int row = heights.length;
        int col = heights[0].length;
        visited[r][c] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r, c));
        while(!q.isEmpty()) {
            int qrow = q.peek().r;
            int qcol = q.peek().c;
            q.poll();
            for(int i=0;i<4;i++) {
                int nrow = qrow + drow[i];
                int ncol = qcol + dcol[i];
                if(nrow >= 0 && nrow < row && ncol >= 0 && ncol < col && !visited[nrow][ncol] && heights[qrow][qcol] <= heights[nrow][ncol]) { // check for elevation in nearby direction so that water can flow
                    visited[nrow][ncol] = true;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }
}