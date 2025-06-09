class Node {
    int first;
    int second;
    int third;
    Node(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] vis = new int[mat.length][mat[0].length];
        Queue<Node> q = new LinkedList<Node>();
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(mat[i][j] == 0) {
                    q.add(new Node(i, j, 0));
                    vis[i][j] = 1;
                }
            }
        }
        int[] drow = {-1, +1, 0, 0};
        int[] dcol = {0, 0, -1, +1};
        while(!q.isEmpty()) {
            int nrow = q.peek().first;
            int ncol = q.peek().second;
            int nval = q.peek().third;
            q.poll();
            mat[nrow][ncol] = nval;
            for(int i=0;i<4;i++) {
                int row = nrow + drow[i];
                int col = ncol + dcol[i];
                if(row >= 0 && row < mat.length && col >=0 && col < mat[0].length && vis[row][col] == 0) {
                    vis[row][col] = 1;
                    q.add(new Node(row, col, nval+1));
                }
            }
        }
        return mat;
    }
}