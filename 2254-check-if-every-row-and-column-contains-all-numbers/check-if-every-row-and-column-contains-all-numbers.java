class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        // for row
        for(int i=0;i<n;i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            for(int j=0;j<n;j++) {
                set.add(matrix[i][j]);
            }
            if(set.size() != n) return false;
        }
        // for column
        for(int i=0;i<n;i++) {
            HashSet<Integer> set = new HashSet<Integer>();
            for(int j=0;j<n;j++) {
                set.add(matrix[j][i]);
            }
            if(set.size() != n) return false;
        }
        return true;
    }
}