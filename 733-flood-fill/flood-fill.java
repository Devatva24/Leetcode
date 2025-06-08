class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int[] drow = {-1, 0, +1, 0}; // check for row(prev, next)
        int[] dcol = {0, 1, 0, -1}; // check for col(prev, next)
        int initialColor = image[sr][sc];
        if (initialColor == color) return image;
        dfs(sr, sc, image, drow, dcol, initialColor, color);
        return image;
    }
    public void dfs(int row, int col, int[][] image, int[] drow, int[] dcol, int initialColor, int color) {
        image[row][col] = color;
        int n = image.length;
        int m = image[0].length;
        for(int i=0;i<4;i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == initialColor) {
                    dfs(nrow, ncol, image, drow, dcol, initialColor, color);
                }
            }
    }
}